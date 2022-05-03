package org.ultility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport( String jsonfile) {
		
		File f = new File(System.getProperty("user.dir")+"\\target\\Report\\JvmReport");
		Configuration con = new Configuration(f, "EuroHike Application");
		con.addClassifications("Platform Name", "Window 10");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser version", "101");
		con.addClassifications("Relase Name", "Relase 9.2");
		con.addClassifications("Sprint Name", "33.0");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonfile);
		
		ReportBuilder rb = new ReportBuilder(li, con);
		rb.generateReports();
		
		
		

	}

}
