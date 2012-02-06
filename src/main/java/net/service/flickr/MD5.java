package net.service.flickr;
import java.math.BigInteger; //MD5
import java.security.MessageDigest; //MD5

public class MD5 {
    public static String encode(String text) {
	String md5 = "";
	try {
	    MessageDigest digest = MessageDigest.getInstance("MD5");
	    md5 = new BigInteger(1, digest.digest((text).getBytes()))
		.toString(16);
	} catch (Exception e) {
	    System.out.println("Error in call to MD5");
	}
	
	if (md5.length() == 31) {
	    md5 = "0" + md5;
	}
	return md5;
    }	       
}		
