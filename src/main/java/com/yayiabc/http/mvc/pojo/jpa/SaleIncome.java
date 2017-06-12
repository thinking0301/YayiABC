package com.yayiabc.http.mvc.pojo.jpa;

import java.util.Date;

/**
 * 
 * @author xiaojiang 销售员收入表
 */
public class SaleIncome extends BasePojo {
	private Integer saleIncomeId;

	private String userId;

	private String orderId;

	private Integer getMoney;

	private Integer getState;

	public Integer getSaleIncomeId() {
		return saleIncomeId;
	}

	public void setSaleIncomeId(Integer saleIncomeId) {
		this.saleIncomeId = saleIncomeId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId == null ? null : orderId.trim();
	}

	public Integer getGetMoney() {
		return getMoney;
	}

	public void setGetMoney(Integer getMoney) {
		this.getMoney = getMoney;
	}

	public Integer getGetState() {
		return getState;
	}

	public void setGetState(Integer getState) {
		this.getState = getState;
	}

	public SaleIncome() {
		super();
	}

	public SaleIncome(Integer saleIncomeId, String userId, String orderId,
			Integer getMoney, Integer getState) {
		super();
		this.saleIncomeId = saleIncomeId;
		this.userId = userId;
		this.orderId = orderId;
		this.getMoney = getMoney;
		this.getState = getState;
	}

	@Override
	public String toString() {
		return "SaleIncome [saleIncomeId=" + saleIncomeId + ", userId="
				+ userId + ", orderId=" + orderId + ", getMoney=" + getMoney
				+ ", getState=" + getState + "]";
	}

}