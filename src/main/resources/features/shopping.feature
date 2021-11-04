Feature:  Check my basket application

  Scenario Outline: No item Selected in basket
    Given User start the application
    Then In basket should be see selection of products
    When User browse basket "<No>" buying product
    Then User's basket should "<Empty>" be empty
    And User "<notAble>" buy an item

    Examples:
      | No      | Empty | notAble |
      | without |       | cannot  |


  Scenario Outline: Item selected in basket
    Given User start the application
    Then In basket should be see selection of products
    When User browse basket "<Yes>" buying product
    Then User's basket should "<notEmpty>" be empty
    And User "<Able>" buy an item

    Examples:
      | Yes  | notEmpty | Able |
      | with | not      | can  |