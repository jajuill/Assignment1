package com.example.assignment1;

import java.util.ArrayList;

import com.example.assignment1.Item;
public class ItemList {
	
	protected ArrayList<Item> itemList;
	
	public ItemList() {
		itemList = new ArrayList<Item>();
	}
	Item tempItem;
	//found from http://www.vogella.com/tutorials/AndroidListView/article.html
	public ArrayList<String> getItemList(){
		final ArrayList<String> listNames = new ArrayList<String>();
		for(int i=0;i<itemList.size();i++){ //how can I have 2 versions of itemList that work in different objects?
			listNames.add((String) (itemList.get(i)).getName());
		}
		return listNames;
	}
	public void changeItemName(String newItemName){
		itemList.get(itemList.indexOf(tempItem)).changeName(newItemName);
	}
	public void addItem(Item myItem) {
		itemList.add(myItem);
	}

	public void removeItem() {
		itemList.remove(tempItem);
	}

	public Item getItem(int index) {
		return itemList.get(index);
	}
	public void setItemChoice(Item o) { //Oject should be Item
		tempItem = o; //returns index value of Item selected
	}

		
}
