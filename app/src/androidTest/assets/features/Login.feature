Feature: login

  Scenario Outline: login with user name and pass
    Given I see login activity
    When I fill "<username>" in username editext
    And I fill "<password>" in username editext
    Then I see welcome activity
    Examples:
      | username | password |
      | huy      | abc      |
      | bangin   | chuotbeo |