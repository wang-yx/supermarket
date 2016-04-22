package com.wgl.supermarket.warehouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Goodsnum implements Serializable {
	private static final long serialVersionUID = -7668124343209297642L;
	//id
	private Integer id;
	//进货数量
	private Integer number;
	//进货批号
	private String purchasecode; 
	//进货日期
	private Date productdate;
	//第一次盘点数量
	private Integer firstchecknum;
	//第一次盘点日期
	private Date firstcheckdate;
	//第一次盘点人员
	private String firstcheckman;
	//第二次盘点数量
	private Integer secchecknum;
	//第二次盘点日期
	private Date seccheckdate;
	//第二次盘点人员
	private String seccheckman;
	//最终商品数量
	private Integer finalnum;
	//折扣率
	private Double discountrate;
	//进货价
	private Double buyprice;
	//出货价（第二次价格）
	private Double secondprice;
	//sellprice
	private Double sellprice;
	//仓库id（外键）
	private Integer warehouseid;
	//商品id（外键）
	private Integer goodsid;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
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
	public Integer getFirstchecknum() {
		return firstchecknum;
	}
	public void setFirstchecknum(Integer firstchecknum) {
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
	public Integer getSecchecknum() {
		return secchecknum;
	}
	public void setSecchecknum(Integer secchecknum) {
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
	public Integer getFinalnum() {
		return finalnum;
	}
	public void setFinalnum(Integer finalnum) {
		this.finalnum = finalnum;
	}
	public Double getDiscountrate() {
		return discountrate;
	}
	public void setDiscountrate(Double discountrate) {
		this.discountrate = discountrate;
	}
	public Double getBuyprice() {
		return buyprice;
	}
	public void setBuyprice(Double buyprice) {
		this.buyprice = buyprice;
	}
	public Double getSecondprice() {
		return secondprice;
	}
	public void setSecondprice(Double secondprice) {
		this.secondprice = secondprice;
	}
	public Double getSellprice() {
		return sellprice;
	}
	public void setSellprice(Double sellprice) {
		this.sellprice = sellprice;
	}
	public Integer getWarehouseid() {
		return warehouseid;
	}
	public void setWarehouseid(Integer warehouseid) {
		this.warehouseid = warehouseid;
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
