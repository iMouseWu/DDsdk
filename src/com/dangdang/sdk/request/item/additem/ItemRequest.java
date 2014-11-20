package com.dangdang.sdk.request.item.additem;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "request")
public class ItemRequest {

	private String functionID;
	private String time;
	private List<ItemAddInfo> itemAddInfos;

	@XmlElementWrapper(name = "ItemsList")
	@XmlElement(name = "ItemAddInfo")
	public List<ItemAddInfo> getItemAddInfos() {
		return itemAddInfos;
	}

	public void setItemAddInfos(List<ItemAddInfo> itemAddInfos) {
		this.itemAddInfos = itemAddInfos;
	}

	public String getFunctionID() {
		return functionID;
	}

	public void setFunctionID(String functionID) {
		this.functionID = functionID;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
