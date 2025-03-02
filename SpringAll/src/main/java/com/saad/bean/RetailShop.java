package com.saad.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component(value="rs")
public class RetailShop {
	@Value("${rsid}")
private String rsid;
	@Value("${rsnm}")
private String rsnm;
	@Value("${model}")
private List<String> model;
	@Value("#{${product}}")
private Map<String, Double> product;
	@Value("#{${status}}")
private Properties status;
	@Value("${consumer}")
private String consumer;
	public RetailShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RetailShop(String rsid, String rsnm, List<String> model, Map<String, Double> product, Properties status,
			String consumer) {
		super();
		this.rsid = rsid;
		this.rsnm = rsnm;
		this.model = model;
		this.product = product;
		this.status = status;
		this.consumer = consumer;
	}
	public String getRsid() {
		return rsid;
	}
	public void setRsid(String rsid) {
		this.rsid = rsid;
	}
	public String getRsnm() {
		return rsnm;
	}
	public void setRsnm(String rsnm) {
		this.rsnm = rsnm;
	}
	public List<String> getModel() {
		return model;
	}
	public void setModel(List<String> model) {
		this.model = model;
	}
	public Map<String, Double> getProduct() {
		return product;
	}
	public void setProduct(Map<String, Double> product) {
		this.product = product;
	}
	public Properties getStatus() {
		return status;
	}
	public void setStatus(Properties status) {
		this.status = status;
	}
	public String getConsumer() {
		return consumer;
	}
	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}
	@Override
	public String toString() {
		return "RetailShop [rsid=" + rsid + ", rsnm=" + rsnm + ", model=" + model + ", product=" + product + ", status="
				+ status + ", consumer=" + consumer + "]";
	}
	
	
}
