package com.dangdang.sdk.response.item.additem;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class ItemResponse {

	private List<ItemIDInfo> itemIDInfos;

	@XmlElement(name = "ItemIDInfo")
	@XmlElementWrapper(name = "ItemsIDList")
	public List<ItemIDInfo> getItemIDInfos() {
		return itemIDInfos;
	}

	public void setItemIDInfos(List<ItemIDInfo> itemIDInfos) {
		this.itemIDInfos = itemIDInfos;
	}

}
