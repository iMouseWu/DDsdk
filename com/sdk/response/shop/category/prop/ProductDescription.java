package com.dangdang.sdk.response.shop.category.prop;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "extendedDescriptions")
public class ProductDescription {

	private String productDescription2;
	private String productDescription3;
	private String productDescription4;
	private String productDescription5;

	public String getProductDescription2() {
		return productDescription2;
	}

	public void setProductDescription2(String productDescription2) {
		this.productDescription2 = productDescription2;
	}

	public String getProductDescription3() {
		return productDescription3;
	}

	public void setProductDescription3(String productDescription3) {
		this.productDescription3 = productDescription3;
	}

	public String getProductDescription4() {
		return productDescription4;
	}

	public void setProductDescription4(String productDescription4) {
		this.productDescription4 = productDescription4;
	}

	public String getProductDescription5() {
		return productDescription5;
	}

	public void setProductDescription5(String productDescription5) {
		this.productDescription5 = productDescription5;
	}

}
