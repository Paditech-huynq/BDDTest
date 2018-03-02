Feature: login

  Scenario Outline: login with user name and pass
    Given I see login activity
    When I fill "<username>" and "<password>" in username and pass editext
    Then I see welcome activity
    Examples:
      | username | password |
      | huy      | abc      |
      | bangin   | chuotbeo |