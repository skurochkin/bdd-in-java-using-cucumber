@uitest
Feature: Product Search

  As store user
  I want to be able search
  So I can see the result

  Scenario: Search for USB-C to HDMI cable
    Given user on home page of "www.walmart.com"
    When user search for "USB-C to HDMI"
    Then the result is displayed

  Scenario Outline: Search for anything
    Given user on home page of "<storeName>"
    When user search for "<item>"
    Then the result should contain "<expectedResult>"
  Examples:
    | storeName        | item              | expectedResult |
    | www.walmart.com  | USB-C to HDMI     | USB-C          |
    | www.walmart.com  | Laptop            | Laptop         |
