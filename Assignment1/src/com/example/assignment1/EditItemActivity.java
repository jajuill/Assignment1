package com.example.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class EditItemActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_item_data);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_item, menu);
		return true;
	}

	public void editAnItem(View v){ //GET TEXT FROM BUTTON PRESS!!!!
		EditText name = (EditText)findViewById(R.id.editNameInput); 
		String itemName = name.getText().toString(); 
		EditText date = (EditText)findViewById(R.id.editDateInput2); 
		String itemDate = date.getText().toString(); 
		EditText currency = (EditText)findViewById(R.id.editCurrencyInput); 
		String itemCurrency = currency.getText().toString(); 
		EditText cost = (EditText)findViewById(R.id.editCostInput); 
		String tempCost = cost.getText().toString(); //NEED TO CHANGE TO INT REMEMBER TO CHANGE TO INT
		//Toast.makeText(getBaseContext(),(String)itemName,Toast.LENGTH_SHORT).show();
		
		double itemCost = 0.001; //if itemCost = 0.001, then no change
		if (tempCost != "")
			itemCost = Integer.parseInt(tempCost);
		EditText description = (EditText)findViewById(R.id.editDescriptionInput);
		String itemDescription = description.getText().toString();
		Globals.claimList.getClaimItemList().changeItemName(itemName,itemDate,itemCurrency,itemCost,itemDescription);
		Intent intent = new Intent(EditItemActivity.this, ClaimMenuActivity.class);
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
