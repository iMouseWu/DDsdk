package com.dangdang.sdk.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class BaseResponse implements Serializable {

	private static final long serialVersionUID = -4525009822629065273L;
	protected ErrorResponse errorBO;
	protected ErrorInner errorInner;

	@XmlElement(name = "Error")
	public ErrorInner getErrorInner() {
		return errorInner;
	}

	public void setErrorInner(ErrorInner errorInner) {
		this.errorInner = errorInner;
	}

	public void setErrorBO(ErrorResponse errorBO) {
		this.errorBO = errorBO;
	}

	public String getErrorMsg() {
		if (null != errorBO) {
			return errorBO.getErrorMessage();
		}
		if (null != errorInner) {
			return errorInner.getOperation();
		}
		return "";
	}

	public String getErrorCode() {
		if (null != errorBO) {
			return errorBO.getErrorCode();
		}
		if (null != errorInner) {
			return errorInner.getOperCode();
		}
		return "";
	}
}
