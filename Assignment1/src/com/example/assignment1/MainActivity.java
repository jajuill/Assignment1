package com.example.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		updateClaimList(null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void addAClaim(View v){
		Intent intent = new Intent(MainActivity.this, AddClaimActivity.class);
		startActivity(intent);
	}

	public void updateClaimList(View v){ //should this be here>>>?
		//ArrayAdapter found here https://github.com/codepath/android_guides/wiki/Using-an-ArrayAdapter-with-ListView
		ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Globals.claimList.getClaimList());//unfinished
		final ListView listView = (ListView) (findViewById(R.id.claimListView));
		listView.setAdapter(itemsAdapter);
		listView.setClickable(true);
		listView.setOnItemClickListener(new OnItemClickListener() {//find shit out
	        @Override
	        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	        	//Object o = listView.getItemAtPosition(position);
	        	Globals.claimList.setClaimChoice(Globals.claimList.getClaimPosition(position)); //changes tempClaim in ClaimList to clicked claim
	        	//Toast.makeText(getBaseContext(),str,Toast.LENGTH_SHORT).show();
	     		Intent intent = new Intent(MainActivity.this, ClaimMenuActivity.class);
	    		startActivity(intent);
	        	//String str = (String)o;
	        	//Toast.makeText(getBaseContext(),str,Toast.LENGTH_SHORT).show();
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
