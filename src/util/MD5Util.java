package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

	private static MessageDigest messageDigest;

	/**
	 * 
	 * @param str
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String getMD5String(String str) throws NoSuchAlgorithmException{

	messageDigest =MessageDigest.getInstance("MD5");

	messageDigest.update(str.getBytes());

	String md5String=new BigInteger(1,messageDigest.digest()).toString(16);

	return md5String;

	}
	/**
	 * 计算文件的MD5ֵ
	 * @param file
	 * @return
	 * @throws NoSuchAlgorithmException 
	 * @throws IOException 
	 */
	public static String getMD5FileString(File file) throws NoSuchAlgorithmException, IOException{
		FileInputStream fileInputStream=new FileInputStream(file);
		MessageDigest digest=MessageDigest.getInstance("MD5");
		  byte[] buffer =new byte[4096];
		  int length;
		  while((length=fileInputStream.read(buffer))!=-1){
			  digest.update(buffer, 0, length);
			  
		  }
			
		  BigInteger bigInteger=new BigInteger(1, digest.digest());
		  String str=bigInteger.toString(16);
		return str;
		
	}
	/**
	 * 通过输入流获取MD5
	 * @param inputStream
	 * @return
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 */
	public static String getMD5FileString(InputStream inputStream) throws IOException, NoSuchAlgorithmException{
		
		MessageDigest digest=MessageDigest.getInstance("MD5");
		  byte[] buffer =new byte[4096];
		  int length;
		  while((length=inputStream.read(buffer))!=-1){
			  digest.update(buffer, 0, length);
			  
		  }
			
		  BigInteger bigInteger=new BigInteger(1, digest.digest());
		  String str=bigInteger.toString(16);
		  return str;
	}
	/**
	 *通过文件路径计算MD5的值
	 * @param filePath
	 * @return
	 * @throws NoSuchAlgorithmException 
	 * @throws IOException 
	 */
	public static String getMD5FileString(String filePath) throws NoSuchAlgorithmException, IOException{
	FileInputStream fileInputStream=new FileInputStream(filePath);
		
		if (fileInputStream!=null) {
			System.out.println(fileInputStream.toString());
			
			
		}
		MessageDigest digest=MessageDigest.getInstance("MD5");
	  byte[] buffer =new byte[4096];
	  int length;
	  while((length=fileInputStream.read(buffer))!=-1){
		  digest.update(buffer, 0, length);
		  
	  }
		
	  BigInteger bigInteger=new BigInteger(1, digest.digest());
	  String str=bigInteger.toString(16);
	  System.out.println(str);
	return str;
		
		
	}

}
