package com.food.ordercreator.beans;

public class Items {
	

	private String itemName;
	
	private int quantity;
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "{\"itemName\":\"" + itemName + "\", \"quantity\":" + quantity + "}";
	}


}
