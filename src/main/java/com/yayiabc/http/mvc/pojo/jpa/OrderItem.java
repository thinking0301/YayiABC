package com.yayiabc.http.mvc.pojo.jpa;

/**
 * 
 * @author xiaojiang 订单商品表
 */
public class OrderItem extends BasePojo {
	private String itemId;

	private Integer qbDed;

	private Integer num;

	private Integer price;

	private String totalFee;

	private String picPath;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Integer getQbDed() {
		return qbDed;
	}

	public void setQbDed(Integer qbDed) {
		this.qbDed = qbDed;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee == null ? null : totalFee.trim();
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath == null ? null : picPath.trim();
	}

	public OrderItem() {
		super();
	}

	public OrderItem(String itemId, Integer qbDed, Integer num, Integer price,
			String totalFee, String picPath) {
		super();
		this.itemId = itemId;
		this.qbDed = qbDed;
		this.num = num;
		this.price = price;
		this.totalFee = totalFee;
		this.picPath = picPath;
	}

	@Override
	public String toString() {
		return "OrderItem [itemId=" + itemId + ", qbDed=" + qbDed + ", num="
				+ num + ", price=" + price + ", totalFee=" + totalFee
				+ ", picPath=" + picPath + "]";
	}

}