package com.yayiabc.http.mvc.pojo.jpa;

import java.util.List;

/**
 * 
 * @author xiaojiang 商品品牌表
 */
public class ItemBrand extends BasePojo {
	private Integer itemBrandId;

	private String itemBrandLogo;

	private String itemBrandClassify;

	private String itemBrandName;

	private List<ItemInfo> iteminfoList;

	public List<ItemInfo> getIteminfoList() {
		return iteminfoList;
	}

	public void setIteminfoList(List<ItemInfo> iteminfoList) {
		this.iteminfoList = iteminfoList;
	}

	public Integer getItemBrandId() {
		return itemBrandId;
	}

	public void setItemBrandId(Integer itemBrandId) {
		this.itemBrandId = itemBrandId;
	}

	public String getItemBrandLogo() {
		return itemBrandLogo;
	}

	public void setItemBrandLogo(String itemBrandLogo) {
		this.itemBrandLogo = itemBrandLogo == null ? null : itemBrandLogo
				.trim();
	}

	public String getItemBrandClassify() {
		return itemBrandClassify;
	}

	public void setItemBrandClassify(String itemBrandClassify) {
		this.itemBrandClassify = itemBrandClassify == null ? null
				: itemBrandClassify.trim();
	}

	public String getItemBrandName() {
		return itemBrandName;
	}

	public void setItemBrandName(String itemBrandName) {
		this.itemBrandName = itemBrandName == null ? null : itemBrandName
				.trim();
	}

	public ItemBrand() {
		super();
	}

	public ItemBrand(Integer itemBrandId, String itemBrandLogo,
			String itemBrandClassify, String itemBrandName,
			List<ItemInfo> iteminfoList) {
		super();
		this.itemBrandId = itemBrandId;
		this.itemBrandLogo = itemBrandLogo;
		this.itemBrandClassify = itemBrandClassify;
		this.itemBrandName = itemBrandName;
		this.iteminfoList = iteminfoList;
	}

	@Override
	public String toString() {
		return "ItemBrand [itemBrandId=" + itemBrandId + ", itemBrandLogo="
				+ itemBrandLogo + ", itemBrandClassify=" + itemBrandClassify
				+ ", itemBrandName=" + itemBrandName + ", iteminfoList="
				+ iteminfoList + "]";
	}

}