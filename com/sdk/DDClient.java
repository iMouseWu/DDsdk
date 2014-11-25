package com.dangdang.sdk;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.dangdang.sdk.request.DDRequest;
import com.dangdang.sdk.request.FileItem;
import com.dangdang.sdk.utils.MD5;
import com.dangdang.sdk.utils.WebUtils;

public class DDClient {

	private final String version = "1.0";
	private final String format = "xml";
	private final String signMethod = "md5";
	private final String pattern = "yyyy-MM-dd HH:mm:ss";
	private final String host = "http://api.open.dangdang.com/openapi/rest";
	private String appKey;
	private String appSecret;
	private String sessionKey;

	public DDClient(String appKey, String appSecret, String sessionKey){
		this.appKey = appKey;
		this.appSecret = appSecret;
		this.sessionKey = sessionKey;
	}

	private String makeSign(String method, String timestamp) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(appSecret);
		stringBuilder.append("app_key").append(appKey);
		stringBuilder.append("format").append(format);
		stringBuilder.append("method").append(method);
		stringBuilder.append("session").append(sessionKey);
		stringBuilder.append("sign_method").append(signMethod);
		stringBuilder.append("timestamp").append(timestamp);
		stringBuilder.append("v").append(version);
		stringBuilder.append(appSecret);
		return MD5.gain32CapitalMD5(stringBuilder.toString());
	}

	private String getTimestamp() {
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		return formatter.format(d);
	}

	public String execute(String method) throws IOException {
		return execute(null, method);
	}

	public String execute(DDRequest request, String method) throws IOException {
		Map<String, String> params = new HashMap<String, String>();
		Map<String, FileItem> fileParams = new HashMap<String, FileItem>();
		if (null != request) {
			params = request.getParams();
			fileParams = request.getFileParams();
		}
		Map<String, String> urlParams = new HashMap<String, String>();
		Set<Entry<String, String>> paramsEntrySet = params.entrySet();
		for (Entry<String, String> paramsEntry : paramsEntrySet) {
			String name = paramsEntry.getKey();
			String value = paramsEntry.getValue();
			urlParams.put(name, new String(value));
		}
		String timestamp = getTimestamp();
		String sign = makeSign(method, timestamp);
		urlParams.put("sign", sign);
		System.out.println(sign);
		urlParams.put("v", version);
		urlParams.put("sign_method", signMethod);
		urlParams.put("timestamp", timestamp);
		System.out.println(timestamp);
		urlParams.put("app_key", appKey);
		urlParams.put("method", method);
		urlParams.put("format", format);
		urlParams.put("session", sessionKey);
		return WebUtils.doPost(host, urlParams, fileParams);
	}
}
