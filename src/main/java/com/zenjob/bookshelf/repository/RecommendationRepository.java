package com.zenjob.bookshelf.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.zenjob.bookshelf.model.Recommendation;

@Repository
public class RecommendationRepository {
	
	private final Map<String, Recommendation> userRecommendationMap = new HashMap<>();
	
	public Recommendation getUserRecommendation(String userName) {
		return Optional.of(userRecommendationMap.get(userName)).orElse(new Recommendation(userName, new ArrayList<>()));
	}
	
	public void updateUserRecommendation(String userName, List<String> recommendedBookAsinList) {
		final boolean hasKey = userRecommendationMap.containsKey(userName);
		
		if (hasKey) {
			userRecommendationMap.get(userName).getBookAsinList().addAll(recommendedBookAsinList);
		} else {
			userRecommendationMap.put(userName, new Recommendation(userName, recommendedBookAsinList));
		}
		
	}
	
}