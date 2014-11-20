package com.dangdang.sdk.response.shop.category.saleprop;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class DdsalepropsResponse {

	@XmlElementWrapper(name = "DDSpecialAttribute")
	@XmlElement(name = "specialAttributeInfo")
	private List<SpecialAttributeInfo> specialAttributeInfos;

}
