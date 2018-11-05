package com.zenjob.bookshelf.enumerator;

public enum FeedBackNatureEnum {
	
	POSITIVE(1), NEGATIVE(-1), NEUTRAL(0);
	
	public int natureValue;
	
	private FeedBackNatureEnum(int natureValue) {
		this.natureValue = natureValue;
	}

}
