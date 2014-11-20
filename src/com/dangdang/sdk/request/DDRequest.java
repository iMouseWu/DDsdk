package com.dangdang.sdk.request;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class DDRequest {

	private Map<String, String> params;
	private Map<String, FileItem> fileParams;

	public Map<String, String> getParams() {
		if (null == params) {
			params = new HashMap<String, String>();
		}
		return params;
	}

	public void setParams(String key, String value) {
		if (null == params) {
			params = new HashMap<String, String>();
		}
		params.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		return fileParams;
	}

	public void setFileParams(String key, File file) {
		FileItem fileItem = new FileItem(file);
		if (null == fileParams) {
			fileParams = new HashMap<String, FileItem>();
		}
		fileParams.put(key, fileItem);
	}

	public void clear() {
		this.params = null;
		this.fileParams = null;
	}

}
