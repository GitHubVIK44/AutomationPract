Feature: Login functionality
Background: User launches browser and opens the website
Given User opens "Chrome" browser using exe file "E:\\ST\\Selenium\\chromedriver.exe"
Given User opens website using url 
When user enters "manojvip259@gmail.com" as username
When user enters "practicevik" as password
When user clicks on login button
Then user is on my account page

@SmokeTest
Scenario: User will update the address
When user clicks on my addresses
When user clicks on update
When user selects "Colorado" under state
When user enters "80533" as zipcode
When user clicks on save button
Then user is on Addresses-My Store page
