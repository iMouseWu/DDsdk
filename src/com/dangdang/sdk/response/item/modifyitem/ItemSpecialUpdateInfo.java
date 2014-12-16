package com.dangdang.sdk.response.item.modifyitem;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SpecialItemInfo")
public class ItemSpecialUpdateInfo {

	private String outerItemID;
	private String subItemID;
	private String operCode;
	private String operation;

	public String getOuterItemID() {
		return outerItemID;
	}

	public void setOuterItemID(String outerItemID) {
		this.outerItemID = outerItemID;
	}

	public String getSubItemID() {
		return subItemID;
	}

	public void setSubItemID(String subItemID) {
		this.subItemID = subItemID;
	}

	public String getOperCode() {
		return operCode;
	}

	public void setOperCode(String operCode) {
		this.operCode = operCode;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

}
