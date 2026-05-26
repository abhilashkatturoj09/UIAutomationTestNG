Feature: Inputs feature

  @inputs
  Scenario Outline: Enter Inputs
    Given open "<url>"
    When Set input "AbhilashKatturoj" by xpath "Inputs_inputText"
    Examples:
      | url                                       |
      | https://practice.expandtesting.com/inputs |
