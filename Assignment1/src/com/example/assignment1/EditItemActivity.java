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

*Edits item info
*/
package com.example.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


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

	public void editAnItem(View v){ //GET TEXT FROM INPUT ON BUTTON PRESS!!!!
		if (Globals.claimList.getClaim().getClaimStatus() == 1 || Globals.claimList.getClaim().getClaimStatus() == 3)//button doesn't work if status doesn't allow it
			Toast.makeText(getBaseContext(),"Cannot edit, claim is submitted or approved",Toast.LENGTH_SHORT).show();
		else{
		EditText name = (EditText)findViewById(R.id.editNameInput); 
		String itemName = name.getText().toString(); 
		EditText date = (EditText)findViewById(R.id.editDateInput2); 
		String itemDate = date.getText().toString(); 
		EditText currency = (EditText)findViewById(R.id.editCurrencyInput); 
		String itemCurrency = currency.getText().toString(); 
		EditText cost = (EditText)findViewById(R.id.editCostInput); 
		String tempCost = cost.getText().toString(); //NEED TO CHANGE TO DOUBLE REMEMBER TO CHANGE TO DOUBLE
		
		double itemCost = 0.001; //if itemCost = 0.001, then no change
		if (tempCost != "")//failed error handling of empty cost inputs
			itemCost = Double.parseDouble(tempCost);
		EditText description = (EditText)findViewById(R.id.editDescriptionInput);
		String itemDescription = description.getText().toString();
		Globals.claimList.getClaimItemList().changeItemName(itemName,itemDate,itemCurrency,itemCost,itemDescription);
		Intent intent = new Intent(EditItemActivity.this, ClaimMenuActivity.class);
		startActivity(intent);//button press takes back to main 
	}
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
