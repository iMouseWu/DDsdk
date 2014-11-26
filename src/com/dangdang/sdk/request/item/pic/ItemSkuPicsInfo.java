package com.dangdang.sdk.request.item.pic;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SpecialPicInfo")
public class ItemSkuPicsInfo {

	private String specialAttributeValue;
	private String itemPic;

	public String getSpecialAttributeValue() {
		return specialAttributeValue;
	}

	public void setSpecialAttributeValue(String specialAttributeValue) {
		this.specialAttributeValue = specialAttributeValue;
	}

	public String getItemPic() {
		return itemPic;
	}

	public void setItemPic(String itemPic) {
		this.itemPic = itemPic;
	}

}
