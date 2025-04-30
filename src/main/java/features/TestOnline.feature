Feature: Test Online Functionality

Scenario: Originate a Test Online
Given Navigate to Contact Us page in Standard Bank Website
And Extract Email from Contact Us
When Switch the control to application "https://testonlinebanking.standardbank.co.za" in new tab
Then The control should be in new application