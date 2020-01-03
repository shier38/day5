package com.bawei.vo;

import java.io.Serializable;

public class GoodsVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String startPrice;
	private String endPrice;
	private String startSales;
	private String endSales;
	private String orderColum;//排序字段 价格，销售百分比
	private String orderMethod;//排序方法  asc ,desc
	public String getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}
	public String getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}
	public String getStartSales() {
		return startSales;
	}
	public void setStartSales(String startSales) {
		this.startSales = startSales;
	}
	public String getEndSales() {
		return endSales;
	}
	public void setEndSales(String endSales) {
		this.endSales = endSales;
	}
	public String getOrderColum() {
		return orderColum;
	}
	public void setOrderColum(String orderColum) {
		this.orderColum = orderColum;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	public GoodsVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsVo(String startPrice, String endPrice, String startSales, String endSales, String orderColum,
			String orderMethod) {
		super();
		this.startPrice = startPrice;
		this.endPrice = endPrice;
		this.startSales = startSales;
		this.endSales = endSales;
		this.orderColum = orderColum;
		this.orderMethod = orderMethod;
	}
	@Override
	public String toString() {
		return "GoodsVo [startPrice=" + startPrice + ", endPrice=" + endPrice + ", startSales=" + startSales
				+ ", endSales=" + endSales + ", orderColum=" + orderColum + ", orderMethod=" + orderMethod + "]";
	}
	
	
	
}
