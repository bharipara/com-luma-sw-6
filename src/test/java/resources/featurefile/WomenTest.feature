Feature: Women Test

@sanity @regression
  Scenario: verify The Sort By Product Name Filter
    Given I am on homepage
    When I Mouse Hover on Women Menu
    And I Mouse Hover on Tops
    And I Click on Jackets
    And I Select Sort By filter “Product Name”
    And I Verify the products name display in alphabetical order

@sanity @regression
  Scenario: verify The SortBy Price Filter
    Given I am on homepage
    When I Mouse Hover on Women Menu
    And I Mouse Hover on Tops
    And I Click on Jackets
    And I Select Sort By filter “Price”
    Then I Verify the products price display in Low to High