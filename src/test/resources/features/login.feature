Feature: Login feature

  Scenario: login
    Given login url
    When enter username
    When  enter password
    Then Login to home page
