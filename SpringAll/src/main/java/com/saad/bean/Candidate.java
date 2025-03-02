package com.saad.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="cnd")
public class Candidate {
@Value("CND12")
private String candidateid;
@Value("SAAD")
private String candidatenm;
@Value("ASANSOL")
private String address;
@Autowired
private Expertise exp;
public Candidate() {
	super();
	// TODO Auto-generated constructor stub
}
public Candidate(String candidateid, String candidatenm, String address, Expertise exp) {
	super();
	this.candidateid = candidateid;
	this.candidatenm = candidatenm;
	this.address = address;
	this.exp = exp;
}
public String getCandidateid() {
	return candidateid;
}
public void setCandidateid(String candidateid) {
	this.candidateid = candidateid;
}
public String getCandidatenm() {
	return candidatenm;
}
public void setCandidatenm(String candidatenm) {
	this.candidatenm = candidatenm;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Expertise getExp() {
	return exp;
}
public void setExp(Expertise exp) {
	this.exp = exp;
}
@Override
public String toString() {
	return "Candidate [candidateid=" + candidateid + ", candidatenm=" + candidatenm + ", address=" + address + ", exp="
			+ exp + "]";
}



}
