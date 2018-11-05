package com.zenjob.bookshelf.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zenjob.bookshelf.model.Book;
import com.zenjob.bookshelf.service.BookService;

import lombok.Getter;

@Repository
public class BookRepository {

	@Autowired
	private BookService bookService;

	@Getter
	private List<Book> bookDataList;

	@PostConstruct
	protected void load() throws FileNotFoundException, IOException {
		bookDataList = bookService.loadBookListFromResources();
	}
	
	public List<Book> getBookRecommendation() {
		return bookDataList.stream().limit(20).collect(Collectors.toList());
	}

}