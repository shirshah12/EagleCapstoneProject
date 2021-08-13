@CompleteTest
Feature: Desktops



Background:
Given User is on Retail Website
When User click on Desktops tab
And User click on Show all desktop page




#scenario 1
@Desktop
Scenario: User verify all items are present in desktops tab
Then user should see all items are present in Desktop page



#scenario 2
@AddHpLP3065
Scenario: User add HP "LP 3065" from Desktops tab to the cart
And User click on ADD TO CART option on "HP LP3065" item
And User select quantity "1"
And User click add to Cart button
Then User should see a message "Success: you have added HP LP 3065 to your Shopping cart!"




@AddCanonEOS5D
Scenario: User add canon EOS 5D from desktops tab to the cart
And User click ADD TO CART option on 'Canon EOS 5D' item
And User select color from dropdown 'Red'
And User click add to Cart button
Then User should see a message 'Success: You have added Canon EOS 5D to your shopping cart!'




@AddReviewToCanon
Scenario: User add a review to canon EOS 5D item in Desktops tab
And User click on Canon EOS 5D item
And User click on write a review link
And user fill the review information with below information
#|yourname|yourReview|Rating
#|name|review|Bad or good|
And User click on Continue Button
Then User should see a message with 'Thank you for your review. it has been submitted to the webmaster for approval'.