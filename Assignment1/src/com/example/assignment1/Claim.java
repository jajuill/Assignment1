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

Claim object contains an ItemList object and keeps track of all of the items related to the claim
Also contains claim submission status
*/


package com.example.assignment1;

import com.example.assignment1.ItemList;
//if I was to re-do this, I'd make Claim inherit from ClaimList and not have an ItemList class
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

	
	
	public Object getName() {//0:in progress,1:submitted,2:returned,3:approved
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
