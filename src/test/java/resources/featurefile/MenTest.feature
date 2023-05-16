Feature:Men Test

@sanity @regression
  Scenario: User Should Add Product SuccessFullyTo ShoppingCart

    Given I am on homepage
    When I Mouse Hover on Men Menu
    And I Mouse Hover on Bottoms
    And I Click on Pants
    And I Mouse Hover on product name‘Cronus Yoga Pant’ and click on size 32.
    And I Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
    And I Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
    Then I Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
    And I Click on ‘shopping cart’ Link into message
    Then I Verify the text ‘Shopping Cart.’
    Then I Verify the product name ‘Cronus Yoga Pant’
    Then I Verify the product size ‘32’
    Then I Verify the product colour ‘Black’