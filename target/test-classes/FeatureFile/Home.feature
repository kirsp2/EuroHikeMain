@Sanity
Feature: To Validated Home Functionality of Eurohike website
Background:
Given User should launch GC Browser and load the eurohike URL and maximize

@Sanity
Scenario: Verify The website is working in Chrome
Then The eurohike website should be launch properly and working

@Sanity
Scenario: Verify The User click the Tents & camping option and it will show the list of product category
When Click the Tents and camping option in home page
Then User should navigate to Tents and camping and able view all Tents and Camping product are should be available


