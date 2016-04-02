package com.wgl.supermarket.domain;

import java.io.Serializable;

public class Rolepower implements Serializable {
	private static final long serialVersionUID = -7668124343209297642L;
	
	private int id;
	private int roleid;  //角色id（外键）
	private int powerid; //权限id（外键）
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public int getPowerid() {
		return powerid;
	}
	public void setPowerid(int powerid) {
		this.powerid = powerid;
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
