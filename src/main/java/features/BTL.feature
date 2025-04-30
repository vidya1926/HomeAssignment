Feature: BTL Functionality  
  Scenario: Originate a BTL
    Given User enters "Demosalesmanager" as username
    And User enters "crmsfa" as password
    When User clicks login button
    Then Homepage is displayed
    When Switch the control to application "https://www.google.com/" in new tab
    Then The control should be in new application