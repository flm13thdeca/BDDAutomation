Feature: To validate login functionality of adactin Hotel app

@wip3103
Scenario: To validate login functionality using valid credentials 

Given user is on "LoginPage"
Then user validates title to be title to be "Adactin.com - Hotel Reservation System"
When user enters into textbox "username_textbox" "reyaz0806"
And user enters into textbox "password_textbox" "reyaz123"
And user clicks "login_button"
Then user validates title to be title to be "Adactin.com - Search Hotel"
 


