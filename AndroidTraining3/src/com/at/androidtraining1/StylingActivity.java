package com.at.androidtraining1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class StylingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_styling);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.styling, menu);
		return true;
	}

}
