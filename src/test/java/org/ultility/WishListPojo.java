package org.ultility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPojo extends BaseClass {
	
	public WishListPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='details_addtowishlist'])[1]")
	private WebElement addWislist;
	

	@FindBy(xpath="//a[@id='wishlist']")
	private WebElement IconWishlist;
	
	@FindBy(xpath="//h1[text()='Wishlist']")
	private WebElement wishLable;


	public WebElement getAddWislist() {
		return addWislist;
	}


	public WebElement getWishLable() {
		return wishLable;
	}


	public WebElement getIconWishlist() {
		return IconWishlist;
	}
	
	
	
	

}
