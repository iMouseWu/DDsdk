package com.dangdang.sdk.response.item.modifyitem;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class Result {

	private List<ItemUpdateInfo> itemUpdateInfos;

	@XmlElement(name = "ItemIDInfo")
	@XmlElementWrapper(name = "ItemsIDList")
	public List<ItemUpdateInfo> getItemUpdateInfos() {
		return itemUpdateInfos;
	}

	public void setItemUpdateInfos(List<ItemUpdateInfo> itemUpdateInfos) {
		this.itemUpdateInfos = itemUpdateInfos;
	}
}
