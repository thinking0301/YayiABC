package com.yayiabc.http.mvc.pojo.jpa;

import java.util.List;

/**
 * 
 * @author xiaojiang 商品库存表
 */
public class ItemStock extends BasePojo {
	private String itemStockId;

	private String stockName;

	private Integer itemStockNum;

	private Integer isWarning;

	private Integer warningNum;

	private List<ItemInfo> iteminfoList;

	public List<ItemInfo> getIteminfoList() {
		return iteminfoList;
	}

	public void setIteminfoList(List<ItemInfo> iteminfoList) {
		this.iteminfoList = iteminfoList;
	}

	public String getItemStockId() {
		return itemStockId;
	}

	public void setItemStockId(String itemStockId) {
		this.itemStockId = itemStockId == null ? null : itemStockId.trim();
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName == null ? null : stockName.trim();
	}

	public Integer getItemStockNum() {
		return itemStockNum;
	}

	public void setItemStockNum(Integer itemStockNum) {
		this.itemStockNum = itemStockNum;
	}

	public Integer getIsWarning() {
		return isWarning;
	}

	public void setIsWarning(Integer isWarning) {
		this.isWarning = isWarning;
	}

	public Integer getWarningNum() {
		return warningNum;
	}

	public void setWarningNum(Integer warningNum) {
		this.warningNum = warningNum;
	}

	public ItemStock() {
		super();
	}

	public ItemStock(String itemStockId, String stockName,
			Integer itemStockNum, Integer isWarning, Integer warningNum,
			List<ItemInfo> iteminfoList) {
		super();
		this.itemStockId = itemStockId;
		this.stockName = stockName;
		this.itemStockNum = itemStockNum;
		this.isWarning = isWarning;
		this.warningNum = warningNum;
		this.iteminfoList = iteminfoList;
	}

	@Override
	public String toString() {
		return "ItemStock [itemStockId=" + itemStockId + ", stockName="
				+ stockName + ", itemStockNum=" + itemStockNum + ", isWarning="
				+ isWarning + ", warningNum=" + warningNum + ", iteminfoList="
				+ iteminfoList + "]";
	}

}