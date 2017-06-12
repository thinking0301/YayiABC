package com.yayiabc.http.mvc.pojo.jpa;
/**
 * 
 * @author xiaojiang 收货地址表
 */
public class Receiver extends BasePojo{
	private Integer receiverId;

	private User user;

	private String receiverName;

	private String province;

	private String city;

	private String area;

	private String receiverDetail;

	private String phone;

	private Integer isDefault;

	public Integer getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName == null ? null : receiverName.trim();
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area == null ? null : area.trim();
	}

	public String getReceiverDetail() {
		return receiverDetail;
	}

	public void setReceiverDetail(String receiverDetail) {
		this.receiverDetail = receiverDetail == null ? null : receiverDetail
				.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}


	public Receiver() {
		super();
	}

	public Receiver(Integer receiverId, User user, String receiverName,
			String province, String city, String area, String receiverDetail,
			String phone, Integer isDefault) {
		super();
		this.receiverId = receiverId;
		this.user = user;
		this.receiverName = receiverName;
		this.province = province;
		this.city = city;
		this.area = area;
		this.receiverDetail = receiverDetail;
		this.phone = phone;
		this.isDefault = isDefault;
	}

	@Override
	public String toString() {
		return "Receiver [receiverId=" + receiverId + ", user=" + user
				+ ", receiverName=" + receiverName + ", province=" + province
				+ ", city=" + city + ", area=" + area + ", receiverDetail="
				+ receiverDetail + ", phone=" + phone + ", isDefault="
				+ isDefault + "]";
	}



}