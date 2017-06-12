package com.yayiabc.http.mvc.pojo.jpa;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author xiaojiang 用户表
 */
public class User extends BasePojo {
	private String userId;

	private String phone;

	private String pwd;

	private Integer identity;

	private String trueName;

	private String idCard;

	private Integer sex;

	private String userPic;

	private Date birthday;

	private String qq;

	private String address;

	private Integer money;

	private Integer isBind;

	private Integer bindUserNum;

	private User bindUser;

	private String reflect;

	private Certification certification;

	private List<Receiver> receiverList;

	private List<Ordera> orderaList;

	// private List<Refund> refundList;

	private Cart cart;

	private List<Comment> commentList;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public String getReflect() {
		return reflect;
	}

	public void setReflect(String reflect) {
		this.reflect = reflect;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd == null ? null : pwd.trim();
	}

	public Integer getIdentity() {
		return identity;
	}

	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName == null ? null : trueName.trim();
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard == null ? null : idCard.trim();
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getUserPic() {
		return userPic;
	}

	public void setUserPic(String userPic) {
		this.userPic = userPic == null ? null : userPic.trim();
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq == null ? null : qq.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public Integer getIsBind() {
		return isBind;
	}

	public void setIsBind(Integer isBind) {
		this.isBind = isBind;
	}

	public Integer getBindUserNum() {
		return bindUserNum;
	}

	public void setBindUserNum(Integer bindUserNum) {
		this.bindUserNum = bindUserNum;
	}

	public List<Receiver> getReceiverList() {
		return receiverList;
	}

	public void setReceiverList(List<Receiver> receiverList) {
		this.receiverList = receiverList;
	}

	public List<Ordera> getOrderaList() {
		return orderaList;
	}

	public void setOrderaList(List<Ordera> orderaList) {
		this.orderaList = orderaList;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	public User getBindUser() {
		return bindUser;
	}

	public void setBindUser(User bindUser) {
		this.bindUser = bindUser;
	}

	public Certification getCertification() {
		return certification;
	}

	public void setCertification(Certification certification) {
		this.certification = certification;
	}

	public User() {
		super();
	}

	public User(String userId, String phone, String pwd, Integer identity,
			String trueName, String idCard, Integer sex, String userPic,
			Date birthday, String qq, String address, Integer money,
			Integer isBind, Integer bindUserNum, User bindUser, String reflect,
			Certification certification, List<Receiver> receiverList,
			List<Ordera> orderaList, Cart cart, List<Comment> commentList) {
		super();
		this.userId = userId;
		this.phone = phone;
		this.pwd = pwd;
		this.identity = identity;
		this.trueName = trueName;
		this.idCard = idCard;
		this.sex = sex;
		this.userPic = userPic;
		this.birthday = birthday;
		this.qq = qq;
		this.address = address;
		this.money = money;
		this.isBind = isBind;
		this.bindUserNum = bindUserNum;
		this.bindUser = bindUser;
		this.reflect = reflect;
		this.certification = certification;
		this.receiverList = receiverList;
		this.orderaList = orderaList;
		this.cart = cart;
		this.commentList = commentList;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", phone=" + phone + ", pwd=" + pwd
				+ ", identity=" + identity + ", trueName=" + trueName
				+ ", idCard=" + idCard + ", sex=" + sex + ", userPic="
				+ userPic + ", birthday=" + birthday + ", qq=" + qq
				+ ", address=" + address + ", money=" + money + ", isBind="
				+ isBind + ", bindUserNum=" + bindUserNum + ", bindUser="
				+ bindUser + ", reflect=" + reflect + ", certification="
				+ certification + ", receiverList=" + receiverList
				+ ", orderaList=" + orderaList + ", cart=" + cart
				+ ", commentList=" + commentList + "]";
	}

}