Feature: Used cars

@sanity
@regression
  Scenario: Display used cars in Chennai
    Given used cars menu
    When the user hovers used cars
    Then select location as Chennai
    And print popular used car models
