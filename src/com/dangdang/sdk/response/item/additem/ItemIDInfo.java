package com.dangdang.sdk.response.item.additem;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ItemIDInfo")
public class ItemIDInfo {

	private String outerItemID;
	private String itemID;
	private String itemName;
	private List<ItemSkuIDInfo> itemSkuIDInfos;

	@XmlElement(name = "SpecialItemInfo")
	public List<ItemSkuIDInfo> getItemSkuIDInfos() {
		return itemSkuIDInfos;
	}

	public void setItemSkuIDInfos(List<ItemSkuIDInfo> itemSkuIDInfos) {
		this.itemSkuIDInfos = itemSkuIDInfos;
	}

	public String getOuterItemID() {
		return outerItemID;
	}

	public void setOuterItemID(String outerItemID) {
		this.outerItemID = outerItemID;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
