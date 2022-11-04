Feature:Login feature
  As I user, I should be able to login

  @wip
  Scenario Outline:
    Given I am on the login page
    Given user logs in using "<email>" "<password>"

    Examples:
      | email                | password     |
      | user123              | UserUser123      |
      | user124555           | UserUser123      |