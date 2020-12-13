package com.food.ordercreator.response;

public class OrderCreateResponse {
	
	private int orderNum;
	
	private String orderStatus;
	

	public OrderCreateResponse(int orderNum, String orderStatus) {
		super();
		this.orderNum = orderNum;
		this.orderStatus = orderStatus;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	@Override
	public String toString() {
		return "{ \"orderNum\":" + orderNum + ", \"orderStatus\": \"" + orderStatus + "\" }";
	}
	
	

}
