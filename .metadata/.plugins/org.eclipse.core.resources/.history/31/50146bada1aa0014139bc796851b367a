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


