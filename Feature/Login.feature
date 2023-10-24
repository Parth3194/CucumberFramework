Feature: Login in Tutorial Ninja Application.

Scenario Outline: Successul login Tutorial Ninja application with valid username and password 
Given User launch the chrome browser
When User opens the url as "<url>"
And enters the username as "<username>" and password as "<password>"
And click on login button
Then User is successfully logged in the application and views the landing page

Examples:
|url|username|password|
|https://tutorialsninja.com/demo/|seleniumpanda4567@gmail.com|Selenium@123|