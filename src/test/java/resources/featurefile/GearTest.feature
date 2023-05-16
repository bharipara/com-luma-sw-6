Feature: Gear Test

  @sanity @regression
  Scenario: User Should Add Product SuccessFully To ShoppingCart
    Given I am on homepage
    When I Mouse Hover on Gear Menu
    And I Click on Bags
    And I Click on Product Name ‘Overnight Duffle’
    Then I Verify the text ‘Overnight Duffle’
    And I Change Qty 3
    And I Click on ‘Add to Cart’ Button.
    Then I Verify the text ‘You added Overnight Duffle to your shopping cart.’
    And I Click on ‘shopping cart’ Link into message
    Then I Verify the product name ‘Cronus Yoga Pant’
    Then I Verify the Qty is ‘3’
    Then I Verify the product price ‘$135.00’
    And I can Change Qty to ‘5’
    And I Click on ‘Update Shopping Cart’ button
    Then I Verify the product price ‘$225.00’