package com.dangdang.sdk.response.item.searchitem;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ItemDetail")
public class ItemDetail {

	private String itemID;
	private String itemBarcod;
	private String itemName;
	private String itemSubhead;
	private String classificationCode1;
	private String classificationCode2;
	private String brand;
	private String model;
	private String attribute;
	private String itemDetail;
	private String stockPrice;
	private String marketPrice;
	private String vipPriceType;
	private String shopCategoryID1;
	private String shopCategoryID2;
	private String shopCategoryID3;
	private String shopCategoryID4;
	private String shopCategoryID5;
	private String itemState;
	private String is_cod;
	private String itemType;
	private String outerItemID;
	private String unitPrice;
	private String stockCount;
	private String bestPartnerList;
	private String volume;
	private String weight;
	private String templateName;
	private String pic1;
	private String pic2;
	private String pic3;
	private String pic4;
	private String pic5;
	private String pic6;
	private String pic7;
	private String pic8;
	private List<SpecilaItemInfo> specilaItemInfos;

	public String getOuterItemID() {
		return outerItemID;
	}

	public void setOuterItemID(String outerItemID) {
		this.outerItemID = outerItemID;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getBestPartnerList() {
		return bestPartnerList;
	}

	public void setBestPartnerList(String bestPartnerList) {
		this.bestPartnerList = bestPartnerList;
	}

	public String getStockCount() {
		return stockCount;
	}

	public void setStockCount(String stockCount) {
		this.stockCount = stockCount;
	}

	public String getShopCategoryID3() {
		return shopCategoryID3;
	}

	public void setShopCategoryID3(String shopCategoryID3) {
		this.shopCategoryID3 = shopCategoryID3;
	}

	public String getShopCategoryID4() {
		return shopCategoryID4;
	}

	public void setShopCategoryID4(String shopCategoryID4) {
		this.shopCategoryID4 = shopCategoryID4;
	}

	public String getShopCategoryID5() {
		return shopCategoryID5;
	}

	public void setShopCategoryID5(String shopCategoryID5) {
		this.shopCategoryID5 = shopCategoryID5;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getItemBarcod() {
		return itemBarcod;
	}

	public void setItemBarcod(String itemBarcod) {
		this.itemBarcod = itemBarcod;
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

	public String getClassificationCode1() {
		return classificationCode1;
	}

	public void setClassificationCode1(String classificationCode1) {
		this.classificationCode1 = classificationCode1;
	}

	public String getClassificationCode2() {
		return classificationCode2;
	}

	public void setClassificationCode2(String classificationCode2) {
		this.classificationCode2 = classificationCode2;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}

	public String getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}

	public String getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getVipPriceType() {
		return vipPriceType;
	}

	public void setVipPriceType(String vipPriceType) {
		this.vipPriceType = vipPriceType;
	}

	public String getShopCategoryID1() {
		return shopCategoryID1;
	}

	public void setShopCategoryID1(String shopCategoryID1) {
		this.shopCategoryID1 = shopCategoryID1;
	}

	public String getShopCategoryID2() {
		return shopCategoryID2;
	}

	public void setShopCategoryID2(String shopCategoryID2) {
		this.shopCategoryID2 = shopCategoryID2;
	}

	public String getItemState() {
		return itemState;
	}

	public void setItemState(String itemState) {
		this.itemState = itemState;
	}

	public String getIs_cod() {
		return is_cod;
	}

	public void setIs_cod(String is_cod) {
		this.is_cod = is_cod;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getPic1() {
		return pic1;
	}

	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}

	public String getPic2() {
		return pic2;
	}

	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}

	public String getPic3() {
		return pic3;
	}

	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}

	public String getPic4() {
		return pic4;
	}

	public void setPic4(String pic4) {
		this.pic4 = pic4;
	}

	public String getPic5() {
		return pic5;
	}

	public void setPic5(String pic5) {
		this.pic5 = pic5;
	}

	public String getPic6() {
		return pic6;
	}

	public void setPic6(String pic6) {
		this.pic6 = pic6;
	}

	public String getPic7() {
		return pic7;
	}

	public void setPic7(String pic7) {
		this.pic7 = pic7;
	}

	public String getPic8() {
		return pic8;
	}

	public void setPic8(String pic8) {
		this.pic8 = pic8;
	}

	@XmlElement(name = "SpecilaItemInfo")
	public List<SpecilaItemInfo> getSpecilaItemInfos() {
		return specilaItemInfos;
	}

	public void setSpecilaItemInfos(List<SpecilaItemInfo> specilaItemInfos) {
		this.specilaItemInfos = specilaItemInfos;
	}

}
