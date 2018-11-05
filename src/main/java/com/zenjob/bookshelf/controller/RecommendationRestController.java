package com.zenjob.bookshelf.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zenjob.bookshelf.model.Recommendation;
import com.zenjob.bookshelf.service.RecommendationService;

@RestController
@RequestMapping(path = "/recommendation")
public class RecommendationRestController {

	@Autowired
	private RecommendationService service;
	
	@GetMapping(path = "/{username}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Recommendation> getByUserName(@PathParam("usename") String useName) {
		return service.getRecommendations(useName);
	}
}
