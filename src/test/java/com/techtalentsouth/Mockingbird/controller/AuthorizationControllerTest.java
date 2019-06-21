package com.techtalentsouth.Mockingbird.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AuthorizationControllerTest {
	
	AuthorizationController authController;

	@Before
	public void setUp() throws Exception {
		authController = new AuthorizationController();
	}

	@Test
	public void testLogin() {
		assertEquals("login",authController.login());
	}

	@Test
	public void testRegistration() {
		assertEquals("registration",authController.registration(model));
	}

	@Test
	public void testCreateNewUser() {
		assertEquals("registraion",authController.createNewUser(user, bindingResult, model));
	}

}
