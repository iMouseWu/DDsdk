package com.dangdang.sdk.response.shop.category.saleprop;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "specialAttributeClassInfo")
public class SpecialAttributeClassInfo {

	private String optionID;
	private String optionName;

	public String getOptionID() {
		return optionID;
	}

	public void setOptionID(String optionID) {
		this.optionID = optionID;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

}
