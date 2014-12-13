package com.dangdang.sdk.request.item.modifyitem;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "request")
public class ItemUpdateRequest {

	private List<ItemUpadteInfo> itemUpadteInfos;

	@XmlElement(name = "ItemUpadteInfo")
	@XmlElementWrapper(name = "ItemsList")
	public List<ItemUpadteInfo> getItemUpadteInfos() {
		return itemUpadteInfos;
	}

	public void setItemUpadteInfos(List<ItemUpadteInfo> itemUpadteInfos) {
		this.itemUpadteInfos = itemUpadteInfos;
	}

}
