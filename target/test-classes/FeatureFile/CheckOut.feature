@SystemIntegration 
Feature: To Validated CheckOut product in EuroHike website
Background:
Given User should launch GC Browser and load the eurohike URL and maximize
Given User Should Click the Tents and camping option in home page
When Click the Sleeping category

@SystemIntegration @Integration
Scenario: Verify the User should navigat to Checkout page after click Checkout securely
And click the Sleeping mats product 
And Select any one product and click the product
And Add the Quantity base on Test data in Quantity option
And Click the Add to basket button
And Scroll down the page and click Checkout securely button in basket page
Then User should navigate to the CheckOut page


