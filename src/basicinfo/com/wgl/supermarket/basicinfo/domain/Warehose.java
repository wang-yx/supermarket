package com.wgl.supermarket.basicinfo.domain;

import java.io.Serializable;

public class Warehose implements Serializable {
	private static final long serialVersionUID = -7668124343209297642L;
	
	private int id;
	private String name;       //仓库名称
	private int warehousetype; //仓库类型（0=赠品库，1=总仓库，2=分仓库1。。。）
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWarehousetype() {
		return warehousetype;
	}
	public void setWarehousetype(int warehousetype) {
		this.warehousetype = warehousetype;
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
