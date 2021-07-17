Feature: HTML-safe Strings
  Scenario: A string is created
    Given an HTML-safe string html_safe("blah")
    Then it converts to HTML "blah"
