package com.wgl.supermarket.domain;

import java.io.Serializable;

public class Goods implements Serializable {
	private static final long serialVersionUID = -7668124343209297642L;
	
	private int id;                  //商品id
	private String goodsname;        //商品名称
	private String produceplace;     //产地
	private String size;             //规格
	private String goodspackage;     //包装
	private String productcode;      //生产批号
	private String promitcode;       //批准文号
	private int available;           //状态
	private int shelflife;           //保质期
	private String shelflifeunit;    //保质期单位
	private String barcode;          //条形码
	private String description;      //商品描述
	private int providerid;          //供应商id（外键）
	private int categoryid;          //商品类别id（外键）
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getProduceplace() {
		return produceplace;
	}
	public void setProduceplace(String produceplace) {
		this.produceplace = produceplace;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getGoodspackage() {
		return goodspackage;
	}
	public void setGoodspackage(String goodspackage) {
		this.goodspackage = goodspackage;
	}
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getPromitcode() {
		return promitcode;
	}
	public void setPromitcode(String promitcode) {
		this.promitcode = promitcode;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public int getShelflife() {
		return shelflife;
	}
	public void setShelflife(int shelflife) {
		this.shelflife = shelflife;
	}
	public String getShelflifeunit() {
		return shelflifeunit;
	}
	public void setShelflifeunit(String shelflifeunit) {
		this.shelflifeunit = shelflifeunit;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getProviderid() {
		return providerid;
	}
	public void setProviderid(int providerid) {
		this.providerid = providerid;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
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
