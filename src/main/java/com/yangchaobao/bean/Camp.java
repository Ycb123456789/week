package com.yangchaobao.bean;

public class Camp {
private Integer cid;
private String cname;
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
	return "Camp [cid=" + cid + ", cname=" + cname + "]";
}
public Camp() {
	super();
	// TODO Auto-generated constructor stub
}
public Camp(Integer cid, String cname) {
	super();
	this.cid = cid;
	this.cname = cname;
}

}
