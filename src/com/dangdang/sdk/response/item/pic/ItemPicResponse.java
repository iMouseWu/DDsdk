package com.dangdang.sdk.response.item.pic;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class ItemPicResponse {

	private List<ItemPicIdInfo> itemIDInfos;

	@XmlElement(name = "itemIDInfo")
	@XmlElementWrapper(name = "ItemsIDList")
	public List<ItemPicIdInfo> getItemIDInfos() {
		return itemIDInfos;
	}

	public void setItemIDInfos(List<ItemPicIdInfo> itemIDInfos) {
		this.itemIDInfos = itemIDInfos;
	}

}
