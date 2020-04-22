package com.yangchaobao.bean;

import java.util.Date;

public class Hero {//英雄类
private Integer hid;
private String hname;
private double price;
private String status;
private Date uptime;
private Integer cid;
private String cname;
public Integer getHid() {
	return hid;
}
public void setHid(Integer hid) {
	this.hid = hid;
}
public String getHname() {
	return hname;
}
public void setHname(String hname) {
	this.hname = hname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Date getUptime() {
	return uptime;
}
public void setUptime(Date uptime) {
	this.uptime = uptime;
}
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "Hero [hid=" + hid + ", hname=" + hname + ", price=" + price + ", status=" + status + ", uptime=" + uptime
			+ ", cid=" + cid + ", cname=" + cname + "]";
}
public Hero(Integer hid, String hname, double price, String status, Date uptime, Integer cid, String cname) {
	super();
	this.hid = hid;
	this.hname = hname;
	this.price = price;
	this.status = status;
	this.uptime = uptime;
	this.cid = cid;
	this.cname = cname;
}
public Hero() {
	super();
	// TODO Auto-generated constructor stub
}

}
