package com.dangdang.sdk.response.shop.category.saleprop;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "specialAttributeClassInfo")
public class SpecialAttributeClassInfo implements Serializable {

	private static final long serialVersionUID = -7548951216738284373L;
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
