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


  Scenario Outline: Buy different items
    Given User start the application
    Then In shop should be see selection of products
    When User browse shop with items
    Then Shop has several items
    When User add item "<Item1>"
    And User add item "<Item2>"
    Then In basket should be see selection of products
    When User browse basket "<Yes>" buying product
    Then User's basket should "<notEmpty>" be empty
    And User "<Able>" buy an item
    Examples:
      | Item1   | Item2  | Yes  | notEmpty | Able |
      | Bananas | Apple  | with | not      | can  |
      | Onions  | Tomato | with | not      | can  |

