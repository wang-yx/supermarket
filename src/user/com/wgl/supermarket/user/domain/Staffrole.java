package com.wgl.supermarket.user.domain;

import java.io.Serializable;

public class Staffrole implements Serializable {
	private static final long serialVersionUID = -7668124343209297642L;
	
	private int id;
	private int userid;  //员工id（外键）
	private int roleid;  //角色id（外键）
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
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
