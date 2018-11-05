package com.zenjob.bookshelf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenjob.bookshelf.model.Recommendation;
import com.zenjob.bookshelf.repository.RecommendationRepository;

@Service
public class RecommendationService {
	
	@Autowired
	private BookService bookService;
	@Autowired
	private RecommendationService recommendationService;
	@Autowired
	private RecommendationRepository recommendationRepository;

	public List<Recommendation> getRecommendations(final String userName) {
		final Recommendation userAlreadyReccommendedBooks = getUserRecommendation(userName);
		
		return bookService.getRecommendation(userName);
	}
	
	private Recommendation getUserRecommendation(final String userName) {
		return recommendationRepository.getUserRecommendation(userName);

	}
	
}
