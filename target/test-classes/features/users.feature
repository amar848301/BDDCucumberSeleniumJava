Feature: Test all features of users

@test
  Scenario: Create single free user
    Given create user with given details
      | onBehalf | firstName | lastName | gender | dob        | email          | password |
      | Friend   | Test      | User     | Male   | 1990-05-05 | test@gmail.com | 12345678 |
    And login into application with username and password
    When approve user from admin panel
    Then verify the user details
