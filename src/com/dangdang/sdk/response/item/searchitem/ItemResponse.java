package com.dangdang.sdk.response.item.searchitem;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class ItemResponse {

	private ItemDetail itemDetail;

	@XmlElement(name = "ItemDetail")
	public ItemDetail getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

}
