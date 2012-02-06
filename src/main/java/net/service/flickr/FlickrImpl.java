package net.service.flickr;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import java.util.Observable;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.MultipartPostMethod;

public class FlickrImpl extends Observable {

    private static final String BASE_URL = "http://www.flickr.com/services/rest/";
    private static final String FLICKR_REST_REQUEST = "http://api.flickr.com/services/rest/";
    private static final String FLICKR_UPLOAD_URL = "http://api.flickr.com/services/upload/";
    private static final String FLICKR_SEARCH = "flickr.photos.search";
    private static final String FLICKR_GET_FROB = "flickr.auth.getFrob";
    private static final String FLICKR_GET_TOKEN = "flickr.auth.getToken";
    private static final String FLICKR_FIND_BY_USERNAME = "flickr.people.findByUsername";
    private static final String FLICKR_FIND_BY_EMAIL = "flickr.people.findByEmail";
    private static final String FLICKR_GET_INFO_PEOPLE = "flickr.people.getInfo";
    private static final String FLICKR_GET_GROUPS = "flickr.people.getPublicGroups";
    private static final String PACKAGE_FLICKR_PROJECT = "net.service.flickr";
    private static final String URL_ENCODING = "ISO-8859-1";
    private static final String METHOD_FAILED = "Method failed: ";

    public FlickrImpl() {
    }

    public Rsp getPhotos(String key, String user_id, String tags) {

        PostMethod pmethod = new PostMethod(BASE_URL);
        pmethod.addParameter("method", FLICKR_SEARCH);
        pmethod.addParameter("api_key", key);
        pmethod.addParameter("tags", tags);

        Rsp resp = doHttpPost(pmethod);
        return resp;
    }

    // build the list of photos' url from a list of Photos
    public List<String> buildUrlList(List<Photo> photos)
            throws UnsupportedEncodingException {

        List<String> urlList = new ArrayList<String>();
        for (Photo elt : photos) {
            String url = MessageFormat.format(
                    "http://farm{0}.static.flickr.com/{1}/{2}_{3}.jpg",
                    new Object[]{
                        URLEncoder.encode(String.valueOf(elt.getFarm()),
                        URL_ENCODING),
                        URLEncoder.encode(String.valueOf(elt.getServer()),
                        URL_ENCODING),
                        URLEncoder.encode(elt.getId(), URL_ENCODING),
                        URLEncoder.encode(elt.getSecret(), URL_ENCODING)});
            urlList.add(url);
        }
        return urlList;
    }

    // _____________________________________________________________//
    // __________________ PART TWO OF PROJECT _____________________
    // _____________________________________________________________//
    // get the frob (ID) to be authenticated to flickr apps
    public Rsp getFrob(String api_key, String secret) {

        // get the signature
        String api_sig = MD5.encode(secret + "api_key" + api_key + "method"
                + FLICKR_GET_FROB);

        String request = FLICKR_REST_REQUEST;
        // the name of the method
        String method = FLICKR_GET_FROB;

        PostMethod pmethod = new PostMethod(request);

        pmethod.addParameter("method", method);
        pmethod.addParameter("api_key", api_key);
        pmethod.addParameter("api_sig", api_sig);

        // execute the httpPost request and return the result
        Rsp resp = doHttpPost(pmethod);
        return resp;
    }

    // get the url that permit to authenticate to flickr account
    public String getUrlAuth(String api_key, String secret, String frob) {

        String url = null; // to be returned
        String api_sig = MD5.encode(secret + "api_key" + api_key + "frob"
                + frob + "permswrite");

        try {
            url = MessageFormat.format("http://flickr.com/services/auth?api_key={0}&perms=write&frob={1}&api_sig={2}",
                    new Object[]{
                        URLEncoder.encode(api_key, URL_ENCODING),
                        URLEncoder.encode(frob, URL_ENCODING),
                        URLEncoder.encode(api_sig, URL_ENCODING)});

        } catch (UnsupportedEncodingException e) {
            System.out.println("---- Error Encoding ----");
            e.printStackTrace();
        }

        return url;
    }

    // get Token after generate the frob id and validate it
    public Rsp getToken(String api_key, String secret, String frob) {

        // request of the method
        String request = null;

        // get the signature
        String api_sig = MD5.encode(secret + "api_key" + api_key + "frob"
                + frob + "method" + FLICKR_GET_TOKEN);

        try {
            request = MessageFormat.format("http://api.flickr.com/services/rest/?method=flickr.auth.getToken&api_key={0}&frob={1}&api_sig={2}",
                    new Object[]{
                        URLEncoder.encode(api_key, URL_ENCODING),
                        URLEncoder.encode(frob, URL_ENCODING),
                        URLEncoder.encode(api_sig, URL_ENCODING)});

        } catch (UnsupportedEncodingException e) {
            System.out.println("---- Error Encoding ----");
            e.printStackTrace();
        }

        // create the get http method with the requested url
        GetMethod method = new GetMethod(request);
        // execute the GetMethod and get the result
        Rsp resp = doHttpGet(method);

        return resp;
    }

