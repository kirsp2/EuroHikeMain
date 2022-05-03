package org.stepdefinition;

import java.io.IOException;

import org.ultility.BaseClass;
import org.ultility.HomePojo;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before (order = 1)
	public void beforeExecution() {
		
		launchChrome();
		loadUrl("https://www.eurohike.co.uk/");
		winMax();				
	}
	
	@Before (order = 2)
	public void secondor() {
		implicitywaiting(60);		
		HomePojo a = new HomePojo();
		btnClick(a.getClosebtn());
	}
	
	@Before (order = 3)
	public void thirdorder() {
		System.out.println("hooks @before executed");
	}
	
	@After (order = 2)
	public void afterExecution(Scenario s) throws IOException {
		implicitywaiting(60);
		String name = s.getName();
		String fileName = name.replace(" ", "_");		
		screenshot(fileName);
		
		winClose();
		
	}
	
	
	@After (order = 1)
	public void secondafter() {
		System.out.println("hooks @After executed");

	}
	
	
	
	

}
