package org.stepdefinition;

import org.junit.Assert;
import org.ultility.BaseClass;
import org.ultility.CheckOutPojo;
import org.ultility.HomePojo;

import io.cucumber.java.en.*;

public class CheckOutStepDefinition extends BaseClass {
	@When("Select any one product and click the product")
	public void select_any_one_product_and_click_the_product() {
		implicitywaiting(30);
	   CheckOutPojo a = new CheckOutPojo();
	   btnClick(a.getSelectedpro());
	}

	@When("Add the Quantity base on Test data in Quantity option")
	public void add_the_Quantity_base_on_Test_data_in_Quantity_option() {
		   implicitywaiting(30);
		   CheckOutPojo a = new CheckOutPojo();
		   fill(a.getQuantity(), "2");
	    
	}

	@When("Click the Add to basket button")
	public void click_the_Add_to_basket_button() {
		   implicitywaiting(30);
		   CheckOutPojo a = new CheckOutPojo();
		   btnClick(a.getAddBasket());
	}

	@When("Scroll down the page and click Checkout securely button in basket page")
	public void scroll_down_the_page_and_click_Checkout_securely_button_in_basket_page() {
		implicitywaiting(60);		
		HomePojo b = new HomePojo();
		btnClick(b.getClosebtn());
		
	    CheckOutPojo a = new CheckOutPojo();
	    pageDown(a.getCheckout());
	    
	    btnClick(a.getCheckout());
	}

	@Then("User should navigate to the CheckOut page")
	public void user_should_navigate_to_the_CheckOut_page() {
		implicitywaiting(30);
		Assert.assertTrue("validated checkout page",Titleget().contains("Checkout"));
		System.out.println("Test case TC_EH_019 is Passed");
	    
	}

}
