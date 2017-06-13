package com.yayiabc.http.mvc.pojo.jpa;

/**
 * 
 * @author xiaojiang 评论信息表
 */
public class Comment extends BasePojo {
	private Integer commentId;

	private ItemInfo itemInfo;

	private Integer commentGrade;

	private String commentContent;

	private String replyContent;

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public ItemInfo getItemInfo() {
		return itemInfo;
	}

	public void setItemInfo(ItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}

	public Integer getCommentGrade() {
		return commentGrade;
	}

	public void setCommentGrade(Integer commentGrade) {
		this.commentGrade = commentGrade;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent == null ? null : commentContent
				.trim();
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent == null ? null : replyContent.trim();
	}

	public Comment(Integer commentId, ItemInfo itemInfo, Integer commentGrade,
			String commentContent, String replyContent) {
		super();
		this.commentId = commentId;
		this.itemInfo = itemInfo;
		this.commentGrade = commentGrade;
		this.commentContent = commentContent;
		this.replyContent = replyContent;
	}

	public Comment() {
		super();
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", itemInfo=" + itemInfo
				+ ", commentGrade=" + commentGrade + ", commentContent="
				+ commentContent + ", replyContent=" + replyContent + "]";
	}

}