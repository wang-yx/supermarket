package com.wgl.supermarket.domain;

import java.io.Serializable;

public class Staff implements Serializable {
	private static final long serialVersionUID = -7668124343209297642L;
	
	private int id;
	private String username;  //员工登录名
	private String password;  //员工密码
	private String name;      //员工名称
	private int warehoseid;   //仓库id（外键）
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWarehoseid() {
		return warehoseid;
	}
	public void setWarehoseid(int warehoseid) {
		this.warehoseid = warehoseid;
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
