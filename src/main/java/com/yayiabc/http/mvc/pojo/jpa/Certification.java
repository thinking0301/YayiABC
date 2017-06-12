package com.yayiabc.http.mvc.pojo.jpa;

/**
 * 
 * @author xiaojiang 资质认证表
 */
public class Certification extends BasePojo {
	private Integer certificationId;

	private Integer type;

	private String companyName;

	private String part;

	private String doctorPic;

	private String workAddress;

	private Integer state;

	private String failReason;

	public Integer getCertificationId() {
		return certificationId;
	}

	public void setCertificationId(Integer certificationId) {
		this.certificationId = certificationId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName == null ? null : companyName.trim();
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part == null ? null : part.trim();
	}

	public String getDoctorPic() {
		return doctorPic;
	}

	public void setDoctorPic(String doctorPic) {
		this.doctorPic = doctorPic == null ? null : doctorPic.trim();
	}

	public String getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress == null ? null : workAddress.trim();
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason == null ? null : failReason.trim();
	}

	public Certification() {
		super();
	}

	public Certification(Integer certificationId, Integer type,
			String companyName, String part, String doctorPic,
			String workAddress, Integer state, String failReason) {
		super();
		this.certificationId = certificationId;
		this.type = type;
		this.companyName = companyName;
		this.part = part;
		this.doctorPic = doctorPic;
		this.workAddress = workAddress;
		this.state = state;
		this.failReason = failReason;
	}

	@Override
	public String toString() {
		return "Certification [certificationId=" + certificationId + ", type="
				+ type + ", companyName=" + companyName + ", part=" + part
				+ ", doctorPic=" + doctorPic + ", workAddress=" + workAddress
				+ ", state=" + state + ", failReason=" + failReason + "]";
	}

}