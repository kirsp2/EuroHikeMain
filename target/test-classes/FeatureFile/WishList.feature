@Integration 
Feature: To Validated wish List option in EuroHike website
Background:
Given User should launch GC Browser and load the eurohike URL and maximize
Given User Should Click the Tents and camping option in home page
When Click the Sleeping category

@Integration 
Scenario: Verify The User can able to add products in wish list and check the wish list 
And click the Sleeping mats product 
And Select any one product and click the product
And Add product to the Wish list icon
And Click the wish list icon
Then User should navigate to wish list product 