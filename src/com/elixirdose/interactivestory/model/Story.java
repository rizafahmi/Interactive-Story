package com.elixirdose.interactivestory.model;

import com.elixirdose.interactivestory.R;

public class Story {
	private Page[] mPages;
	
	public Story() {
		mPages = new Page[7];
		
		mPages[0] = new Page(
				R.drawable.page0,
				"Testing 123",
				new Choice("Stop and investigate", 1),
				new Choice("Continue home to Earth", 2)
				);
		
	}
	
	public Page getPage(int pageNumber) {
		return mPages[pageNumber];
	}
	
	
}
