package com.yayiabc.http.mvc.pojo.jpa;

import java.util.Date;
import java.util.List;

public class SaleInfo extends BasePojo {
	private String saleId;

	private String trueName;

	private Date birthday;

	private Integer money;

	private Integer type;

	private String phone;

	private String address;

	private Integer bindUserNum;

	private List<User> user;

	public String getSaleId() {
		return saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getBindUserNum() {
		return bindUserNum;
	}

	public void setBindUserNum(Integer bindUserNum) {
		this.bindUserNum = bindUserNum;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public SaleInfo() {
		super();
	}

	public SaleInfo(String saleId, String trueName, Date birthday,
			Integer money, Integer type, String phone, String address,
			Integer bindUserNum, List<User> user) {
		super();
		this.saleId = saleId;
		this.trueName = trueName;
		this.birthday = birthday;
		this.money = money;
		this.type = type;
		this.phone = phone;
		this.address = address;
		this.bindUserNum = bindUserNum;
		this.user = user;
	}

	@Override
	public String toString() {
		return "SaleInfo [saleId=" + saleId + ", trueName=" + trueName
				+ ", birthday=" + birthday + ", money=" + money + ", type="
				+ type + ", phone=" + phone + ", address=" + address
				+ ", bindUserNum=" + bindUserNum + ", user=" + user + "]";
	}

}
