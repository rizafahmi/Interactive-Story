package com.elixirdose.interactivestory;

import android.app.Activity;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText mNameEditText;
	private Button mStartButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mNameEditText = (EditText) findViewById(R.id.nameEditText);
		mStartButton = (Button) findViewById(R.id.startButton);
		
		OnClickListener mOnClickListener = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String name = mNameEditText.getEditableText().toString();
				Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();
				startStory();
			}
		};
		
		mStartButton.setOnClickListener(mOnClickListener);
	}
	
	private void startStory() {
		Intent mIntent = new Intent(this, StoryActivity.class);
		startActivity(mIntent);
	}
}
