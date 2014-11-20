package com.dangdang.sdk.request.item.pic;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ProductPicsInfo")
public class ItemPicsInfo {

	private String itemID;
	private String productPic1;
	private String productPic2;
	private String productPic3;
	private String productPic4;
	private String productPic5;
	private String productPic6;
	private String productPic7;
	private String productPic8;
	private List<ItemSkuPicsInfo> specialPicInfos;

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getProductPic1() {
		return productPic1;
	}

	public void setProductPic1(String productPic1) {
		this.productPic1 = productPic1;
	}

	public String getProductPic2() {
		return productPic2;
	}

	public void setProductPic2(String productPic2) {
		this.productPic2 = productPic2;
	}

	public String getProductPic3() {
		return productPic3;
	}

	public void setProductPic3(String productPic3) {
		this.productPic3 = productPic3;
	}

	public String getProductPic4() {
		return productPic4;
	}

	public void setProductPic4(String productPic4) {
		this.productPic4 = productPic4;
	}

	public String getProductPic5() {
		return productPic5;
	}

	public void setProductPic5(String productPic5) {
		this.productPic5 = productPic5;
	}

	public String getProductPic6() {
		return productPic6;
	}

	public void setProductPic6(String productPic6) {
		this.productPic6 = productPic6;
	}

	public String getProductPic7() {
		return productPic7;
	}

	public void setProductPic7(String productPic7) {
		this.productPic7 = productPic7;
	}

	public String getProductPic8() {
		return productPic8;
	}

	public void setProductPic8(String productPic8) {
		this.productPic8 = productPic8;
	}

	@XmlElement(name = "SpecialPicInfo")
	@XmlElementWrapper(name = "SpecialPicList")
	public List<ItemSkuPicsInfo> getSpecialPicInfos() {
		return specialPicInfos;
	}

	public void setSpecialPicInfos(List<ItemSkuPicsInfo> specialPicInfos) {
		this.specialPicInfos = specialPicInfos;
	}

}
