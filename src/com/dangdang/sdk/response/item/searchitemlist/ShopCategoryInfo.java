package com.dangdang.sdk.response.item.searchitemlist;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "shopCategoryInfo")
public class ShopCategoryInfo {

	private String shopCategoryID;
	private String shopCategoryName;

	public String getShopCategoryID() {
		return shopCategoryID;
	}

	public void setShopCategoryID(String shopCategoryID) {
		this.shopCategoryID = shopCategoryID;
	}

	public String getShopCategoryName() {
		return shopCategoryName;
	}

	public void setShopCategoryName(String shopCategoryName) {
		this.shopCategoryName = shopCategoryName;
	}

}
