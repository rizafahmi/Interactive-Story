package com.elixirdose.interactivestory.model;

import com.elixirdose.interactivestory.R;

public class Story {
	private Page[] mPages;
	
	public Story() {
		mPages = new Page[7];
		
		mPages[0].setmImageId(R.drawable.page0);
		mPages[0].setmText("Test");
		mPages[0].setmChoice1(new Choice());
		mPages[0].setmChoice2(new Choice());
		
	}
	
	
}
