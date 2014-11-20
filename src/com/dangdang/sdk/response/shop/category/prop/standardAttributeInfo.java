package com.dangdang.sdk.response.shop.category.prop;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "standardAttributeInfo")
public class standardAttributeInfo {

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
