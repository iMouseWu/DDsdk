package com.dangdang.sdk.response.item.additem;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.dangdang.sdk.response.shop.BaseResponse;

@XmlRootElement(name = "response")
public class ItemResponse extends BaseResponse {

	private Result result;

	@XmlElement(name = "Result")
	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public String getErrorMsg() {
		if (null != errorBO) {
			return errorBO.getErrorMessage();
		}
		return result.getItemIDInfos().get(0).getOperation();
	}

	public String getErrorCode() {
		if (null != errorBO) {
			return errorBO.getErrorMessage();
		}
		return result.getItemIDInfos().get(0).getOperCode();
	}

}
