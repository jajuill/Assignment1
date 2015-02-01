package com.example.assignment1;

import com.example.assignment1.ItemList;

public class Claim {
	protected ItemList itemList;
	protected String claimName; //whatever inherits this can use it
	protected int submit = 0;
	
	public Claim(String claimName) {
		this.claimName = claimName;
		itemList = new ItemList();
	}
	public void changeStatus(int submitChange){
		submit = submitChange;//0:in progress,1:submitted,2:returned,3:approved
	}
	public int getClaimStatus(){
		return submit;
	}
	public void changeName(String newName){
		claimName = newName;
	}

	
	
	public Object getName() {//why return object and not string?
		if (submit == 0)
			return (claimName+" - in progress");
		else if (submit == 1)
			return (claimName+" - submitted");
		else if (submit == 2)
			return (claimName+" - returned");
		else
			return (claimName+" - approved");
	}

	public ItemList getItemList(){
		return itemList;
	}
}
