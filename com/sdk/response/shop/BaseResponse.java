package com.dangdang.sdk.response.shop;

public class BaseResponse {

	protected ErrorResponse errorBO;

	public void setErrorBO(ErrorResponse errorBO) {
		this.errorBO = errorBO;
	}

	public String getErrorMsg() {
		if (null != errorBO) {
			return errorBO.getErrorMessage();
		}
		return "";
	}

	public String getErrorCode() {
		if (null != errorBO) {
			return errorBO.getErrorCode();
		}
		return "";
	}
}
