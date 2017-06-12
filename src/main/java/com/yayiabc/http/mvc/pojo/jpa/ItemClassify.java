package com.yayiabc.http.mvc.pojo.jpa;

/**
 * 
 * @author xiaojiang 商品分类表
 */
public class ItemClassify extends BasePojo {
	private Integer itemClassifyId;

	private Integer itemClassifyGrade;

	private String itemClassifyName;

	private String itemPreviousClassify;

	public Integer getItemClassifyId() {
		return itemClassifyId;
	}

	public void setItemClassifyId(Integer itemClassifyId) {
		this.itemClassifyId = itemClassifyId;
	}

	public Integer getItemClassifyGrade() {
		return itemClassifyGrade;
	}

	public void setItemClassifyGrade(Integer itemClassifyGrade) {
		this.itemClassifyGrade = itemClassifyGrade;
	}

	public String getItemClassifyName() {
		return itemClassifyName;
	}

	public void setItemClassifyName(String itemClassifyName) {
		this.itemClassifyName = itemClassifyName == null ? null
				: itemClassifyName.trim();
	}

	public String getItemPreviousClassify() {
		return itemPreviousClassify;
	}

	public void setItemPreviousClassify(String itemPreviousClassify) {
		this.itemPreviousClassify = itemPreviousClassify == null ? null
				: itemPreviousClassify.trim();
	}

	public ItemClassify() {
		super();
	}

	public ItemClassify(Integer itemClassifyId, Integer itemClassifyGrade,
			String itemClassifyName, String itemPreviousClassify) {
		super();
		this.itemClassifyId = itemClassifyId;
		this.itemClassifyGrade = itemClassifyGrade;
		this.itemClassifyName = itemClassifyName;
		this.itemPreviousClassify = itemPreviousClassify;
	}

	@Override
	public String toString() {
		return "ItemClassify [itemClassifyId=" + itemClassifyId
				+ ", itemClassifyGrade=" + itemClassifyGrade
				+ ", itemClassifyName=" + itemClassifyName
				+ ", itemPreviousClassify=" + itemPreviousClassify + "]";
	}

}