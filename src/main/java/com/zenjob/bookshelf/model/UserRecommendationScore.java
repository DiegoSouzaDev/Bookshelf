package com.zenjob.bookshelf.model;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRecommendationScore {
	private final Map<String, Integer> genderMap = new HashMap<String, Integer>();
	private final Map<String, Integer> authorMap = new HashMap<String, Integer>();
}
