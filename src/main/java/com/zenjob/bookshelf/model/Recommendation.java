package com.zenjob.bookshelf.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Recommendation {
	private User user;
	private Book book;
	private boolean hasFeedback;
}
