Feature: Add and checkout the product to the cart

@sanity @regression
  Scenario: Login with registered user on the website
    Given User Launch browser
    And opens URL "https://automationteststore.com"
    When User clicks on Login
    When User enters on Registered LoginName as "s.p.saagar" and Registered Password as "thesagar"
    When User clicks on Registered login button
    Then User navigates to My Account Page
    When User clicks on Appearal and Accessories
    When User clicks on Tshirts
    When User clicks on add to cart
    When User clicks on Checkout
    When User navigates Checkout page
    When User clicks on Confirm Order
    
    
   