package com.dangdang.sdk.response.item.modifyitem;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.dangdang.sdk.response.BaseResponse;

@XmlRootElement(name = "response")
public class ItemStatusUpdateResponse extends BaseResponse {

	private List<ItemIDInfo> itemIDInfos;

	@XmlElement(name = "ItemIDInfo")
	@XmlElementWrapper(name = "ItemsIDList")
	public List<ItemIDInfo> getItemIDInfos() {
		return itemIDInfos;
	}

	public void setItemIDInfos(List<ItemIDInfo> itemIDInfos) {
		this.itemIDInfos = itemIDInfos;
	}

	public String getErrorMsg() {
		if (null != errorBO) {
			return errorBO.getErrorMessage();
		}
		return itemIDInfos.get(0).getOperation();
	}

	public String getErrorCode() {
		if (null != errorBO) {
			return errorBO.getErrorCode();
		}
		return itemIDInfos.get(0).getOperCode();
	}
}
