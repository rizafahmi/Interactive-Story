package com.elixirdose.interactivestory.ui;

import com.elixirdose.interactivestory.R;
import com.elixirdose.interactivestory.R.id;
import com.elixirdose.interactivestory.R.layout;
import com.elixirdose.interactivestory.R.menu;
import com.elixirdose.interactivestory.model.Page;
import com.elixirdose.interactivestory.model.Story;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryActivity extends Activity {
	
	private Story mStory = new Story();
	
	private ImageView mImageView;
	private TextView mTextView;
	private Button mChoice1Button;
	private Button mChoice2Button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_story);
		
		
		Intent mIntent = getIntent();
		String name = mIntent.getStringExtra("name");
		
		mImageView = (ImageView) findViewById(R.id.storyImageView);
		mTextView = (TextView) findViewById(R.id.storyTextView);
		mChoice1Button = (Button) findViewById(R.id.choice1Button);
		mChoice2Button = (Button) findViewById(R.id.choice2Button);
		
		loadPage(0);
	}
	
	private void loadPage(int choice) {
		Page page = mStory.getPage(choice);
		
		Drawable drawable = getResources().getDrawable(page.getmImageId());
		mImageView.setImageDrawable(drawable);
		mTextView.setText(page.getmText());
		mChoice1Button.setText(page.getmChoice1().getmText());
		mChoice2Button.setText(page.getmChoice2().getmText());
	}

}
