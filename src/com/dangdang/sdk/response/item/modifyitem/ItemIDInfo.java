package com.dangdang.sdk.response.item.modifyitem;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ItemIDInfo")
public class ItemIDInfo {

	private String itemID;
	private String operCode;
	private String operation;

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
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
