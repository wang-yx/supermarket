package com.wgl.supermarket.warehouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Goodsnum implements Serializable {
	private static final long serialVersionUID = -7668124343209297642L;
	//id
	private int id;
	//进货数量
	private int number;
	//进货批号
	private String purchasecode; 
	//进货日期
	private Date productdate;
	//第一次盘点数量
	private int firstchecknum;
	//第一次盘点日期
	private Date firstcheckdate;
	//第一次盘点人员
	private String firstcheckman;
	//第二次盘点数量
	private int secchecknum;
	//第二次盘点日期
	private Date seccheckdate;
	//第二次盘点人员
	private String seccheckman;
	//最终商品数量
	private int finalnum;
	//折扣率
	private double discountrate;
	//进货价
	private double buyprice;
	//出货价（第二次价格）
	private double secondprice;
	//sellprice
	private double sellprice;
	//仓库id（外键）
	private int warehouseid;
	//商品id（外键）
	private int goodsid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPurchasecode() {
		return purchasecode;
	}
	public void setPurchasecode(String purchasecode) {
		this.purchasecode = purchasecode;
	}
	public Date getProductdate() {
		return productdate;
	}
	public void setProductdate(Date productdate) {
		this.productdate = productdate;
	}
	public int getFirstchecknum() {
		return firstchecknum;
	}
	public void setFirstchecknum(int firstchecknum) {
		this.firstchecknum = firstchecknum;
	}
	public Date getFirstcheckdate() {
		return firstcheckdate;
	}
	public void setFirstcheckdate(Date firstcheckdate) {
		this.firstcheckdate = firstcheckdate;
	}
	public String getFirstcheckman() {
		return firstcheckman;
	}
	public void setFirstcheckman(String firstcheckman) {
		this.firstcheckman = firstcheckman;
	}
	public int getSecchecknum() {
		return secchecknum;
	}
	public void setSecchecknum(int secchecknum) {
		this.secchecknum = secchecknum;
	}
	public Date getSeccheckdate() {
		return seccheckdate;
	}
	public void setSeccheckdate(Date seccheckdate) {
		this.seccheckdate = seccheckdate;
	}
	public String getSeccheckman() {
		return seccheckman;
	}
	public void setSeccheckman(String seccheckman) {
		this.seccheckman = seccheckman;
	}
	public int getFinalnum() {
		return finalnum;
	}
	public void setFinalnum(int finalnum) {
		this.finalnum = finalnum;
	}
	public double getDiscountrate() {
		return discountrate;
	}
	public void setDiscountrate(double discountrate) {
		this.discountrate = discountrate;
	}
	public double getBuyprice() {
		return buyprice;
	}
	public void setBuyprice(double buyprice) {
		this.buyprice = buyprice;
	}
	public double getSecondprice() {
		return secondprice;
	}
	public void setSecondprice(double secondprice) {
		this.secondprice = secondprice;
	}
	public double getSellprice() {
		return sellprice;
	}
	public void setSellprice(double sellprice) {
		this.sellprice = sellprice;
	}
	public int getWarehouseid() {
		return warehouseid;
	}
	public void setWarehouseid(int warehouseid) {
		this.warehouseid = warehouseid;
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
