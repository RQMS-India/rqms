package com.rqms.domain;

// default package
// Generated May 28, 2014 12:44:16 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Candidateprofile generated by hbm2java
 */
@Entity
@Table(name = "candidateprofile")
public class Candidateprofile implements java.io.Serializable {

	private int candidateid;
	private String candidatename;
	private Date dob;
	private BigDecimal phonenumber;
	private String address;
	private BigDecimal zipcode;
	private String email;
	private String candidateskillsets;
	private String candidateexperiencedetail;
	private int expInYears;
	private Boolean isfake;
	private Date stampdate;
	private Set<Jobcandidatemap> jobcandidatemaps = new HashSet<Jobcandidatemap>(
			0);
	private Set<Applicantfeedback> applicantfeedbacks = new HashSet<Applicantfeedback>(
			0);
	private Set<Attachment> attachments = new HashSet<Attachment>(0);

	public Candidateprofile() {
	}

	public Candidateprofile(int candidateid, String candidatename,
			BigDecimal phonenumber, BigDecimal zipcode, String email,
			String candidateskillsets, String candidateexperiencedetail,
			int expInYears) {
		this.candidateid = candidateid;
		this.candidatename = candidatename;
		this.phonenumber = phonenumber;
		this.zipcode = zipcode;
		this.email = email;
		this.candidateskillsets = candidateskillsets;
		this.candidateexperiencedetail = candidateexperiencedetail;
		this.expInYears = expInYears;
	}

	public Candidateprofile(int candidateid, String candidatename, Date dob,
			BigDecimal phonenumber, String address, BigDecimal zipcode,
			String email, String candidateskillsets,
			String candidateexperiencedetail, int expInYears, Boolean isfake,
			Date stampdate, Set<Jobcandidatemap> jobcandidatemaps,
			Set<Applicantfeedback> applicantfeedbacks,
			Set<Attachment> attachments) {
		this.candidateid = candidateid;
		this.candidatename = candidatename;
		this.dob = dob;
		this.phonenumber = phonenumber;
		this.address = address;
		this.zipcode = zipcode;
		this.email = email;
		this.candidateskillsets = candidateskillsets;
		this.candidateexperiencedetail = candidateexperiencedetail;
		this.expInYears = expInYears;
		this.isfake = isfake;
		this.stampdate = stampdate;
		this.jobcandidatemaps = jobcandidatemaps;
		this.applicantfeedbacks = applicantfeedbacks;
		this.attachments = attachments;
	}

	@Id
	@Column(name = "candidateid", unique = true, nullable = false)
	public int getCandidateid() {
		return this.candidateid;
	}

	public void setCandidateid(int candidateid) {
		this.candidateid = candidateid;
	}

	@Column(name = "candidatename", nullable = false, length = 30)
	public String getCandidatename() {
		return this.candidatename;
	}

	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dob", length = 29)
	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "phonenumber", nullable = false, precision = 131089, scale = 0)
	public BigDecimal getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(BigDecimal phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Column(name = "address", length = 50)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "zipcode", nullable = false, precision = 131089, scale = 0)
	public BigDecimal getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(BigDecimal zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "email", nullable = false, length = 20)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "candidateskillsets", nullable = false, length = 50)
	public String getCandidateskillsets() {
		return this.candidateskillsets;
	}

	public void setCandidateskillsets(String candidateskillsets) {
		this.candidateskillsets = candidateskillsets;
	}

	@Column(name = "candidateexperiencedetail", nullable = false, length = 100)
	public String getCandidateexperiencedetail() {
		return this.candidateexperiencedetail;
	}

	public void setCandidateexperiencedetail(String candidateexperiencedetail) {
		this.candidateexperiencedetail = candidateexperiencedetail;
	}

	@Column(name = "exp_in_years", nullable = false)
	public int getExpInYears() {
		return this.expInYears;
	}

	public void setExpInYears(int expInYears) {
		this.expInYears = expInYears;
	}

	@Column(name = "isfake")
	public Boolean getIsfake() {
		return this.isfake;
	}

	public void setIsfake(Boolean isfake) {
		this.isfake = isfake;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "stampdate", length = 29)
	public Date getStampdate() {
		return this.stampdate;
	}

	public void setStampdate(Date stampdate) {
		this.stampdate = stampdate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidateprofile")
	public Set<Jobcandidatemap> getJobcandidatemaps() {
		return this.jobcandidatemaps;
	}

	public void setJobcandidatemaps(Set<Jobcandidatemap> jobcandidatemaps) {
		this.jobcandidatemaps = jobcandidatemaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidateprofile")
	public Set<Applicantfeedback> getApplicantfeedbacks() {
		return this.applicantfeedbacks;
	}

	public void setApplicantfeedbacks(Set<Applicantfeedback> applicantfeedbacks) {
		this.applicantfeedbacks = applicantfeedbacks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidateprofile")
	public Set<Attachment> getAttachments() {
		return this.attachments;
	}

	public void setAttachments(Set<Attachment> attachments) {
		this.attachments = attachments;
	}

}
