package com.example.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class AddClaimActivity extends Activity {	
			
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_claim_data);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_claim, menu);
		return true;
	}
	
	public void addAClaim(View v){ //GET TEXT FROM BUTTON PRESS!!!!
		EditText input = (EditText)findViewById(R.id.addClaimInput); //taking from text input 
		String claimName = input.getText().toString(); //convert to string
		Claim claim = new Claim(claimName);
		Globals.claimList.addClaim(claim);
		Intent intent = new Intent(AddClaimActivity.this, MainActivity.class);
		startActivity(intent);//button press takes back to main
	}


	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
