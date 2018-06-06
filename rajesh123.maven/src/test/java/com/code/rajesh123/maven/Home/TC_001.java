package com.code.rajesh123.maven.Home;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_001 {

	@BeforeTest
	public void test()
	{
		System.out.println("rajesh1");
	}
	@Test
	public void login()
	{
		System.out.println("rajesh2");
	}
	@AfterTest
	public void end()
	{
		System.out.println("rajesh3");	
	}
}
