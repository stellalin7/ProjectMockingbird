package com.techtalentsouth.Mockingbird.service;

import static org.junit.Assert.*;

//import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.techtalentsouth.Mockingbird.repository.TagRepository;
import com.techtalentsouth.Mockingbird.repository.TweetRepository;

public class TweetServiceTest {
	
	@Mock
	TweetRepository tweetRepository;
	
	@Mock
	TagRepository tagRepository;
	
	@InjectMocks
	TweetService tweetService;
	


	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllByUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllByUsers() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllWithTag() {
		fail("Not yet implemented");
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

}
