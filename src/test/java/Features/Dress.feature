Feature: should be able to go to dress page
  Scenario: Adding dresses to the cart
    Given I have accessed dress page
    When I have clicked the dress I chose
    Then I 'Quick View' a dress
    And Dress Size is chosen
    Then the dress is added to the cart

