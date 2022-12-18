@kiwi
Feature: Kiwi Find Cheapest Ticket

  Scenario: Wherever you want to go, try to find the cheapest ticket from the website.

    Given The user goes the kiwi homepage
    Then  The user choose From "City,Country,Region" city in the box
    Then  The user choose To "City,Country,Region2" city in the box
    Then  The user choose one way flight from menu
    Then  The user sorts the prices from cheapest to most expensive.


