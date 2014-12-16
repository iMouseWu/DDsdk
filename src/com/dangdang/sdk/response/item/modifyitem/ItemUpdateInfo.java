package com.dangdang.sdk.response.item.modifyitem;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ItemUpdateInfo")
public class ItemUpdateInfo {

	private String outerItemID;
	private String itemID;
	private String itemName;
	private String operCode;
	private String operation;
	private List<ItemSpecialUpdateInfo> itemSpecialUpdateInfos;

	public String getOuterItemID() {
		return outerItemID;
	}

	public void setOuterItemID(String outerItemID) {
		this.outerItemID = outerItemID;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	@XmlElement(name = "SpecialItemInfo")
	public List<ItemSpecialUpdateInfo> getItemSpecialUpdateInfos() {
		return itemSpecialUpdateInfos;
	}

	public void setItemSpecialUpdateInfos(List<ItemSpecialUpdateInfo> itemSpecialUpdateInfos) {
		this.itemSpecialUpdateInfos = itemSpecialUpdateInfos;
	}

}
