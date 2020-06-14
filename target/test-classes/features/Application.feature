Feature: Application Login

@RegressionTest
Scenario: Login to MdesManager application 
Given MdesManager is launched in Chrome browser
When User enters username "sabari" and password "1234" and click login
Then Login should be successful
And Project Dashboard page displayed is "true"

