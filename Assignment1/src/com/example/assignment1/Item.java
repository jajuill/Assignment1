package com.example.assignment1;

public class Item {
	protected String itemName;
	protected String itemDate;
	protected String itemCurrency;
	protected int itemCost;
	protected String itemDescription;
	
	public Item(String itemName2, String itemDate2, String itemCurrency2, int itemCost2, String itemDescription2) {
		this.itemName = itemName2;
		this.itemDate = itemDate2;
		this.itemCurrency = itemCurrency2;
		this.itemCost = itemCost2;
		this.itemDescription = itemDescription2;
	}

	public void changeName(String newName){
		itemName = newName;
	}

	public Object getName() {//why return object and not string?
		return this.itemName; //apparently the "this" is optional
	}
}