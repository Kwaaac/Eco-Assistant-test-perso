Feature: The user manipulates Profiles
  Scenario: User wants to get an Profile from an id
    When the user calls /api/... with profileId is 1
    Then the user receives profile status code of 200
    And the user receives profile from server with the id 1

  Scenario: User wants to create a new Profile
    When the user calls /api/... with userId 1
    Then the user receives create status code of 200
    And the user receives profile from server with userId 1

  Scenario: Client wants to remove an Profile
    When the user calls /api/... with a profileId 1
    Then the user receives remove status code of 200
    And the user receives the boolean True