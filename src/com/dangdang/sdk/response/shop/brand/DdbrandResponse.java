package com.dangdang.sdk.response.shop.brand;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class DdbrandResponse {

	private List<String> ddBrands;

	@XmlElementWrapper(name = "DDBrandList")
	@XmlElement(name = "DDBrand")
	public List<String> getDdBrands() {
		return ddBrands;
	}

	public void setDdBrands(List<String> ddBrands) {
		this.ddBrands = ddBrands;
	}

}