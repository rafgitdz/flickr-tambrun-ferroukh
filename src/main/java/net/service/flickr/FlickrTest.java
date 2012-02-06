package net.service.flickr;

import java.io.UnsupportedEncodingException;
import java.util.List;

public class FlickrTest {

    private static final String API_KEY = "cf0921f8a0ced5c34d01bda591b108b7";
    private static final String SECRET = "d3b639a2896bad13";
    private static final String TAG = "chat";
    private static final String USER_ID = "";

    public static void main(String[] args) {

        // new FlickrTest().testGetForb();
        // new FlickrTest().testGetUrlAuth();
        // new FlickrTest().testGetToken();
        // new FlickrTest().testUploadPhoto();
        // new FlickrTest().testFindByUsername();
        // new FlickrTest().testFindByEmail();
        // new FlickrTest().testGetInfoUser();
        // new FlickrTest().testGetPublicGroups();
        new FlickrTest().testGUIFlickr();
    }

    private void testGetPhotos() {

        FlickrImpl impl = new FlickrImpl();
        Rsp rsp = impl.getPhotos(API_KEY, USER_ID, TAG);
        if (rsp.getStat().equals("fail")) {
            Err err = (Err) rsp.getAny();
            System.out.println("\nLa requete a echouee!\nCode: "
                    + err.getCode() + "\nMessage: " + err.getMsg() + "\n");
        } else {
            Photos photos = (Photos) rsp.getAny();
            System.out.println("\nNombre total de photos: " + photos.getTotal()
                    + "\n");
            List<Photo> photo_list = photos.getPhoto();

            try {
                List<String> urlList = impl.buildUrlList(photo_list);
                for (int i = 0; i < photo_list.size() && i < 10; i++) {
                    System.out.println(urlList.get(i));
                }
            } catch (UnsupportedEncodingException uee) {
                uee.printStackTrace();
            }
        }
    }

    private void testGetForb() {

        FlickrImpl appFlickr = new FlickrImpl();
        Rsp rsp = appFlickr.getFrob(API_KEY, SECRET);

        if (rsp.getStat().equals("fail")) {

            Err err = (Err) rsp.getAny();
            System.out.println("\nRequest failed \nCode: " + err.getCode()
                    + "\nMessage: " + err.getMsg() + "\n");
        } else {
            try {
                System.out.println("\nFrob : "
                        + ((Frob) rsp.getAny()).getValue());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void testGetUrlAuth() {

        FlickrImpl appFlickr = new FlickrImpl();

        String frob = ((Frob) (appFlickr.getFrob(API_KEY, SECRET).getAny())).getValue();
        System.out.println("Browse to the following flickr url to authenticate yourself");
        System.out.println(appFlickr.getUrlAuth(API_KEY, SECRET, frob));

        // validate the url
        System.out.println("Wait 20s");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("OK");
    }

    private void testGetToken() {

        FlickrImpl appFlickr = new FlickrImpl();

        String frob = ((Frob) (appFlickr.getFrob(API_KEY, SECRET).getAny())).getValue();
        System.out.println("Frob : " + frob);

        String url = appFlickr.getUrlAuth(API_KEY, SECRET, frob);
        System.out.println("URL = " + url);

        System.out.println("Wait 20s");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("OK");

        appFlickr.getToken(API_KEY, SECRET, frob);
    }

    private void testUploadPhoto() {

        FlickrImpl appFlickr = new FlickrImpl();

        Rsp rsp = appFlickr.getFrob(API_KEY, SECRET);

        String frob = ((Frob) (rsp.getAny())).getValue();
        String url = appFlickr.getUrlAuth(API_KEY, SECRET, frob);
        System.out.println(url);

        System.out.println("Wait 20s");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("OK");

        Rsp respToken = appFlickr.getToken(API_KEY, SECRET, frob);
        String token = ((Auth) (respToken.getAny())).getToken();
        System.out.println("Token : " + token);

        if (appFlickr.uploadPhotos(API_KEY, SECRET, "MyPictureTest",
                "MyTest is ok !", "TestFlickrApp",
                "src/main/resources/monster.jpg", token)) {
            System.out.println("\nSuccessful upload !!!");
        } else {
            System.out.println("\nFail to upload !!!");
        }
    }

    private void testFindByUsername() {

        new FlickrImpl().findByUsername(API_KEY, "rferrouk");
    }

    private void testFindByEmail() {

        new FlickrImpl().findByEmail(API_KEY, "ferroukh.rafik@gmail.com");
    }

    private void testGetInfoUser() {

        FlickrImpl appFlickr = new FlickrImpl();
        String user_id = ((User) appFlickr.findByUsername(API_KEY, "rferrouk").getAny()).getNsid();
        appFlickr.getInfoUser(API_KEY, user_id);
    }

    private void testGetPublicGroups() {

        FlickrImpl appFlickr = new FlickrImpl();
        String user_id = ((User) appFlickr.findByUsername(API_KEY, "rferrouk").getAny()).getNsid();
        appFlickr.getPublicGroups(API_KEY, user_id);
    }

    private void testGUIFlickr() {
        new FlickrAppGUI().setVisible(true);
    }
}
