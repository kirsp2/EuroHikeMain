package org.ultility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TentPojo extends BaseClass{
	
	public TentPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(@href, 'sleeping/')])[1]")
	private WebElement sleepingprod;
	
	@FindBy (xpath="//a[contains(text(), 'Sleeping Mats')]")
	private WebElement sleepingMats;
	
	@FindBy(xpath="//a[contains(text(), 'Sleeping Liners')]")
	private WebElement sliners;
	
	@FindBy(xpath="//a[contains(text(), 'Airbeds')]")
	private WebElement airbeds;
	
	@FindBy(xpath="//a[contains(text(), 'Sleeping Bags')]")
	private WebElement sbags;
	
	@FindBy(xpath="//a[contains(text(), 'Pumps')]")
	private WebElement pumps;
	
	@FindBy(xpath="//a[contains(text(), 'Camp Beds & Accessories')]")
	private WebElement campBeds;
	
	@FindBy(xpath="//h1[text()='Sleeping Mats']")
	private WebElement lableSMats;
	
	@FindBy(xpath="//h1[text()='Sleeping Liners']")
	private WebElement lableSLiners;
	
	@FindBy(xpath="//h1[text()='Airbeds']")
	private WebElement lableAirbeds;
	
	@FindBy(xpath="//h1[text()='Sleeping Bags']")
	private WebElement lableSBags;
	
	@FindBy(xpath="//h1[text()='Pumps']")
	private WebElement lablePumps;
	
	@FindBy(xpath="//h1[text()='Camp Beds & Accessories']")
	private WebElement lableCampBeds;
	
	@FindBy (xpath="//a[contains(text(), 'View all Sleeping')]")
	private WebElement lableViewAllSleep;

	public WebElement getLableViewAllSleep() {
		return lableViewAllSleep;
	}

	public WebElement getSleepingprod() {
		return sleepingprod;
	}

	public WebElement getSleepingMats() {
		return sleepingMats;
	}

	public WebElement getSliners() {
		return sliners;
	}

	public WebElement getAirbeds() {
		return airbeds;
	}

	public WebElement getSbags() {
		return sbags;
	}

	public WebElement getPumps() {
		return pumps;
	}

	public WebElement getCampBeds() {
		return campBeds;
	}

	public WebElement getLableSMats() {
		return lableSMats;
	}

	public WebElement getLableSLiners() {
		return lableSLiners;
	}

	public WebElement getLableAirbeds() {
		return lableAirbeds;
	}

	public WebElement getLableSBags() {
		return lableSBags;
	}

	public WebElement getLablePumps() {
		return lablePumps;
	}

	public WebElement getLableCampBeds() {
		return lableCampBeds;
	}
	

	
	

}
