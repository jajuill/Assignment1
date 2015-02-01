package com.example.assignment1;

import java.util.ArrayList;

import com.example.assignment1.Item;
public class ItemList {
	
	protected ArrayList<Item> itemList;
	protected ArrayList<Expenses> expenseList;
	public ItemList() {
		itemList = new ArrayList<Item>();
		expenseList = new ArrayList<Expenses>();
	}
	Item tempItem;
	//found from http://www.vogella.com/tutorials/AndroidListView/article.html
	public ArrayList<String> getItemList(){
		final ArrayList<String> listNames = new ArrayList<String>();
		for(int i=0;i<itemList.size();i++){ //how can I have 2 versions of itemList that work in different objects?
			listNames.add((itemList.get(i)).getName());
		}
		return listNames;
	}
	public void changeItemName(String newName, String newDate, String newCurrency, double newCost, String newDescription){//just realized how pointless this is
		changeExpense((itemList.get(itemList.indexOf(tempItem)).getCost())*-1,itemList.get(itemList.indexOf(tempItem)).getCurrency());
		itemList.get(itemList.indexOf(tempItem)).changeName(newName, newDate, newCurrency, newCost, newDescription);//should've just returned the item object
		changeExpense(newCost,newCurrency);
	}
	public void addItem(Item myItem) {
		itemList.add(myItem);
		changeExpense(myItem.getCost(),myItem.getCurrency());
	}

	private void changeExpense(double value, String curr){//need to check expense string
		for(int i=0;i<=expenseList.size();i++){//<=   !!!!!!!!!!!!!!!!!!!
			if (i == expenseList.size()){//then must not have currency yet
				Expenses expense = new Expenses(curr,value);
				expenseList.add(expense);
				break;//heh, have to break otherwise comparison ahead will break everything
			}
			else if (expenseList.get(i).getCurrency().equals(curr)){ 
				expenseList.get(i).changeTotalExpense(value);
				break;
			}
		}
	}
	
	public ArrayList<String> getExpenseList(){
		final ArrayList<String> listNames = new ArrayList<String>();
		for(int i=0;i<expenseList.size();i++){ 
			listNames.add((expenseList.get(i)).getValue());
		}
		return listNames;
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
