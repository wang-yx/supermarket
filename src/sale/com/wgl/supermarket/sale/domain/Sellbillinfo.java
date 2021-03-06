package com.wgl.supermarket.sale.domain;

import java.io.Serializable;
import java.util.Date;

public class Sellbillinfo implements Serializable {
	private static final long serialVersionUID = -7668124343209297642L;
	//销售和退货的信息单id
	private Integer id;
	//支付方式
	private String paytype;
	//交易时间
	private Date inporttime;
	//操作员
	private String operateperson;
	//数量
	private Integer number;
	//备注
	private String comment;
	//单据类型（1=销售单，2=销售退货单）
	private Integer billtype;
	//客户id（外键）
	private Integer customerid;
	//仓库id（外键）
	private Integer warehouseid;
	//员工id（外键）
	private Integer userid;
	//商品id（外键）
	private Integer goodsid;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getBilltype() {
		return billtype;
	}
	public void setBilltype(Integer billtype) {
		this.billtype = billtype;
	}
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public Integer getWarehouseid() {
		return warehouseid;
	}
	public void setWarehouseid(Integer warehouseid) {
		this.warehouseid = warehouseid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(Integer goodsid) {
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
