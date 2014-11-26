package com.dangdang.sdk.response.shop.category.saleprop;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.dangdang.sdk.response.BaseResponse;

@XmlRootElement(name = "response")
public class DdSalepropsResponse extends BaseResponse {

	private static final long serialVersionUID = -151999153367348806L;
	private List<SpecialAttributeInfo> specialAttributeInfos;

	@XmlElementWrapper(name = "DDSpecialAttribute")
	@XmlElement(name = "specialAttributeInfo")
	public List<SpecialAttributeInfo> getSpecialAttributeInfos() {
		return specialAttributeInfos;
	}

	public void setSpecialAttributeInfos(List<SpecialAttributeInfo> specialAttributeInfos) {
		this.specialAttributeInfos = specialAttributeInfos;
	}

}