    // upload a photo to the flickr account using the token
    public boolean uploadPhotos(String api_key, String secret, String title,
            String description, String tags, String photo, String auth_token) {

        // url of the requested method
        String request = FLICKR_UPLOAD_URL;
        File filePhotoToUpload = null;

        String api_sig = MD5.encode(secret + "api_key" + api_key + "auth_token"
                + auth_token + "description" + description + "tags" + tags
                + "title" + title);

        MultipartPostMethod pmethod = new MultipartPostMethod(request);
        try {

            filePhotoToUpload = new File(photo);
            pmethod.addParameter("api_key", api_key);
            pmethod.addParameter("api_sig", api_sig);
            pmethod.addParameter("auth_token", auth_token);
            pmethod.addParameter("description", description);
            pmethod.addParameter("tags", tags);
            pmethod.addParameter("title", title);
            pmethod.addParameter("photo", filePhotoToUpload);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Rsp resp = doHttpMultiPartPost(pmethod);
        // if the result response is an Error, return unsuccessful upload
        if (resp.getAny() instanceof Err) {
            return false;
        }
        return true;
    }

    // get the username of account user's from the api_key and username
    public Rsp findByUsername(String api_key, String username) {

        Rsp resp = null;

        PostMethod pmethod = new PostMethod(BASE_URL);
        pmethod.addParameter("method", FLICKR_FIND_BY_USERNAME);
        pmethod.addParameter("api_key", api_key);
        pmethod.addParameter("username", username);

        resp = doHttpPost(pmethod);

        return resp;
    }

    // get the username of account user's from the api_key and email of the
    // account
    public Rsp findByEmail(String api_key, String email) {

        Rsp resp = null;

        PostMethod pmethod = new PostMethod(BASE_URL);
        pmethod.addParameter("method", FLICKR_FIND_BY_EMAIL);
        pmethod.addParameter("api_key", api_key);
        pmethod.addParameter("find_email", email);

        resp = doHttpPost(pmethod);

        return resp;
    }

    // get all information about a person from the user_id of the account
    public Rsp getInfoUser(String api_key, String user_id) {

        Rsp resp = null;

        PostMethod pmethod = new PostMethod(BASE_URL);
        pmethod.addParameter("method", FLICKR_GET_INFO_PEOPLE);
        pmethod.addParameter("api_key", api_key);
        pmethod.addParameter("user_id", user_id); // NSID of the user

        resp = doHttpPost(pmethod);

        return resp;
    }

    // get all the groups of the user (given as user_id)
    public Rsp getPublicGroups(String api_key, String user_id) {

        Rsp resp = null;

        PostMethod pmethod = new PostMethod(BASE_URL);
        pmethod.addParameter("method", FLICKR_GET_GROUPS);
        pmethod.addParameter("api_key", api_key);
        pmethod.addParameter("user_id", user_id); // NSID of the user

        resp = doHttpPost(pmethod);

        return resp;
    }

    private Rsp doHttpPost(PostMethod method) {

        Rsp result = null;
        InputStream rstream;
        JAXBContext context;
        HttpClient client = new HttpClient();

        try {
            int statusCode = client.executeMethod(method);
            if (statusCode != HttpStatus.SC_OK) {
                System.err.println(METHOD_FAILED + method.getStatusLine());
            }

            rstream = method.getResponseBodyAsStream();
            context = JAXBContext.newInstance(PACKAGE_FLICKR_PROJECT);
            Unmarshaller u = context.createUnmarshaller();
            result = (Rsp) u.unmarshal(rstream);

            // if the resp is an error throw FlickrException
            controlResponse(result);

            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
            m.marshal(result, System.out);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    private Rsp doHttpGet(GetMethod method) {

        Rsp result = null;
        InputStream rstream;
        JAXBContext context;
        HttpClient client = new HttpClient();

        try {
            int statusCode = client.executeMethod(method);
            if (statusCode != HttpStatus.SC_OK) {
                System.err.println(METHOD_FAILED + method.getStatusLine());
            }

            rstream = method.getResponseBodyAsStream();
            context = JAXBContext.newInstance(PACKAGE_FLICKR_PROJECT);
            Unmarshaller u = context.createUnmarshaller();
            result = (Rsp) u.unmarshal(rstream);

            // if the response is an error throw FlickrException
            controlResponse(result);

            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
            m.marshal(result, System.out);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    private Rsp doHttpMultiPartPost(MultipartPostMethod method) {

        Rsp result = null;
        InputStream rstream;
        JAXBContext context;

        try {
            HttpClient client = new HttpClient();
            int statusCode = client.executeMethod(method);
            if (statusCode != HttpStatus.SC_OK) {
                System.err.println(METHOD_FAILED + method.getStatusLine());
            }

            rstream = method.getResponseBodyAsStream();
            context = JAXBContext.newInstance(PACKAGE_FLICKR_PROJECT);
            Unmarshaller u = context.createUnmarshaller();
            result = (Rsp) u.unmarshal(rstream);

            // if the resp is an error throw FlickrException
            controlResponse(result);

            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
            m.marshal(result, System.out);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    private void controlResponse(Rsp rsp) {

        if (rsp.getAny() instanceof Err) {
            Err error = (Err) rsp.getAny();
            setChanged();
            notifyObservers(error.getMsg());
            throw new FlickrException(error.getMsg());
        }
    }
}
