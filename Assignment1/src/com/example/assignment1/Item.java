/*This is free and unencumbered software released into the public domain.
Anyone is free to copy, modify, publish, use, compile, sell, or
distribute this software, either in source code form or as a compiled
binary, for any purpose, commercial or non-commercial, and by any
means.
In jurisdictions that recognize copyright laws, the author or authors
of this software dedicate any and all copyright interest in the
software to the public domain. We make this dedication for the benefit
of the public at large and to the detriment of our heirs and
successors. We intend this dedication to be an overt act of
relinquishment in perpetuity of all present and future rights to this
software under copyright law.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.
For more information, please refer to <http://unlicense.org/>

Code written by Matthew "Skinny" McLeod

*Stores item information in object
*/
package com.example.assignment1;

import java.text.DecimalFormat;

public class Item {
	protected String itemName;
	protected String itemDate;
	protected String itemCurrency;
	protected double itemCost;
	protected String itemDescription;
	
	public Item(String itemName2, String itemDate2, String itemCurrency2, double itemCost2, String itemDescription2) {
		this.itemName = itemName2;
		this.itemDate = itemDate2;
		this.itemCurrency = itemCurrency2;
		this.itemCost = itemCost2;
		this.itemDescription = itemDescription2;
	}
	public String getCurrency(){
		return itemCurrency;
	}
	public double getCost(){
		return itemCost;
	}
	public void changeName(String newName, String newDate, String newCurrency, double newCost, String newDescription) {//will crash when cost input is blank
		//if (newName != null)//attempted error handling for blank inputs.... uncompleted
			itemName = newName;
		//if (newDate != null)
			itemDate = newDate;
		//if (newCurrency != null)
			itemCurrency = newCurrency;
		//if (newCost != 0.001)
			itemCost = newCost;
		//if (newDescription != null)
			itemDescription = newDescription;
		
	}

	public String getName() {//outputs value and currency as single String
		String str = new String("");
		DecimalFormat df = new DecimalFormat("0.00##");
		String stringValue = df.format(itemCost);
		str = (""+itemName+": "+stringValue+" "+itemCurrency);
		return str; //apparently the "this" is optional
	}
}
