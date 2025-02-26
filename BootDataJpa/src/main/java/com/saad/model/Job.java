package com.saad.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Job {
	@Id
	@Column(length=10)
private String jobid;
	@Column(length=20,nullable=false)
private String jobname;
	@Column(length=25,nullable=false)
private String comnm;
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(String jobid, String jobname, String comnm) {
		super();
		this.jobid = jobid;
		this.jobname = jobname;
		this.comnm = comnm;
	}
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getComnm() {
		return comnm;
	}
	public void setComnm(String comnm) {
		this.comnm = comnm;
	}
	@Override
	public String toString() {
		return "Job [jobid=" + jobid + ", jobname=" + jobname + ", comnm=" + comnm + "]";
	}
	
}
