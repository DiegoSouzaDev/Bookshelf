package com.zenjob.bookshelf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zenjob.bookshelf.service.FeedBackService;
import com.zenjob.bookshelf.vo.FeedBackVO;

@RestController
@RequestMapping(path = "/feedback")
public class FeedBackRestController {

	@Autowired
	private FeedBackService service;

	@PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void create(final FeedBackVO feedBackVO) {
		service.saveFeedback(feedBackVO);
	}
}
