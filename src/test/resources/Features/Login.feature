
Feature: Login Functionality

Scenario: Verfiy login with valid credentials
Given user should access swaglabs url
When  user should enter username as "standard_user" and password as "secret_sauce"
Then  user should click on login button
And   user should verfiy homepage title as "Swag Labs"


Scenario: Add item to cart
Given user should access swaglabs url
When  user should enter username as "standard_user" and password as "secret_sauce"
Then  user should click on login button
And   user should verfiy homepage title as "Swag Labs"
Then  user should click on Sauce Labs Backpack
Then  user should click on add to cart
Then  user should click on addcart icon
Then  user should click on checkout button
Then  user should enter firstname as "Surya"
Then  user should enter lastname as "Vasu"
Then  user should enter postal code as "12345"
Then  user should click on continue button
Then  user should click on finish button
And   user should verify message as "Thank you for your order!"
