Feature: Amazon Home Page Validation

  @AmazonScenario1
  Scenario: search functionality validation
    Given user navigates to Amazon HomePage
    When user select the amazon fresh from the category dropdown
    And user enter the product name "cabbage" and search the product
    Then verify whether it navigate to search page