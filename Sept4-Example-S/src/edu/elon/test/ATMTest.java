/**
 * ATMTest.java 1.0 Sep 5, 2014
 * 
 * Copyright (c) 2014 James C. Adams IV. All Rights Reserved
 */

package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class containing JUnit tests for the ATM Class.
 * 
 * @author jamesadams
 * @version 1.0
 *
 */
public class ATMTest {
	private ATM atm;

	/**
	 * Initializes an instance of ATM before each JUnit test case.
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		atm = new ATM(10.0);
	}

	/**
	 * Sets an instance of ATM to null after each JUnit test case.
	 * 
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		atm = null;
	}

	/**
	 * JUnit test case to test the deposit method.
	 * Test passes if IllegalArgumentException is thrown 
	 * when depositing negative values.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testDeposit() {
		atm.deposit(-15.0);
	}

	/**
	 * JUnit test case to test the getBalance method.
	 */
	@Test
	public void testGetBalance() {
		double actual = atm.getBalance();
		double expected = 10.0;
		assertEquals(expected, actual, 0.1);
	}

	/**
	 * JUnit test case to test the toString method.
	 */
	@Test
	public void testToString() {
		String actual = atm.toString();
		String expected = "Amount balance is $10.00";
		assertEquals(expected, actual);
	}

	/**
	 * JUnit test case to test the withdraw method.
	 * Test passes if IllegalArgumentException is thrown 
	 * when withdrawing negative values.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testWithdraw() {
		atm.withdraw(20.0);
	}

}
