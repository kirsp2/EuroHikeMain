package org.ultility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPojo extends BaseClass {
	
	public CheckOutPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//img[contains(@alt,'Blue Eurohike Camper Compact Self Inflating Mat')])[1]")
	private WebElement selectedpro;
	
	@FindBy(xpath="(//input[@name='product_quantity'])[1]")
	private WebElement quantity;
	
	@FindBy(xpath="(//input[@value='Add to Basket'])[1]")
	private WebElement addBasket;
	
	@FindBy (xpath="//input[@id='basket-checkout-button']")
	private WebElement checkout;
	
	public WebElement getSelectedpro() {
		return selectedpro;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getAddBasket() {
		return addBasket;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	
	
	
	

}
