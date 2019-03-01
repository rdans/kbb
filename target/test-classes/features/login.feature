Feature: Login Application

Scenario Outline: User failed to login
Given Initialize browser with chrome
And User navigate to "https://www.kbb.com/" site
And Click on login link in home page, click sign in button, and user will be at sign in page 
When User enters "<username>" and "<password>" and sign in
Then Website will display "<error>" message 
And close browser

Examples:
|username	|password	|error	|
|rei@gmail.com	|1234	|The email or password you've entered is not valid	|
| 	| 	|Missing required parameter	|
