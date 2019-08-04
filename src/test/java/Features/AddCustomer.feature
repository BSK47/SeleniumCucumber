Feature: Add customer by providing all details

Scenario: Submit and copy the Customer ID

Given Open the Chrome and launch the "telecom" application
When Click the Add Customer link
When Provide the BackGround Check as "Pending"
When Provide the First Name as "FirstName"
When Provide the Last Name as "LastName"
When Provide the email id as "test@gmail.com"
When Provide the mobile number as "9876789870"
When Click "Submit"
Then Verify the customer Id is generated
Then Close the browser