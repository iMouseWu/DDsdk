package com.dangdang.sdk.request.item.modifyitem;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ProductInfo")
public class ProductInfo {

	private String itemID;
	private String productStatus;

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

}
