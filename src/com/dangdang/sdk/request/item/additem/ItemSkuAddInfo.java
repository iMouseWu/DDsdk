package com.dangdang.sdk.request.item.additem;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SpecilaItemInfo")
public class ItemSkuAddInfo {

	private String specialAttributeClass;
	private String specialAttribute;
	private String specialAttributeSeq;

	public String getSpecialAttributeClass() {
		return specialAttributeClass;
	}

	public void setSpecialAttributeClass(String specialAttributeClass) {
		this.specialAttributeClass = specialAttributeClass;
	}

	public String getSpecialAttribute() {
		return specialAttribute;
	}

	public void setSpecialAttribute(String specialAttribute) {
		this.specialAttribute = specialAttribute;
	}

	public String getSpecialAttributeSeq() {
		return specialAttributeSeq;
	}

	public void setSpecialAttributeSeq(String specialAttributeSeq) {
		this.specialAttributeSeq = specialAttributeSeq;
	}

}
