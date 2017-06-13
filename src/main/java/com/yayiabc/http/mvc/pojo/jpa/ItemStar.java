package com.yayiabc.http.mvc.pojo.jpa;

import java.util.List;

public class ItemStar extends BasePojo {
	private User user;

	private List<ItemInfo> iteminfoList;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ItemInfo> getIteminfoList() {
		return iteminfoList;
	}

	public void setIteminfoList(List<ItemInfo> iteminfoList) {
		this.iteminfoList = iteminfoList;
	}

	public ItemStar() {
		super();
	}

	public ItemStar(User user, List<ItemInfo> iteminfoList) {
		super();
		this.user = user;
		this.iteminfoList = iteminfoList;
	}

	@Override
	public String toString() {
		return "ItemStar [user=" + user + ", iteminfoList=" + iteminfoList
				+ "]";
	}

}
