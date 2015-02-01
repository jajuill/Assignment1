package com.example.assignment1.test;

import java.util.ArrayList;
import java.util.Collection;

import com.example.assignment1.Claim;
import com.example.assignment1.ClaimList;

import junit.framework.TestCase;

public class ClaimListTest extends TestCase {
	public void testEmptyClaimList() {
		ClaimList claimList = new ClaimList();
		Collection<Claim> claim = claimList.getClaim();
		assertTrue("Empty Claim List", claim.size() == 0); //can use == because integer and not object
	}
	public void testAddClaimList() {
		ClaimList claimList = new ClaimList();
		String claim1Name = "This Claim";
		String claim2Name = "That Claim";
		Claim claim1 = new Claim(claim1Name);
		Claim claim2 = new Claim(claim2Name);
		claimList.addClaim(claim1);
		claimList.addClaim(claim2);
		ArrayList<String> listNames = new ArrayList<String>();
		listNames = claimList.getClaimList();
		for(int i=0;i<listNames.size();i++){ //how can I have 2 versions of claimList that work in different objects?
			String str = new String(listNames.get(i));
			System.out.println(str);
		}
		/*Collection<Claim> claim = claimList.getClaim();
		assertTrue("Empty Claim List", claim.size() == 1); //can use == because integer and not object
		assertTrue("Test Claim Not Contained",claim.contains(testClaim));*/
	}
	
	public void testRemoveClaim() {
		ClaimList claimList = new ClaimList();
		String claimName = "My Claim";
		Claim testClaim = new Claim(claimName);
		claimList.addClaim(testClaim);
		Collection<Claim> claim = claimList.getClaim(); //claim variable made here
		assertTrue("Claim List Size Isn't Big Enough", claim.size() == 1); //can use == because integer and not object
		assertTrue("",claim.contains(testClaim));
		claimList.removeClaim(testClaim);
		claim = claimList.getClaim(); //overwriting claim variable
		assertTrue("Claim List Size Isn't Small Enough", claim.size() == 0); //can use == because integer and not object
		assertFalse("Test Claim Still Contained?",claim.contains(testClaim));
	}

	public void testChooseClaimList() { //Do I need this?
		ClaimList claimList = new ClaimList();
		String claimName = "My Claim";
		Claim testClaim = new Claim(claimName);
		claimList.addClaim(testClaim); //adds claim to LIST
		Claim claim = claimList.chooseClaim();
		assertTrue("Claim is not null", claim != null); //can use == because integer and not object
		assertTrue("Did I choose the right Claim",claim.equals(testClaim));//prolly doesn't matter
		
		String claimName2 = "My second Claim";
		Claim testClaim2 = new Claim(claimName2);
		claimList.addClaim(testClaim2);
		//Student [] studentArray = { testStudent, testStudentB} // HOW TO MAKE ARRAY
		
	}
}
