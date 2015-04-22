package net.shop.vo;

import java.util.Date;

/*
 	First Editor : Jisung Jeon (cbajs20@gmail.com)
	Last Editor  :
	Date         : 2015-04-21
*/
public class OrdersVO {
	
	private int number;
	private Date orderDate;
	private String orderNow;
	private String userEmail;
	private String userName;
	private int goodsNumber;
	private String userAddress;
	private int userPostcode;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderNow() {
		return orderNow;
	}
	public void setOrderNow(String orderNow) {
		this.orderNow = orderNow;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(int goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public int getUserPostcode() {
		return userPostcode;
	}
	public void setUserPostcode(int userPostcode) {
		this.userPostcode = userPostcode;
	}
}
