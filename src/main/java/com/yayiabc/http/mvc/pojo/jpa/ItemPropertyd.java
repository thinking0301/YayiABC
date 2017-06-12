package com.yayiabc.http.mvc.pojo.jpa;

public class ItemPropertyd extends BasePojo {
	private Integer itemPdid;

	private ItemProperty itemProperty;

	private String itemPparam;

	private Integer isEnable;

	public Integer getItemPdid() {
		return itemPdid;
	}

	public void setItemPdid(Integer itemPdid) {
		this.itemPdid = itemPdid;
	}

	public ItemProperty getItemProperty() {
		return itemProperty;
	}

	public void setItemProperty(ItemProperty itemProperty) {
		this.itemProperty = itemProperty;
	}

	public String getItemPparam() {
		return itemPparam;
	}

	public void setItemPparam(String itemPparam) {
		this.itemPparam = itemPparam == null ? null : itemPparam.trim();
	}

	public Integer getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}

	public ItemPropertyd() {
		super();
	}

	public ItemPropertyd(Integer itemPdid, ItemProperty itemProperty,
			String itemPparam, Integer isEnable) {
		super();
		this.itemPdid = itemPdid;
		this.itemProperty = itemProperty;
		this.itemPparam = itemPparam;
		this.isEnable = isEnable;
	}

	@Override
	public String toString() {
		return "ItemPropertyd [itemPdid=" + itemPdid + ", itemProperty="
				+ itemProperty + ", itemPparam=" + itemPparam + ", isEnable="
				+ isEnable + "]";
	}

}