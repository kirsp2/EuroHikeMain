package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.ultility.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.stepdefinition", dryRun=false, 
plugin= {"html:target\\Report",
		 "junit:target\\Report\\EuroHike.xml",
		 "json:target\\Report\\output.json"})
public class EhRunner {
	
	@AfterClass
	public static void testReport() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Report\\output.json");

	}
	
	
	

}