package com.yayiabc.http.mvc.pojo.jpa;

/**
 * 
 * @author xiaojiang 评论信息表
 */
public class Comment extends BasePojo {
	private Integer commentId;

	private User user;

	private ItemInfo itemInfo;

	private Ordera order;

	private Integer commentGrade;

	private String commentContent;

	private String replyContent;

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ItemInfo getItemInfo() {
		return itemInfo;
	}

	public void setItemInfo(ItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}

	public Ordera getOrder() {
		return order;
	}

	public void setOrder(Ordera order) {
		this.order = order;
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

	public Comment() {
		super();
	}

	public Comment(Integer commentId, User user, ItemInfo itemInfo,
			Ordera order, Integer commentGrade, String commentContent,
			String replyContent) {
		super();
		this.commentId = commentId;
		this.user = user;
		this.itemInfo = itemInfo;
		this.order = order;
		this.commentGrade = commentGrade;
		this.commentContent = commentContent;
		this.replyContent = replyContent;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", user=" + user
				+ ", itemInfo=" + itemInfo + ", order=" + order
				+ ", commentGrade=" + commentGrade + ", commentContent="
				+ commentContent + ", replyContent=" + replyContent + "]";
	}

}