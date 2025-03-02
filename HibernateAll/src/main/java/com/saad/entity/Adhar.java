package com.saad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adhar {
	@Id
	@Column(length=10)
	private String adharno;
	@Column(length=25, nullable=false)
	private String city;
	public Adhar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adhar(String adharno, String city) {
		super();
		this.adharno = adharno;
		this.city = city;
	}
	public String getAdhar() {
		return adharno;
	}
	public void setAdhar(String adharno) {
		this.adharno = adharno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Adhar [adhar=" + adharno + ", city=" + city + "]";
	}
	
	
	

}
