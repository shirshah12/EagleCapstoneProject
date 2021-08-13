@CompleteTest 
Feature: Home Page 

@CurrencyValue
Scenario: User verify currency values change

Given User is on Retail website
When User click on currency
And User Chose Euro from dropdown
Then currency value should change to Euro


@ShoppingCart
Scenario: User empty Shopping cart message displays

Given User is on Retail website
When User click on shopping cart
Then "Your Shopping cart is empty!" message should display



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	
	
	