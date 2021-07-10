Feature: Application Login
  Scenario: Home page default login
    Given User is on Myntra Landing Page
    When User login into Myntra Site with Mobile OTP
    Then User login successfully into Home page
