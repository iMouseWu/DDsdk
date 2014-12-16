package com.dangdang.sdk.response.item.modifyitem;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import com.dangdang.sdk.response.BaseResponse;

@XmlRootElement(name = "response")
public class ItemUpdateResponse extends BaseResponse {

	private List<ItemUpdateInfo> itemUpdateInfos;

	@XmlElement(name = "ItemIDInfo")
	@XmlElementWrapper(name = "ItemsIDList")
	public List<ItemUpdateInfo> getItemUpdateInfos() {
		return itemUpdateInfos;
	}

	public void setItemUpdateInfos(List<ItemUpdateInfo> itemUpdateInfos) {
		this.itemUpdateInfos = itemUpdateInfos;
	}

	public String getErrorMsg() {
		if (null != errorBO) {
			return errorBO.getErrorMessage();
		}
		ItemUpdateInfo itemUpdateInfo = itemUpdateInfos.get(0);
		if (StringUtils.isNotBlank(itemUpdateInfo.getOperation())) {
			return itemUpdateInfo.getOperation();
		}
		StringBuilder error = new StringBuilder();
		if (CollectionUtils.isNotEmpty(itemUpdateInfo.getItemSpecialUpdateInfos())) {
			for (ItemSpecialUpdateInfo skuInfo : itemUpdateInfo.getItemSpecialUpdateInfos()) {
				if (!TRUE_CODE.equals(skuInfo.getOperCode())) {
					error.append(skuInfo.getOperation()).append(ERROR_SPLIT);
				}
			}
		}
		return error.toString();
	}

	public String getErrorCode() {
		if (null != errorBO) {
			return errorBO.getErrorCode();
		}
		ItemUpdateInfo itemUpdateInfo = itemUpdateInfos.get(0);
		if (StringUtils.isNotBlank(itemUpdateInfo.getOperCode())) {
			return itemUpdateInfo.getOperCode();
		}
		if (CollectionUtils.isNotEmpty(itemUpdateInfo.getItemSpecialUpdateInfos())) {
			for (ItemSpecialUpdateInfo skuInfo : itemUpdateInfo.getItemSpecialUpdateInfos()) {
				if (!TRUE_CODE.equals(skuInfo.getOperCode())) {
					return skuInfo.getOperCode();
				}
			}
		}
		return TRUE_CODE;
	}
}
