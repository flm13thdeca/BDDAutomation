Feature: To validate registration functionality

@abcd
Scenario: To validate registration functionality using valid data

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user clicks link using linktext "New User Register Here"
And user enters details in New User Registration Form
|ravi3003|ravi123|ravi123|ravi kumar|abcd@gmail.com|india|
And user clicks on checkbox using xpath "//input[@name='tnc_box']"
And user clicks on button using xpath "//input[@name='Submit']"

@xyz
Scenario: To validate registration functionality using valid data DataTable with mapping

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user clicks link using linktext "New User Register Here"
And user enters details in New User Registration Form2
|username| password | confirm password | full name | email | captcha |
|reyaz3103|reyaz123|reyaz123|reyaz s|abcd123@gmail.com|india|
And user clicks on checkbox using xpath "//input[@name='tnc_box']"
And user clicks on button using xpath "//input[@name='Submit']"