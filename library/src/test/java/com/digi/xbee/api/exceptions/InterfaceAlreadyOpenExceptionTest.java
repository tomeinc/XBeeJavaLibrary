/**
 * Copyright (c) 2015 Digi International Inc.,
 * All rights not expressly granted are reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * Digi International Inc. 11001 Bren Road East, Minnetonka, MN 55343
 * =======================================================================
 */
package com.digi.xbee.api.exceptions;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InterfaceAlreadyOpenExceptionTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.InterfaceAlreadyOpenException#InterfaceAlreadyOpenException()}.
	 */
	@Test
	public final void testCreateInterfaceAlreadyOpenExceptionDefault() {
		// Setup the resources for the test.
		String expectedMessage = "The connection interface is already open.";
		
		// Call the method under test.
		InterfaceAlreadyOpenException e = new InterfaceAlreadyOpenException();
		
		// Verify the result.
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected message", 
				e.getMessage(), is(equalTo(expectedMessage)));
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected cause", 
				e.getCause(), is(nullValue(Throwable.class)));
	}
	
	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.InterfaceAlreadyOpenException#InterfaceAlreadyOpenException(String)}.
	 */
	@Test
	public final void testCreateInterfaceAlreadyOpenExceptionMessage() {
		// Setup the resources for the test.
		String message = "This is the message";
		
		// Call the method under test.
		InterfaceAlreadyOpenException e = new InterfaceAlreadyOpenException(message);
		
		// Verify the result.
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected message", 
				e.getMessage(), is(equalTo(message)));
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected cause", 
				e.getCause(), is(nullValue(Throwable.class)));
	}
	
	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.InterfaceAlreadyOpenException#InterfaceAlreadyOpenException(String)}.
	 */
	@Test
	public final void testCreateInterfaceAlreadyOpenExceptionMessageNull() {
		// Setup the resources for the test.
		String message = null;
		
		// Call the method under test.
		InterfaceAlreadyOpenException e = new InterfaceAlreadyOpenException(message);
		
		// Verify the result.
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected message", 
				e.getMessage(), is(equalTo(message)));
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected cause", 
				e.getCause(), is(nullValue(Throwable.class)));
	}
	
	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.InterfaceAlreadyOpenException#InterfaceAlreadyOpenException(String, Throwable)}.
	 */
	@Test
	public final void testCreateInterfaceAlreadyOpenExceptionMessageAndCause() {
		// Setup the resources for the test.
		String message = "This is the message";
		Throwable cause = new Exception();
		
		// Call the method under test.
		InterfaceAlreadyOpenException e = new InterfaceAlreadyOpenException(message, cause);
		
		// Verify the result.
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected message", 
				e.getMessage(), is(equalTo(message)));
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected cause", 
				e.getCause(), is(equalTo(cause)));
	}
	
	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.InterfaceAlreadyOpenException#InterfaceAlreadyOpenException(String, Throwable)}.
	 */
	@Test
	public final void testInterfaceAlreadyOpenExceptionMessageNullAndCause() {
		// Setup the resources for the test.
		String message = null;
		Throwable cause = new Exception();
		
		// Call the method under test.
		InterfaceAlreadyOpenException e = new InterfaceAlreadyOpenException(message, cause);
		
		// Verify the result.
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected message", 
				e.getMessage(), is(equalTo(message)));
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected cause", 
				e.getCause(), is(equalTo(cause)));
	}
	
	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.InterfaceAlreadyOpenException#InterfaceAlreadyOpenException(String, Throwable)}.
	 */
	@Test
	public final void testCreateInterfaceAlreadyOpenExceptionMessageAndCauseNull() {
		// Setup the resources for the test.
		String message = "This is the message";
		Throwable cause = null;
		
		// Call the method under test.
		InterfaceAlreadyOpenException e = new InterfaceAlreadyOpenException(message, cause);
		
		// Verify the result.
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected message", 
				e.getMessage(), is(equalTo(message)));
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected cause", 
				e.getCause(), is(equalTo(cause)));
	}
	
	/**
	 * Test method for {@link com.digi.xbee.api.exceptions.InterfaceAlreadyOpenException#InterfaceAlreadyOpenException(String, Throwable)}.
	 */
	@Test
	public final void testCreateInterfaceAlreadyOpenExceptionMessageAndCauseBothNull() {
		// Setup the resources for the test.
		String message = null;
		Throwable cause = null;
		
		// Call the method under test.
		InterfaceAlreadyOpenException e = new InterfaceAlreadyOpenException(message, cause);
		
		// Verify the result.
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected message", 
				e.getMessage(), is(equalTo(message)));
		assertThat("Created 'InterfaceAlreadyOpenException' does not have the expected cause", 
				e.getCause(), is(equalTo(cause)));
	}
}
