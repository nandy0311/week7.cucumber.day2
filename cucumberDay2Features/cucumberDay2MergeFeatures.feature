Feature: Leaftaps Login functionality

Scenario Outline: Launch leaftaps application for merge lead flow
Given Enter the username <username>
And Enter the passoword <password>
And Click on Login button
When Run merge method
Then Merge lead created successfully
Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|