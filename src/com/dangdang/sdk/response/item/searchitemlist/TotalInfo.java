package com.dangdang.sdk.response.item.searchitemlist;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "totalInfo")
public class TotalInfo {

	private String itemsCount;
	private String pageSize;
	private String pageTotal;
	private String currentPage;

	public String getItemsCount() {
		return itemsCount;
	}

	public void setItemsCount(String itemsCount) {
		this.itemsCount = itemsCount;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(String pageTotal) {
		this.pageTotal = pageTotal;
	}

	public String getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

}
