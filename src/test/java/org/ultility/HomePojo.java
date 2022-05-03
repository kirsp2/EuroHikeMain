package org.ultility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePojo extends BaseClass {
	public HomePojo() {
	 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()=' Close']")
	private WebElement closebtn;
	
	
	@FindAll({
		@FindBy(xpath="(//span[contains(text(),'Tents & Camping')])[2]"),
		@FindBy(partialLinkText="Tents"),
			
		
	})
	private WebElement tentsMenu;
	
	@FindBy(xpath="(//a[@href='/tents-camping/'])[2]")
	private WebElement lableProductView;

	public WebElement getLableProductView() {
		return lableProductView;
	}

	public WebElement getTentsMenu() {
		return tentsMenu;
	}
	
	public WebElement getClosebtn() {
		return closebtn;
	}
	


}
