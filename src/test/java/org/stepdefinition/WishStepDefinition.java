package org.stepdefinition;

import org.junit.Assert;
import org.ultility.BaseClass;
import org.ultility.WishListPojo;

import io.cucumber.java.en.*;

public class WishStepDefinition extends BaseClass {
	
	@When("Add product to the Wish list icon")
	public void add_product_to_the_Wish_list_icon() {
		implicitywaiting(20);
	  WishListPojo a = new WishListPojo();
	  btnClick(a.getAddWislist());
	  
	}

	@When("Click the wish list icon")
	public void click_the_wish_list_icon() {
		implicitywaiting(20);
		WishListPojo a = new WishListPojo();
		btnClick(a.getIconWishlist());
	}

	@Then("User should navigate to wish list product")
	public void user_should_navigate_to_wish_list_product() {
		implicitywaiting(30);
		WishListPojo a = new WishListPojo();
		Assert.assertTrue("validated the Viw all spleeping prod",a.getWishLable().getText().contains("Wishlist"));
		
		System.out.println("Test case TC_EH_013 is passed");
		
	    
	    
	}


}
