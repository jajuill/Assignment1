package com.example.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ClaimMenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.claim_data);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.claim_menu, menu);
		return true;
	}

	public void editClaimGo(View v){
		Intent intent = new Intent(ClaimMenuActivity.this, EditClaimActivity.class);
		startActivity(intent);
	}
	
	public void addItemGo(View v){
		Intent intent = new Intent(ClaimMenuActivity.this, AddItemActivity.class);
		startActivity(intent);
	}
	
	public void updateItemList(View v){
		//ArrayAdapter found here https://github.com/codepath/android_guides/wiki/Using-an-ArrayAdapter-with-ListView
		ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Globals.claimList.getClaimItemList().getItemList());//unfinished
		final ListView listView1 = (ListView) (findViewById(R.id.itemListView));
		listView1.setAdapter(itemsAdapter);
		listView1.setClickable(true);
		listView1.setOnItemClickListener(new OnItemClickListener() {//find shit out
	        @Override
	        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	        	Globals.claimList.getClaimItemList().setItemChoice(Globals.claimList.getClaimItemList().getItem(position)); //changes tempItem in ItemList to clicked claim   of you couldn't tell that from the line
	     		Intent intent = new Intent(ClaimMenuActivity.this, AddItemActivity.class);
	    		startActivity(intent);
	        }
	    });
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
