
@tag
Feature: Search and place order for vegetables 

  @GREENKART
  Scenario: Search for items and validate results
    Given user is on Greencart landing page
    When user search for Cucumber vegetable
    Then "Cucumber" vegetable  are displayed
#for (When) if we write "Cucumber" we need to pass it in step defintion as reg exp, but now we can pah as (.+) to have coonsistence with below implemntation

  @GREENKART
  Scenario Outline: Search for items and validate results 
    Given user is on Greencart landing page
    When user search for <Name> vegetable 
    And User Add Item to the Cart 
    And User Proceed to check out page for purchase 
    Then Verify Selected <Name> are displayed in check out page 
    
    Examples:
    |Name    |
    |Brinjal |
    |Beetroot|