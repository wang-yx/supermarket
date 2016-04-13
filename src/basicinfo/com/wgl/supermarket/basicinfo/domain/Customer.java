package com.wgl.supermarket.basicinfo.domain;

import java.io.Serializable;

public class Customer implements Serializable {
	private static final long serialVersionUID = -7668124343209297642L;
	private int id;                   //客户id
	private String customerName;      //客户全称
	private String zip;               //客户邮编
	private String address;           //客户公司地址
	private String telephone;         //客户公司电话
	private String connectionPerson;  //联系人
	private String phone;             //联系电话
	private String email;             //联系人信箱
	private int available;            //状态
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName
				+ ", zip=" + zip + ", address=" + address + ", telephone="
				+ telephone + ", connectionPerson=" + connectionPerson
				+ ", phone=" + phone + ", email=" + email + ", available="
				+ available + "]";
	}
}
