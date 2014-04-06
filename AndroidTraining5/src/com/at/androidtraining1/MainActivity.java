package com.at.androidtraining1;

import com.at.androidtraining1.sharedpreferences.SharedPrefsActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	private Button btnListview, btnStyling, btnDatabase, btnSharedPrefs, btnWebview, btnWebServices;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnListview = (Button) findViewById(R.id.btn_listview);
		btnStyling = (Button) findViewById(R.id.btn_styling);
		btnDatabase = (Button) findViewById(R.id.btn_database);
		btnSharedPrefs = (Button) findViewById(R.id.btn_shared_prefs);
		btnWebview = (Button) findViewById(R.id.btn_webview);
		btnWebServices = (Button) findViewById(R.id.btn_web_services);
		
		btnListview.setOnClickListener(this);
		btnStyling.setOnClickListener(this);
		btnDatabase.setOnClickListener(this);
		btnSharedPrefs.setOnClickListener(this);
		btnWebview.setOnClickListener(this);
		btnWebServices.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_listview:
			
			Toast.makeText(getApplicationContext(), "LISTVIEW clicked", Toast.LENGTH_SHORT).show();
			
			break;
			
		case R.id.btn_styling:
			
			Toast.makeText(getApplicationContext(), "STYLING clicked", Toast.LENGTH_SHORT).show();
			
			break;
			
		case R.id.btn_database:
	
			Toast.makeText(getApplicationContext(), "DATABASE clicked", Toast.LENGTH_SHORT).show();
			
			break;
	
		case R.id.btn_shared_prefs:
			
			startActivity(new Intent(getApplicationContext(), SharedPrefsActivity.class));
			
			break;
			
		case R.id.btn_webview:
			
			Toast.makeText(getApplicationContext(), "WEBVIEW clicked", Toast.LENGTH_SHORT).show();
			
			break;
			
		case R.id.btn_web_services:
			
			Toast.makeText(getApplicationContext(), "WEB SERVICES clicked", Toast.LENGTH_SHORT).show();
			
			break;

		default:
			break;
		}
		
	}

}
