package com.dangdang.sdk.response.item.modifyitem;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.dangdang.sdk.response.BaseResponse;

@XmlRootElement(name = "response")
public class ItemStatusUpdateResponse extends BaseResponse {

	private List<ItemIDInfo> itemIDInfos;
	private final String GOODSSTATUE_CODE = "1000";

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
		StringBuilder error = new StringBuilder();
		for (ItemIDInfo itemIDInfo : itemIDInfos) {
			String operCode = itemIDInfo.getOperCode();
			if (!TRUE_CODE.equals(operCode) && !GOODSSTATUE_CODE.equals(operCode)) {
				error.append(itemIDInfo.getOperation()).append(ERROR_SPLIT);
			}
		}
		return error.toString();
	}

	public String getErrorCode() {
		if (null != errorBO) {
			return errorBO.getErrorCode();
		}
		for (ItemIDInfo itemIDInfo : itemIDInfos) {
			String operCode = itemIDInfo.getOperCode();
			if (!TRUE_CODE.equals(operCode) && !GOODSSTATUE_CODE.equals(operCode)) {
				return operCode;
			}
		}
		return TRUE_CODE;
	}
}
