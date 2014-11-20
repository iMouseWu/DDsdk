package com.dangdang.sdk.response.shop.category.prop;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CategoryInfo")
public class CategoryInfo {

	private String categoryID;
	private String categoryName;

	private List<standardAttributeInfo> standardAttribute;

	private SpecialAttribute specialAttribute;

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
	public List<standardAttributeInfo> getStandardAttribute() {
		return standardAttribute;
	}

	public void setStandardAttribute(List<standardAttributeInfo> standardAttribute) {
		this.standardAttribute = standardAttribute;
	}

	@XmlElement(name = "specialAttribute")
	public SpecialAttribute getSpecialAttribute() {
		return specialAttribute;
	}

	public void setSpecialAttribute(SpecialAttribute specialAttribute) {
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
