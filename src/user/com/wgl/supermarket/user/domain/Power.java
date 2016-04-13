package com.wgl.supermarket.user.domain;

import java.io.Serializable;

public class Power implements Serializable {
	private static final long serialVersionUID = -7668124343209297642L;
	
	private int id;
	private String powername; //权限名称
	private String powertype; //权限类型（1=》总仓库权限，2=》分仓库的权限）
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPowername() {
		return powername;
	}
	public void setPowername(String powername) {
		this.powername = powername;
	}
	public String getPowertype() {
		return powertype;
	}
	public void setPowertype(String powertype) {
		this.powertype = powertype;
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
