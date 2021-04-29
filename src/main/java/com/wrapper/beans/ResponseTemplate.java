package com.wrapper.beans;

public class ResponseTemplate {
private CustomerInfoList customerinfo;
public CustomerInfoList getCustomerinfo() {
	return customerinfo;
}
public void setCustomerinfo(CustomerInfoList customerinfo) {
	this.customerinfo = customerinfo;
}
public CustomerAddrList getCustomeraddr() {
	return customeraddr;
}
public void setCustomeraddr(CustomerAddrList customeraddr) {
	this.customeraddr = customeraddr;
}
private CustomerAddrList customeraddr;
}
