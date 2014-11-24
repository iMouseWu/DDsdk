package com.dangdang.sdk.response.shop;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "errorResponse")
public class ErrorResponse {

	private String errorCode;
	private String errorMessage;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
