package com.example.assignment1;

import java.text.DecimalFormat;


public class Expenses {
	
	double value;
	String currencyType;
	
	public Expenses(String newCurrency,double newValue){
	currencyType = newCurrency;
	value = newValue;
	}
	public String getCurrency(){
		return currencyType;
	}
	public String getValue(){
		DecimalFormat df = new DecimalFormat("0.00##");
		String stringValue = df.format(value);
		return (stringValue+" "+currencyType);
	}
	public void changeTotalExpense(double valueChange){
		value += valueChange;
	}
	
}
