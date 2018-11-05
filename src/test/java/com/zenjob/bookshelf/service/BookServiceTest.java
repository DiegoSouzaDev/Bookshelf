package com.zenjob.bookshelf.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.zenjob.bookshelf.model.Book;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {
	
	@InjectMocks
	private BookService service;
	
	@Test
	public void loadDataFromRescourcesTest() throws FileNotFoundException, IOException {
		final List<Book> bookList = service.loadBookListFromResources();
		Assert.assertThat(bookList.size(), CoreMatchers.equalTo(1100));
	}
}
