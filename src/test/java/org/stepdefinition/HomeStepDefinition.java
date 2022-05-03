package org.stepdefinition;

import org.junit.Assert;
import org.ultility.BaseClass;
import org.ultility.HomePojo;

import io.cucumber.java.en.*;

public class HomeStepDefinition extends BaseClass {
	@Given("User should launch GC Browser and load the eurohike URL and maximize")
	public void user_should_launch_GC_Browser_and_load_the_eurohike_URL_and_maximize() {
	    
	}

	@Then("The eurohike website should be launch properly and working")
	public void the_eurohike_website_should_be_launch_properly_and_working() {
		implicitywaiting(30);	
		
		Assert.assertTrue("To validate Website should properly launch",Titleget().contains("Official Eurohike"));		
		System.out.println("Test case TC_EH_001 is passed");
		
	   
	}

	@When("Click the Tents and camping option in home page")
	public void click_the_Tents_and_camping_option_in_home_page() {
		implicitywaiting(30);	
		HomePojo a = new HomePojo();
		btnClick(a.getTentsMenu());
	    
	}

	@Then("User should navigate to Tents and camping and able view all Tents and Camping product are should be available")
	public void user_should_navigate_to_Tents_and_camping_and_able_view_all_Tents_and_Camping_product_are_should_be_available() {
	
		HomePojo a = new HomePojo();
		Assert.assertTrue("To validate View all product", a.getLableProductView().getText().contains("View all Tents & Camping"));
		System.out.println("Test case TC_EH_004 is passed");
	   
	}


}
