package com.zenjob.bookshelf.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.zenjob.bookshelf.model.Book;
import com.zenjob.bookshelf.model.Recommendation;
import com.zenjob.bookshelf.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> loadBookListFromResources() throws FileNotFoundException, IOException {
		final List<String> unparsedBookList = Files.readAllLines(Paths.get(ResourceUtils.getFile("classpath:bookData.txt").getPath()));
		return unparsedBookList.stream().map(this::parseBook).collect(Collectors.toList());
	}
	
	protected Book parseBook(String line) {
		final String[] arguments = line.split(";");
		return new Book(arguments[0], arguments[1], arguments[2], arguments[3]);
		
	}
	
	public List<Book> getRecommendations() {

		bookRepository.getBookRecommendation()
		return ;
	}

}
