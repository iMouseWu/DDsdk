package com.dangdang.sdk.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

	/**
	 * 32位大写
	 * 
	 * @param info
	 * @return
	 */
	public static String gain32CapitalMD5(String info) {
		String result = null;
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			result = byteArrayToHexString(messageDigest.digest(info.getBytes()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return result;
	}

	private static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	/** 将一个字节转化成十六进制形式的字符串 */
	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0) n = 256 + n;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	public static void main(String[] args) {
		System.out
				.println(gain32CapitalMD5("5FDD35D3A94D73514CD6F1A5B58AED53app_key2100000826formatxmlmethoddangdang.item.itemid.getsession4ECBED3068CB782DC287FACCD52E06AB6E6F1CB4C63EF3372AC7CD88FE34C063sign_methodmd5timestamp2013-05-06 13:52:03v1.05FDD35D3A94D73514CD6F1A5B58AED53"));
	}
}
