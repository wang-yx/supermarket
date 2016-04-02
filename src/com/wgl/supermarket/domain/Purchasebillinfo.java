package com.wgl.supermarket.domain;

import java.io.Serializable;
import java.util.Date;

public class Purchasebillinfo implements Serializable {
	private static final long serialVersionUID = -7668124343209297642L;
	
	
	//进货退货单据信息id
	private int id;
	//支付方式
	private String paytype;
	//交易时间
	private Date inporttime;
	//操作员
	private String operateperson;
	//数量
	private int number;
	//备注
	private String comment;
	//单据类型（1 = 进货单，2 = 退货单）
	private int billtype;
	//供应商id（外键）
	private int providerid;
	//仓库id（外键）
	private int warehouseid;
	//员工id（外键）
	private int userid;
	//商品id（外键）
	private int goodsid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPaytype() {
		return paytype;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	public Date getInporttime() {
		return inporttime;
	}
	public void setInporttime(Date inporttime) {
		this.inporttime = inporttime;
	}
	public String getOperateperson() {
		return operateperson;
	}
	public void setOperateperson(String operateperson) {
		this.operateperson = operateperson;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getBilltype() {
		return billtype;
	}
	public void setBilltype(int billtype) {
		this.billtype = billtype;
	}
	public int getProviderid() {
		return providerid;
	}
	public void setProviderid(int providerid) {
		this.providerid = providerid;
	}
	public int getWarehouseid() {
		return warehouseid;
	}
	public void setWarehouseid(int warehouseid) {
		this.warehouseid = warehouseid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
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
