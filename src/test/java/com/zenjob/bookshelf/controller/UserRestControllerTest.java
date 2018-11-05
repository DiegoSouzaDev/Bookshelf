package com.zenjob.bookshelf.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureWebMvc
public class UserRestControllerTest {
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext wac;

	@Before
	public void init() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void createUserIT() throws Exception {
		final String userName = "TestUser";
		final String userNotExistContent = "{\"userName\":\"TestUser\"}";
		final String userAlreadyExistContent = "The User Already Exists";

		mockMvc.perform(MockMvcRequestBuilders.post("/user/").accept(MediaType.ALL).content(userName)).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.content().string(userNotExistContent));

		mockMvc.perform(MockMvcRequestBuilders.post("/user/").accept(MediaType.ALL).content(userName)).andExpect(status().isBadRequest())
				.andExpect(MockMvcResultMatchers.content().string(userAlreadyExistContent));
	}

}
