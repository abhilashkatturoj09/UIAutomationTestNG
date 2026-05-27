Feature: Inputs feature

  @inputs
  Scenario Outline: Enter Inputs
    Given open "<url>"
    When Set input "11" by xpath "Inputs_inputNumber"
    When Set input "AbhilashKatturoj" by xpath "Inputs_inputText"
    When Set input "admin" by xpath "Inputs_inputPassword"
    When Set input "05/27/2026" by xpath "Inputs_inputDate"
    When Click on the button by xpath "Inputs_inputButton"
    Examples:
      | url                                       |
      | https://practice.expandtesting.com/inputs |
