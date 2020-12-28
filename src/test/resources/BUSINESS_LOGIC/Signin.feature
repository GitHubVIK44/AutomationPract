Feature: Login functionality
Background: User launches browser and opens the website
Given User opens "Chrome" browser using exe file "E:\\ST\\Selenium\\chromedriver.exe"
Given User opens website using url 

@SmokeTest
Scenario: User will log in the account
When user enters "manojvip259@gmail.com" as username
When user enters "practicevik" as password
When user clicks on login button
Then user is on my account page