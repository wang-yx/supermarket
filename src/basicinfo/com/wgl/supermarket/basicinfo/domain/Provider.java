package com.wgl.supermarket.basicinfo.domain;

import java.io.Serializable;

public class Provider implements Serializable {
	private static final long serialVersionUID = -7668124343209297642L;
	//供应商id
	private int id;
	//供应商全称
	private String providername;
	//供应商邮编
	private String zip;
	//供应商公司地址
	private String address;
	//供应商公司电话
	private String telephone;
	//联系人
	private String connectionPerson;
	//联系人电话
	private String phone;
	//联系人邮箱
	private String email;
	//状态
	private int available;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvidername() {
		return providername;
	}
	public void setProvidername(String providername) {
		this.providername = providername;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getConnectionPerson() {
		return connectionPerson;
	}
	public void setConnectionPerson(String connectionPerson) {
		this.connectionPerson = connectionPerson;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	
	
	
	
	
	/*
	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName
				+ ", zip=" + zip + ", address=" + address + ", telephone="
				+ telephone + ", connectionPerson=" + connectionPerson
				+ ", phone=" + phone + ", email=" + email + ", available="
				+ available + "]";
	}*/
}
