package com.example.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class AddItemActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.item_data);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_item, menu);
		return true;
	}

	public void addAnItem(View v){ //GET TEXT FROM BUTTON PRESS!!!!
		EditText name = (EditText)findViewById(R.id.nameInput); 
		String itemName = name.getText().toString(); 
		EditText date = (EditText)findViewById(R.id.dateInput); 
		String itemDate = date.getText().toString(); 
		EditText currency = (EditText)findViewById(R.id.currencyInput); 
		String itemCurrency = currency.getText().toString(); 
		EditText cost = (EditText)findViewById(R.id.costInput); 
		String itemCost = cost.getText().toString(); //NEED TO CHANGE TO INT REMEMBER TO CHANGE TO INT
		EditText description = (EditText)findViewById(R.id.descriptionInput1);
		String itemDescription = description.getText().toString();
		Item item = new Item(itemName,itemDate,itemCurrency,1,itemDescription);
		Globals.claimList.getClaimItemList().addItem(item);
		Intent intent = new Intent(AddItemActivity.this, ClaimMenuActivity.class);
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
