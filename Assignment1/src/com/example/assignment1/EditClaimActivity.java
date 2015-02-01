package com.example.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class EditClaimActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_claim_data);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_claim, menu);
		return true;
	}
	
	public void changeClaimName(View v){ //GET TEXT FROM BUTTON PRESS!!!!
		EditText input = (EditText)findViewById(R.id.editClaimNameInput); //taking from text input 
		String newClaimName = input.getText().toString(); //convert to string
		Globals.claimList.changeClaimName(newClaimName);//change name
		Intent intent = new Intent(EditClaimActivity.this, MainActivity.class);
		startActivity(intent);//button press takes back to main
	}
	
	public void deleteClaim(View v){
		Globals.claimList.removeClaim();//bad programming... removes last indexed claim in ClaimList class
		Intent intent = new Intent(EditClaimActivity.this, MainActivity.class);
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
