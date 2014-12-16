package com.dangdang.sdk.request.item.modifyitem;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "request")
public class ItemStatusUpdateRequest {

	private List<ProductInfo> productInfos;

	@XmlElement(name = "ProductInfo")
	@XmlElementWrapper(name = "ProductInfoList")
	public List<ProductInfo> getProductInfos() {
		return productInfos;
	}

	public void setProductInfos(List<ProductInfo> productInfos) {
		this.productInfos = productInfos;
	}

}
