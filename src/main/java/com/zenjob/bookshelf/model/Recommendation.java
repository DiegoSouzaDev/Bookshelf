package com.zenjob.bookshelf.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Recommendation {
	private String userName;
	private List<String> bookAsinList;
}
