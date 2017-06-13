package com.yayiabc.http.mvc.pojo.jpa;

import java.util.List;

/**
 * 
 * @author xiaojiang 购物车表
 */
public class Cart extends BasePojo {
	private String cartId;

	private List<ItemInfo> iteminfoList;

	private String name;

	private String pic;

	private Integer num;

	private Integer price;

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId == null ? null : cartId.trim();
	}

	public List<ItemInfo> getIteminfoList() {
		return iteminfoList;
	}

	public void setIteminfoList(List<ItemInfo> iteminfoList) {
		this.iteminfoList = iteminfoList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic == null ? null : pic.trim();
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

	public Cart() {
		super();
	}

	public Cart(String cartId, List<ItemInfo> iteminfoList, String name,
			String pic, Integer num, Integer price) {
		super();
		this.cartId = cartId;
		this.iteminfoList = iteminfoList;
		this.name = name;
		this.pic = pic;
		this.num = num;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", iteminfoList=" + iteminfoList
				+ ", name=" + name + ", pic=" + pic + ", num=" + num
				+ ", price=" + price + "]";
	}

}