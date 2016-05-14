package com.elixirdose.interactivestory.model;

public class Choice {
	private String mText;
	private int mNextPage;
	
	public Choice(String mText, int mNextPage) {
		super();
		this.mText = mText;
		this.mNextPage = mNextPage;
	}
	public String getmText() {
		return mText;
	}
	public void setmText(String mText) {
		this.mText = mText;
	}
	public int getmNextPage() {
		return mNextPage;
	}
	public void setmNextPage(int mNextPage) {
		this.mNextPage = mNextPage;
	}
}
