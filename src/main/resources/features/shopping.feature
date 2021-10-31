Feature:  Check my basket application

  Scenario: No item Selected in basket
    Given User start the application
    Then In basket should be see selection of products
    When User browse basket without buying product
    Then User's basket should be empty
    And User cannot buy an item

    Scenario: Item selected in basket
      Given User start the application
      Then In basket should be see selection of products
      When User browse basket with buying product
      Then User's basket should not be empty
      And User can buy an item