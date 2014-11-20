package com.dangdang.sdk.response.shop.category.saleprop;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "specialAttributeInfo")
public class SpecialAttributeInfo {

	private String specialAttributeID;
	private String specialAttributeName;
	private List<SpecialAttributeClassInfo> specialAttributeClassInfos;

	public String getSpecialAttributeID() {
		return specialAttributeID;
	}

	public void setSpecialAttributeID(String specialAttributeID) {
		this.specialAttributeID = specialAttributeID;
	}

	public String getSpecialAttributeName() {
		return specialAttributeName;
	}

	public void setSpecialAttributeName(String specialAttributeName) {
		this.specialAttributeName = specialAttributeName;
	}

	@XmlElementWrapper(name = "specialAttributeClass")
	@XmlElement(name = "specialAttributeClassInfo")
	public List<SpecialAttributeClassInfo> getSpecialAttributeClassInfos() {
		return specialAttributeClassInfos;
	}

	public void setSpecialAttributeClassInfos(List<SpecialAttributeClassInfo> specialAttributeClassInfos) {
		this.specialAttributeClassInfos = specialAttributeClassInfos;
	}

}
