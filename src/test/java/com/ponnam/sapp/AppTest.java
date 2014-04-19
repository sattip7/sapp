package com.ponnam.sapp;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	public void testMain() {
		int x=1; int y=2;
		assertEquals(3, new App().add(x, y));
	}

}
