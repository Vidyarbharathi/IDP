Feature: Salesforce Create Opportunity functionality



Scenario Outline: Create the Opportunity
Given Enter the usname as <username>
And Enter the pword as <password>
When Click the Login button
Then Verify the Homepage is displayed
When click the toggle button
And Click viewAll  
And Search for Opportunity and enter
Then Click the Opportunity
When click the new button
And Enter the opportunity name as <name>
And choose the date
And Select the stage as Need Analysis
And Click the save button
Then Verify the new opportunity

Examples:
|username|password|name|
|'ramkumar.ramaiah@testleaf.com'|'Password#123'|'Salesforce by vidya'|






