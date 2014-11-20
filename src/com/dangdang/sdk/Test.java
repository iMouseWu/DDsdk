package com.dangdang.sdk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\b.xml");
		StringBuilder stringBuilder = new StringBuilder();
		InputStream impuStream = new FileInputStream(file);
		BufferedReader reader = new BufferedReader(new InputStreamReader(impuStream, "gb2312"));
		String str = null;
		while (null != (str = reader.readLine())) {
			stringBuilder.append(str);
		}
		reader.close();

	}
}
