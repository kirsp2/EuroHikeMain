package org.stepdefinition;

import org.junit.Assert;
import org.ultility.BaseClass;
import org.ultility.HomePojo;
import org.ultility.TentPojo;

import io.cucumber.java.en.*;

public class TentStepDefinition extends BaseClass {
	@Given("User Should Click the Tents and camping option in home page")
	public void user_Should_Click_the_Tents_and_camping_option_in_home_page() {
		implicitywaiting(20);
		HomePojo a = new HomePojo();
		btnClick(a.getTentsMenu());
	    
	}

	@When("Click the Sleeping category")
	public void click_the_Sleeping_category() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		btnClick(a.getSleepingprod());
	
	}

	@Then("User should navigate to the View all Sleeping log in Sleeping Products under Tents and capming")
	public void user_should_navigate_to_the_View_all_Sleeping_log_in_Sleeping_Products_under_Tents_and_capming() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		Assert.assertTrue("validated the Viw all spleeping prod", a.getLableViewAllSleep().getText().contains("View all Sleeping"));
		System.out.println("Test case TC_EH_005 is Passed");
	}
	

	@When("click the Sleeping mats product")
	public void click_the_Sleeping_mats_product() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		btnClick(a.getSleepingMats());
	   
	}

	@Then("User should navigate to the Sleeping mats product in product page")
	public void user_should_navigate_to_the_Sleeping_mats_product_in_product_page() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		Assert.assertTrue("Navigate to the Sleeping Mats prod",a.getLableSMats().getText().contains("Sleeping Mats"));
		System.out.println("Test case TC_EH_006 is Passed");
		   
	}
	
	@When("Click the Sleeping liners product")
	public void click_the_Sleeping_liners_product() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		btnClick(a.getSliners());
	    
	}

	@Then("User should navigate to the Sleeping liners product in product page")
	public void user_should_navigate_to_the_Sleeping_liners_product_in_product_page() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		Assert.assertTrue("Navigate to the Sleeping Liners prod",a.getLableSLiners().getText().contains("Sleeping Liners"));
		System.out.println("Test case TC_EH_007 is Passed");
	}

	@When("Click the Airbeds product")
	public void click_the_Airbeds_product() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		btnClick(a.getAirbeds());
	}

	@Then("User should navigate to the Airbeds product in product page")
	public void user_should_navigate_to_the_Airbeds_product_in_product_page() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		Assert.assertTrue("Navigate to the Airbeds product",a.getLableAirbeds().getText().contains("Airbeds"));
		System.out.println("Test case TC_EH_008 is Passed");
	}

	@When("Click the Sleeping Bags product")
	public void click_the_Sleeping_Bags_product() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		btnClick(a.getSbags());
	}

	@Then("User should navigate to the Sleeping Bags product in product page")
	public void user_should_navigate_to_the_Sleeping_Bags_product_in_product_page() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		Assert.assertTrue("Navigate to the Sleeping Bags product",a.getLableSBags().getText().contains("Sleeping Bags"));
		System.out.println("Test case TC_EH_009 is Passed");
	}

	@When("Click the Pumps product")
	public void click_the_Pumps_product() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		btnClick(a.getPumps());
	}

	@Then("User should navigate to the Pumps product in product page")
	public void user_should_navigate_to_the_Pumps_product_in_product_page() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		Assert.assertTrue("Navigate to the Pumps product",a.getLablePumps().getText().contains("Pumps"));
		System.out.println("Test case TC_EH_010 is Passed");
		
	}

	@When("Click the Camp Beds and Accessories product")
	public void click_the_Camp_Beds_and_Accessories_product() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		btnClick(a.getCampBeds());
	}

	@Then("User should navigate to the Camp Beds and Accessories product in product page")
	public void user_should_navigate_to_the_Camp_Beds_and_Accessories_product_in_product_page() {
		implicitywaiting(20);
		TentPojo a = new TentPojo();
		Assert.assertTrue("Navigate to the Pumps product",a.getLableCampBeds().getText().contains("Camp Beds & Accessories"));
		System.out.println("Test case TC_EH_011 is Passed");
	}

}
