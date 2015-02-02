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

Contains an ArrayList of all claim objects
*/
package com.example.assignment1;

import java.util.ArrayList;

import com.example.assignment1.Claim;

public class ClaimList {
	

	protected ArrayList<Claim> claimList;
	
	public ClaimList() {
		claimList = new ArrayList<Claim>();
	}
	Claim tempClaim;//best way to pass claim object.  SHOULD BE CLAIM NOT OBJ ..but works anyways
	//found from http://www.vogella.com/tutorials/AndroidListView/article.html
	public ArrayList<String> getClaimList(){
		final ArrayList<String> listNames = new ArrayList<String>();
		//listNames.addAll(claimList); //need collection for this
		for(int i=0;i<claimList.size();i++){ //how can I have 2 versions of claimList that work in different objects?
			listNames.add((String) (claimList.get(i)).getName());
		}
		return listNames;//WORKS!
	}
	public void changeClaimName(String newClaimName){
		claimList.get(claimList.indexOf(tempClaim)).changeName(newClaimName);
	}
	public void addClaim(Claim myClaim) {//didn't need to fill in until it's shown that test doesn't pass
		claimList.add(myClaim);
	}

	public void removeClaim() {
		claimList.remove(tempClaim);
	}
	public Claim getClaim(){
		return claimList.get(claimList.indexOf(tempClaim));
	}
	public Claim getClaimPosition(int index) {
		return claimList.get(index);
	}
	public ItemList getClaimItemList(){//a little unnecessary
		return claimList.get(claimList.indexOf(tempClaim)).getItemList();
	}
	public void setClaimChoice(Claim o) { //Oject should be Claim
		tempClaim = o; //returns index value of claim selected
	}

		
}


