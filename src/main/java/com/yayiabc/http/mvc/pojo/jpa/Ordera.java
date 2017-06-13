package com.yayiabc.http.mvc.pojo.jpa;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author xiaojiang 订单表
 */
public class Ordera extends BasePojo {
	private String orderId;

	private Integer actualPay;

	private Integer payType;

	private String postFee;

	private Date paymentTime;

	private Date consignTime;

	private Date endTime;

	private Date closeTime;

	private String buyerMessage;

	private String buyerNick;

	private Integer buyerRate;

	private Integer state;

	private String shippingName;

	private String shippingCode;

	private String invoiceHand;

	private Integer isRegister;

	private Integer giveQb;

	private String refundInfo;

	private List<OrderItem> orderitemList;

	private List<Comment> commentList;

	public List<OrderItem> getOrderitemList() {
		return orderitemList;
	}

	public String getRefundInfo() {
		return refundInfo;
	}

	public void setRefundInfo(String refundInfo) {
		this.refundInfo = refundInfo;
	}

	public void setOrderitemList(List<OrderItem> orderitemList) {
		this.orderitemList = orderitemList;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId == null ? null : orderId.trim();
	}

	public Integer getActualPay() {
		return actualPay;
	}

	public void setActualPay(Integer actualPay) {
		this.actualPay = actualPay;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public String getPostFee() {
		return postFee;
	}

	public void setPostFee(String postFee) {
		this.postFee = postFee == null ? null : postFee.trim();
	}

	public Date getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public Date getConsignTime() {
		return consignTime;
	}

	public void setConsignTime(Date consignTime) {
		this.consignTime = consignTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}

	public String getBuyerMessage() {
		return buyerMessage;
	}

	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
	}

	public String getBuyerNick() {
		return buyerNick;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick == null ? null : buyerNick.trim();
	}

	public Integer getBuyerRate() {
		return buyerRate;
	}

	public void setBuyerRate(Integer buyerRate) {
		this.buyerRate = buyerRate;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getShippingName() {
		return shippingName;
	}

	public void setShippingName(String shippingName) {
		this.shippingName = shippingName == null ? null : shippingName.trim();
	}

	public String getShippingCode() {
		return shippingCode;
	}

	public void setShippingCode(String shippingCode) {
		this.shippingCode = shippingCode == null ? null : shippingCode.trim();
	}

	public String getInvoiceHand() {
		return invoiceHand;
	}

	public void setInvoiceHand(String invoiceHand) {
		this.invoiceHand = invoiceHand == null ? null : invoiceHand.trim();
	}

	public Integer getIsRegister() {
		return isRegister;
	}

	public void setIsRegister(Integer isRegister) {
		this.isRegister = isRegister;
	}

	public Integer getGiveQb() {
		return giveQb;
	}

	public void setGiveQb(Integer giveQb) {
		this.giveQb = giveQb;
	}

	public Ordera() {
		super();
	}

	public Ordera(String orderId, Integer actualPay, Integer payType,
			String postFee, Date paymentTime, Date consignTime, Date endTime,
			Date closeTime, String buyerMessage, String buyerNick,
			Integer buyerRate, Integer state, String shippingName,
			String shippingCode, String invoiceHand, Integer isRegister,
			Integer giveQb, String refundInfo, List<OrderItem> orderitemList,
			List<Comment> commentList) {
		super();
		this.orderId = orderId;
		this.actualPay = actualPay;
		this.payType = payType;
		this.postFee = postFee;
		this.paymentTime = paymentTime;
		this.consignTime = consignTime;
		this.endTime = endTime;
		this.closeTime = closeTime;
		this.buyerMessage = buyerMessage;
		this.buyerNick = buyerNick;
		this.buyerRate = buyerRate;
		this.state = state;
		this.shippingName = shippingName;
		this.shippingCode = shippingCode;
		this.invoiceHand = invoiceHand;
		this.isRegister = isRegister;
		this.giveQb = giveQb;
		this.refundInfo = refundInfo;
		this.orderitemList = orderitemList;
		this.commentList = commentList;
	}

	@Override
	public String toString() {
		return "Ordera [orderId=" + orderId + ", actualPay=" + actualPay
				+ ", payType=" + payType + ", postFee=" + postFee
				+ ", paymentTime=" + paymentTime + ", consignTime="
				+ consignTime + ", endTime=" + endTime + ", closeTime="
				+ closeTime + ", buyerMessage=" + buyerMessage + ", buyerNick="
				+ buyerNick + ", buyerRate=" + buyerRate + ", state=" + state
				+ ", shippingName=" + shippingName + ", shippingCode="
				+ shippingCode + ", invoiceHand=" + invoiceHand
				+ ", isRegister=" + isRegister + ", giveQb=" + giveQb
				+ ", refundInfo=" + refundInfo + ", orderitemList="
				+ orderitemList + ", commentList=" + commentList + "]";
	}

}