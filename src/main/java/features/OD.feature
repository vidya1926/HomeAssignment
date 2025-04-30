Feature: OD Functionality

  Background:
    Given User is on the Standard Bank landing page

  @OD
  Scenario Outline: Originate an OD
    When User enters "<username>" as username
    And User enters "<password>" as password
    And User clicks login button
    Then Dashboard is displayed
    When User clicks Business radio button
    Then Registered name is displayed
    When User enters "<Customer_Number>" as customer number
    And User clicks Search
    Then Business Search Results are displayed
    When User clicks on organisation name
    Then Authentication method is displayed
    When Customer clicks Customer is not available
    Then Top accounts are displayed
    When User clicks on the account number
    Then Preferred branch is displayed
    When user clicks on Limits
    Then Limit  overview is displayed
    When user clicks on maintain
    Then maintain overdrafts limits is displayed
    And  user enters arranged limit "<amount>"
    Then User selects "<reason>" for update
    When User clicks Process F button
    Then select product is displayed
    When User clicks Continue
    Then Customer consent required for product(s) selected section is displayed
    When Customer checks radio buttonsTwo
    And  User clicks Next button for Repayment Affordability Page
    Then Repayment Affordability screen is displayed
    When User clicks Next button
    Then Set up account is displayed
    And User selects a delivery method
    And User selects purpose of loan "<loan_option>"
    When User clicks Accept Offer
    Then User clicks Generate Contract
    When User clicks Sign Contract
    Then Issue Document pop up is displayed
    When User selects an "<sign_option>" delivery method
    And User clicks Process button





    Examples:
      | username | password | Customer_Number |loan_option|amount|reason|sign_option|
      | C877210  | florence | 0530585223      |STOCK      |96000 |Housing|Print  |