Feature: Login with Valid Credentials

@sanity @regression
  Scenario: Login with registered user on the website
    Given User Launch browser
    And opens URL "https://automationteststore.com"
    When User clicks on Login 
    When User enters on Registered LoginName as "s.p.saagar" and Registered Password as "thesagar"
    Then User navigates to My Account Page