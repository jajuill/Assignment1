package com.example.assignment1;

import java.util.ArrayList;

import com.example.assignment1.ItemList;

public class Claim {
	protected ItemList itemList;
	protected String claimName; //whatever inherits this can use it
	
	public Claim(String claimName) {
		this.claimName = claimName;
		itemList = new ItemList();
	}
	
	public void changeName(String newName){
		claimName = newName;
	}

	public Object getName() {//why return object and not string?
		return this.claimName; //apparently the "this" is optional
	}

	public ItemList getItemList(){
		return itemList;
	}
}
