Feature: Login feature

  @login
  Scenario Outline: login
    Given open "<url>"
    When Set input "practice" by xpath "Login_UserName"
    When Set input "SuperSecretPassword!" by xpath "Login_Password"
    When Click on the button by xpath "Login_Button"
    Examples:
      | url                                       |
      | https://practice.expandtesting.com/login |