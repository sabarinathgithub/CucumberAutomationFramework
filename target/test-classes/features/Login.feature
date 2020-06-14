Feature: Application Login

@MobileTest
Scenario: Login to MdesManager application 
Given MdesManager is launched in Chrome browser
When User enters username "sabari" and password "1234" and click login
Then Login should be successful
And Project Dashboard page displayed is "true"

@WebTest
Scenario: Login to MdesManager application 
Given MdesManager is launched in Chrome browser
When User enters username "nath" and password "5678" and click login
Then Login should be successful
And Project Dashboard page displayed is "false"


@MobileTest
Scenario: Login to MdesManager application 
Given MdesManager is launched in Chrome browser
When User enters username "nath" and password "5678" and click login
Then Login should be successful
And Project Dashboard page displayed is "false"


@WebTest
Scenario: Login to MdesManager application 
Given MdesManager is launched in Chrome browser
When User enters username "nath123" and password "1235678" and click login
Then Login should be successful
And Project Dashboard page displayed is "false"


@SmokeTest
Scenario: DataTable for Login to MdesManager application 
Given MdesManager is launched in Chrome browser
When User enters below details for SignUp
| Sabarinath | Nerella | nath.nerella@gmail.com | Missouri | USA | 63368 |
Then Login should be successful
And Project Dashboard page displayed is "true"


@RegressionTest
Scenario Outline: Parameterization for Login to MdesManager application 
Given MdesManager is launched in Chrome browser
When User enters <Username> and <Password> on login page and click login
Then Login should be successful
And Project Dashboard page displayed is "true"

Examples:
| Username | Password |
| sabari1 | nath1 |
| sabari2 | nath2 |
| sabari3 | nath3 |
| sabari4 | nath4 |