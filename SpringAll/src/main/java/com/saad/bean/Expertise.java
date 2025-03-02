package com.saad.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="exp")
public class Expertise {
@Value("PYTHON")
private String technology;
@Value(value="5")
private Integer yrofexp;
@Autowired
private Job jb;
public Expertise() {
	super();
	// TODO Auto-generated constructor stub
}
public Expertise(String technology, Integer yrofexp, Job jb) {
	super();
	this.technology = technology;
	this.yrofexp = yrofexp;
	this.jb = jb;
}
public String getTechnology() {
	return technology;
}
public void setTechnology(String technology) {
	this.technology = technology;
}
public Integer getYrofexp() {
	return yrofexp;
}
public void setYrofexp(Integer yrofexp) {
	this.yrofexp = yrofexp;
}
public Job getJb() {
	return jb;
}
public void setJb(Job jb) {
	this.jb = jb;
}
@Override
public String toString() {
	return "Expertise [technology=" + technology + ", yrofexp=" + yrofexp + ", jb=" + jb + "]";
}


}
