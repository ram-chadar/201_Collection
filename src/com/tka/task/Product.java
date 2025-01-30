package com.tka.task;

public class Product {
	
	private int productId;
	private String productName;
	private int productQty;
	private double prodcutPrice;
	private String mfgDate;
	private String expDate;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int productId, String productName, int productQty, double prodcutPrice, String mfgDate,
			String expDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQty = productQty;
		this.prodcutPrice = prodcutPrice;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductQty() {
		return productQty;
	}


	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}


	public double getProdcutPrice() {
		return prodcutPrice;
	}


	public void setProdcutPrice(double prodcutPrice) {
		this.prodcutPrice = prodcutPrice;
	}


	public String getMfgDate() {
		return mfgDate;
	}


	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}


	public String getExpDate() {
		return expDate;
	}


	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQty=" + productQty
				+ ", prodcutPrice=" + prodcutPrice + ", mfgDate=" + mfgDate + ", expDate=" + expDate + "]";
	}
	
	

}
