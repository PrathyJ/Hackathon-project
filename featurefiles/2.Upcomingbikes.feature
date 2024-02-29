Feature: Upcoming bikes


@sanity
  Scenario: Display honda bikes
    Given Upcoming bikes page
    When select manufacturer as honda
    And click view more bikes
    Then honda bikes will be shown
    And upcoming honda bikes below 4 lakhs will be displayed
