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
#    When Page Loaded Successfully by xpath "EnterAccountInformation"
    When Wait for page load to Verify by Text "Enter Account Information"
    When Click on the button by xpath "title"
    When Set input "adminadmin" by xpath "name"
    When Set input "admin" by xpath "password"
    When Select Dropdown "10" by xpath "days"
    When Select Dropdown "10" by xpath "month"
    When Select Dropdown "1993" by xpath "year"
    When Click on the button by xpath "newsletter"
    When Set input "abhi" by xpath "firstName"
    When Set input "kattu" by xpath "lastName"
    When Set input "HYD" by xpath "address"
    When Set input "TS" by xpath "state"
    When Set input "HYD" by xpath "city"
    When Set input "500019" by xpath "zipcode"
    When Set input "1234567890" by xpath "mobile_number"
    When Click on the button by xpath "createAccountButton"
#    When Page Loaded Successfully by xpath "accountCreated"
    When Wait for page load to Verify by Text "Account Created!"
    When Click on the button by xpath "continueButton"
    When Wait for page load to Verify by Text "adminadminadmin"
    When Click on the button by xpath "deleteAccount"
    When Page Loaded Successfully by xpath "accountDeleted"
    When Click on the button by xpath "continueButton"
    When Home Page Loaded Successfully

    Examples:
      | url                             |
      | https://automationexercise.com/ |