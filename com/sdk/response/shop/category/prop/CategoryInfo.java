package com.dangdang.sdk.response.shop.category.prop;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CategoryInfo")
public class CategoryInfo implements Serializable {

	private static final long serialVersionUID = -4066167117684897039L;
	private String categoryID;
	private String categoryName;

	private List<StandardAttributeInfo> standardAttribute;

	private List<String> specialAttribute;

	private ProductDescription productDescription;

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@XmlElementWrapper(name = "standardAttribute")
	@XmlElement(name = "standardAttributeInfo")
	public List<StandardAttributeInfo> getStandardAttribute() {
		return standardAttribute;
	}

	public void setStandardAttribute(List<StandardAttributeInfo> standardAttribute) {
		this.standardAttribute = standardAttribute;
	}

	@XmlElement(name = "specialAttribute")
	public List<String> getSpecialAttribute() {
		return specialAttribute;
	}

	public void setSpecialAttribute(List<String> specialAttribute) {
		this.specialAttribute = specialAttribute;
	}

	@XmlElement(name = "extendedDescriptions")
	public ProductDescription getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(ProductDescription productDescription) {
		this.productDescription = productDescription;
	};

}
