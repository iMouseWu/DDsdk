package com.dangdang.sdk.response.shop.category.prop;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "standardAttributeInfo")
public class StandardAttributeInfo {

	public static final String PROP_MUST = "1";
	public static final String PROP_NO_MUST = "0";

	private String standardAttributeName;

	private List<String> optionList;

	private String fillType;

	public String getStandardAttributeName() {
		return standardAttributeName;
	}

	public void setStandardAttributeName(String standardAttributeName) {
		this.standardAttributeName = standardAttributeName;
	}

	@XmlElementWrapper(name = "optionInfo")
	@XmlElement(name = "option")
	public List<String> getOptionList() {
		return optionList;
	}

	public void setOptionList(List<String> optionList) {
		this.optionList = optionList;
	}

	@XmlElement(name = "fillType")
	public String getFillType() {
		return fillType;
	}

	public void setFillType(String fillType) {
		this.fillType = fillType;
	}

}
