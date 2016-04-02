package com.wgl.supermarket.domain;

import java.io.Serializable;

public class Goods implements Serializable {
	private static final long serialVersionUID = -7668124343209297642L;
	
	private int id;
	private String goodsname;
	private String produceplace;
	private String size;
	private String goodspackage;
	private String productcode;
	private String promitcode;
	private int available;
	private int shelflife;
	private String shelflifeunit;
	private String barcode;
	private String description;
	private int providerid;
	private int categoryid;
	
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
	public static long getSerialversionuid() {
		return serialVersionUID;
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
