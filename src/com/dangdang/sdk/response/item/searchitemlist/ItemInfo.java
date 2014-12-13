package com.dangdang.sdk.response.item.searchitemlist;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ItemInfo")
public class ItemInfo {

	private String itemID;
	private String itemName;
	private String itemSubhead;
	private String unitPrice;
	private String stockCount;
	private List<ShopCategoryInfo> shopCategoryInfos;
	private String itemState;
	private String updateTime;
	private String outerItemID;
	private String ty;
	private String datetype;

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

	public String getItemSubhead() {
		return itemSubhead;
	}

	public void setItemSubhead(String itemSubhead) {
		this.itemSubhead = itemSubhead;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getStockCount() {
		return stockCount;
	}

	public void setStockCount(String stockCount) {
		this.stockCount = stockCount;
	}

	@XmlElement(name = "shopCategoryInfo")
	@XmlElementWrapper(name = "shopCategoryList")
	public List<ShopCategoryInfo> getShopCategoryInfos() {
		return shopCategoryInfos;
	}

	public void setShopCategoryInfos(List<ShopCategoryInfo> shopCategoryInfos) {
		this.shopCategoryInfos = shopCategoryInfos;
	}

	public String getItemState() {
		return itemState;
	}

	public void setItemState(String itemState) {
		this.itemState = itemState;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getOuterItemID() {
		return outerItemID;
	}

	public void setOuterItemID(String outerItemID) {
		this.outerItemID = outerItemID;
	}

	public String getTy() {
		return ty;
	}

	public void setTy(String ty) {
		this.ty = ty;
	}

	public String getDatetype() {
		return datetype;
	}

	public void setDatetype(String datetype) {
		this.datetype = datetype;
	}

}
