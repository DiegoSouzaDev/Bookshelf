package com.zenjob.bookshelf.vo;

import com.zenjob.bookshelf.enumerator.FeedBackNatureEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FeedBackVO {

	private String userName;
	private Long asin;
	private FeedBackNatureEnum nature;

}
