package com.yayiabc.http.mvc.pojo.jpa;

import java.util.Date;

/**
 * 
 * @author xiaojiang 乾币记录表
 */
public class QbRecord extends BasePojo{
	private Integer qbRid;

	private String userId;

	private Integer qbRget;

	private Integer qbRout;

	private Integer qbBalance;

	private Date qbTime;

	private String remark;

	public Integer getQbRid() {
		return qbRid;
	}

	public void setQbRid(Integer qbRid) {
		this.qbRid = qbRid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public Integer getQbRget() {
		return qbRget;
	}

	public void setQbRget(Integer qbRget) {
		this.qbRget = qbRget;
	}

	public Integer getQbRout() {
		return qbRout;
	}

	public void setQbRout(Integer qbRout) {
		this.qbRout = qbRout;
	}

	public Integer getQbBalance() {
		return qbBalance;
	}

	public void setQbBalance(Integer qbBalance) {
		this.qbBalance = qbBalance;
	}

	public Date getQbTime() {
		return qbTime;
	}

	public void setQbTime(Date qbTime) {
		this.qbTime = qbTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}


	public QbRecord() {
		super();
	}

	public QbRecord(Integer qbRid, String userId, Integer qbRget,
			Integer qbRout, Integer qbBalance, Date qbTime, String remark) {
		super();
		this.qbRid = qbRid;
		this.userId = userId;
		this.qbRget = qbRget;
		this.qbRout = qbRout;
		this.qbBalance = qbBalance;
		this.qbTime = qbTime;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "QbRecord [qbRid=" + qbRid + ", userId=" + userId + ", qbRget="
				+ qbRget + ", qbRout=" + qbRout + ", qbBalance=" + qbBalance
				+ ", qbTime=" + qbTime + ", remark=" + remark + "]";
	}



}