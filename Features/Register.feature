Feature: Register with Valid Credentials

@sanity @regression
  Scenario: Register on the website
    Given User Launch browser
    And opens URL "https://automationteststore.com"
    When User clicks on Register
    And User clicks on Continue
    And User enters First Name as "Sagar" and Last Name as "Shiraguppi" and Email as "abc@xyz.com" and Telephone as "1234567890" and Fax as "99999999" and Company as "mycompany" and Address1 as "vijayanagar" and Address2 as "CHBS Layout" and State as "Karnataka" and Zipcode as "560040" and Country as "India" and LoginName as "spsagar" and Password as "abc123" and ConfirmPassword as "abc123" 
    And User clicks on Subscribe
    And User clicks on Privacy Policy
    Then User navigates to Registered users home page