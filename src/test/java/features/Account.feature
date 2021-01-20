Feature: Application Login

Background:
Given Validate the browser
When Browser is triggered 
Then Check if browser is started 


Scenario: Home Page deafult login 
Given User is in NetBanking landing page
When User login into application with "Jin" name and "1234" 
Then Home Page is Populated
And Cards are displayed "True"

Scenario: Home Page deafult login
Given User is in NetBanking landing page
When User login into application with "Jhon" name and "4321" 
Then Home Page is Populated
And Cards are displayed "False"


Scenario: Home Page deafult login
Given User is in NetBanking landing page
When User sign up with following details
| jenny | abcd | Jenny@yahoo.com | Egypt | 32422424 |
Then Home Page is Populated
And Cards are displayed "False"


Scenario Outline: Home Page deafult login
Given User is in NetBanking landing page
When User login in to application with <Username> name and <Password>
Then Home Page is Populated
And Cards are displayed "False"

Examples:
|Username |Password |
|User1    |Pass1    |
|User2    |Pass2    |
|User3    |Pass3    |
|User4    |Pass4    |