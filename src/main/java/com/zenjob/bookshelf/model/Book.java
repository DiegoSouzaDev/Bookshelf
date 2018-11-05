package com.zenjob.bookshelf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
	
	private String asin;
	private String title;
	private String author;
	private String gender;
	
}
