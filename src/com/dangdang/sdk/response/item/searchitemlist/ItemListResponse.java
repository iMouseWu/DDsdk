package com.dangdang.sdk.response.item.searchitemlist;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.dangdang.sdk.response.BaseResponse;

@XmlRootElement(name = "response")
public class ItemListResponse extends BaseResponse {

	private TotalInfo totalInfo;
	private List<ItemInfo> itemInfos;

	@XmlElement(name = "totalInfo")
	public TotalInfo getTotalInfo() {
		return totalInfo;
	}

	public void setTotalInfo(TotalInfo totalInfo) {
		this.totalInfo = totalInfo;
	}

	@XmlElement(name = "ItemInfo")
	@XmlElementWrapper(name = "ItemsList")
	public List<ItemInfo> getItemInfos() {
		return itemInfos;
	}

	public void setItemInfos(List<ItemInfo> itemInfos) {
		this.itemInfos = itemInfos;
	}

}
