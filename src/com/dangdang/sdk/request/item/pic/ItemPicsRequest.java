package com.dangdang.sdk.request.item.pic;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "request")
public class ItemPicsRequest {

	private List<ItemPicsInfo> itemPicsInfos;

	@XmlElement(name = "ProductPicsInfo")
	@XmlElementWrapper(name = "PicsList")
	public List<ItemPicsInfo> getItemPicsInfos() {
		return itemPicsInfos;
	}

	public void setItemPicsInfos(List<ItemPicsInfo> itemPicsInfos) {
		this.itemPicsInfos = itemPicsInfos;
	}

}
