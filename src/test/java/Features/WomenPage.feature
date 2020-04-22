Feature: Should be able to add two items from the women page
  Scenario: Purchase two women items
    Given I have clicked on women  page
    And Added first item
    Then continue to the next item
    And Added second item
    Then It should both be in the cart