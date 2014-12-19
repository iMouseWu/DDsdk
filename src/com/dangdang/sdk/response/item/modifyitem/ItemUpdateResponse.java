package com.dangdang.sdk.response.item.modifyitem;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import com.dangdang.sdk.response.BaseResponse;

@XmlRootElement(name = "response")
public class ItemUpdateResponse extends BaseResponse {

	private Result result;

	@XmlElement(name = "Result")
	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public String getErrorMsg() {
		if (StringUtils.isNotBlank(super.getErrorMsg())) {
			return super.getErrorMsg();
		}
		ItemUpdateInfo itemUpdateInfo = result.getItemUpdateInfos().get(0);
		if (StringUtils.isNotBlank(itemUpdateInfo.getOperation())) {
			return itemUpdateInfo.getOperation();
		}
		StringBuilder error = new StringBuilder();
		if (CollectionUtils.isNotEmpty(itemUpdateInfo.getItemSpecialUpdateInfos())) {
			for (ItemSpecialUpdateInfo skuInfo : itemUpdateInfo.getItemSpecialUpdateInfos()) {
				if (!TRUE_CODE.equals(skuInfo.getOperCode())) {
					error.append(skuInfo.getOperation()).append(ERROR_SPLIT);
				}
			}
		}
		return error.toString();
	}

	public String getErrorCode() {
		if (!BaseResponse.TRUE_CODE.equals(super.getErrorCode())) {
			return super.getErrorCode();
		}

		ItemUpdateInfo itemUpdateInfo = result.getItemUpdateInfos().get(0);
		if (StringUtils.isNotBlank(itemUpdateInfo.getOperCode())) {
			return itemUpdateInfo.getOperCode();
		}
		if (CollectionUtils.isNotEmpty(itemUpdateInfo.getItemSpecialUpdateInfos())) {
			for (ItemSpecialUpdateInfo skuInfo : itemUpdateInfo.getItemSpecialUpdateInfos()) {
				if (!TRUE_CODE.equals(skuInfo.getOperCode())) {
					return skuInfo.getOperCode();
				}
			}
		}
		return TRUE_CODE;
	}
}
