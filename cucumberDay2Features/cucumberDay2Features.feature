Feature: Leaftaps Login functionality

@smoke
Scenario Outline: Launch leaftaps application for create lead flow
Given Enter the username <username>
And Enter the passoword <password>
And Click on Login button
When Run createleadmethod
Then Lead created successfully
Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
#|'DemoCSR'|'crmsfa'|

@regression
Scenario Outline: Launch leaftaps application for duplicate lead flow
Given Enter the username <username>
And Enter the passoword <password>
And Click on Login button
When Run duplicate method
Then Duplicate lead created successfully
Examples:
|username|password|
|'DemoCSR'|'crmsfa'|

@functional
Scenario Outline: Launch leaftaps application for delete lead flow
Given Enter the username <username>
And Enter the passoword <password>
And Click on Login button
When Run delete method
Then Delete lead created successfully
Examples:
|username|password|
|'DemoCSR'|'crmsfa'|
