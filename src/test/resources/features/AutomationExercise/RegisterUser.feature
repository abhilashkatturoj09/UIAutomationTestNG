Feature: Register User on Automation Exercise

  @RegisterUser
  Scenario Outline: Register User on Automation Exercise
    Given open "<url>"
    When Home Page Loaded Successfully
    When Click on the button by xpath "loginSignup"
    When Page Loaded Successfully by xpath "SignupButton"
    When Set input "admin" by xpath "SignupName"
    When Set input "admin@admin" by xpath "SignupEmail"
    When Click on the button by xpath "SignupButton"
    When Page Loaded Successfully by xpath "EnterAccountInformation"

    Examples:
      | url                             |
      | https://automationexercise.com/ |