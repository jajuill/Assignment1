package com.example.assignment1;

import java.util.ArrayList;
import java.util.Collection;

import com.example.assignment1.Claim;

public class ClaimList {

	protected ArrayList<Claim> claimList;
	
	public ClaimList() {
		claimList = new ArrayList<Claim>();
	}
	
	public Collection<Claim> getClaim() { //Collection<Claim>  brackets mean of type Collection but has Claim parameter (type)
		return claimList;
	}

	public void addClaim(Claim testClaim) {//didn't need to fill in until it's shown that test doesn't pass
		claimList.add(testClaim);
	}

	public void removeClaim(Claim testClaim) {
		claimList.remove(testClaim);
		
	}

	public Claim chooseClaim() {
		return claimList.get(0);
	}

		
		
	}


