@Regression
Feature: BRCP Functionality

  Background:
  Given User is on the Standard Bank landing page

  @BRCP
  Scenario Outline: Originate a BRCP
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
    When User clicks Sales
    Then Start the Sales Process link is displayed
    When User clicks Start the Sales Process link
    Then Select the originating system is displayed
    When User clicks Retail Products
    Then Retail Transactional Products is displayed
    When User clicks Add on Business Revolving Credit Plan
    And User populates Requested limit textbox "<Requested_Limit>"
    Then user enters "<Gross_Annual_Turnover>"
    And User clicks Continue
    Then Customer consent required for product(s) selected section is displayed
    When Customer checks radio buttons
    And User clicks Next button
    Then Capture_update customer address details is displayed in BusinessDetailsPage
    When User clicks Next button in BusinessDetailsPage
    Then Issue Document pop up is displayed in BusinessDetailsPage
    When User clicks Cancel in BusinessDetailsPage
    Then Related Parties is displayed
    When User clicks Given To
    Then Manage Relationships_Account roles is displayed
    When User clicks Manage Relationships_Account roles
    Then Manage Relationships_Account roles pop up is displayed
    When User clicks Account Roles
    Then All Account Roles is displayed
    When User checks signatory checkbox
    And User checks Account Contract checkbox
    And User clicks Save
    And User clicks Confirm Details
    Then Capture_update customer address details is displayed in RelatedPartiesPage
    When User clicks Confirm
    Then Issue Document pop up is displayed in RelatedPartiesPage
    When User clicks Cancel
    Then Related Parties is displayed
    When User clicks Next button in RelatedPartiesPage
    Then Repayment Affordability screen is displayed
    When User clicks Next button for Sales ProductStatus Page
    Then Select products for further sales processing is displayed in SalesProductStatusPage
    When User clicks Configure Limits
    Then Adjust credit limits pop up is displayed
    When User enters Selected "<repayment_amount>" amount
    And User clicks Calculate
    Then Total monthly repayment amount is adjusted
    When User clicks Confirm(F)
    Then Select products for further sales processing is displayed
    When User clicks Set up product link
    Then Set up account is displayed
    Then User chooses a "<payment_cycle>" level
    And User chooses a "<payment_cycle_date>"
    And User selects a Customer account number
    And User selects a delivery method
    And User checks intended use of account
    And User selects purpose of loan "<loan_option>"
    And User clicks Accept Offer
    Then Select products for further sales processing is displayed in SetUpAccountPage
    When User clicks Next button
    Then Application(s) Overview is displayed
    When User clicks Generate Contract
    Then Issue Document pop up is displayed in ApplicationOverviewPage
    When User clicks Cancel in ApplicationOverviewPage
    Then Application(s) Overview is displayed
    When User clicks Sign Contract
    Then Issue Document pop up is displayed
    When User selects an "<sign_option>" delivery method
    And User clicks Process button




    Examples:
      | username | password | Customer_Number |Requested_Limit|Gross_Annual_Turnover|repayment_amount|payment_cycle|payment_cycle_date|account_options|account_options|loan_option     |sign_option|
      | C877210  | florence | 204618990   |651000        |800000        |4330           |WEEKLY      |EACH MONDAY       |     Deposits    |  Debit Orders |STOCK        |Print  |

