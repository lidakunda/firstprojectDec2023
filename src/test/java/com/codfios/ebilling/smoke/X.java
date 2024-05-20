package com.codfios.ebilling.smoke;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class X {

	@Test
	public void test1() {
		System.out.println("hello from test1 test");
	}

	@Test
	public void test2() {
		System.out.println("hello from test2 test");
	}

	@Before
	public void hello() {
		System.out.println("i am hello");
	}

	@After
	public void bye() {
		System.out.println("i am bye");
	}

	@BeforeClass
	public static void helloclass() {
		System.out.println("i am hello beforeClass");
	}

	@AfterClass
	public static void byeclass() {
		System.out.println("i am bye afterclass");
	}

}
