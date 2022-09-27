package Hooks;

import java.io.IOException;

import Base.BaseClass;
import io.cucumber.java.Before;

public class LMS_Hooks extends BaseClass {
	

	@Before("@driversetup")
	public void browserSetUp() throws IOException, InterruptedException
	{
		System.out.println("Before Hooks");
		setUpDriver();
		
	}
	
//	@After
//	public void browserTearDown() { 
//
//		System.out.println("After Hooks ");
//		tearDown();
//
//	}

}
