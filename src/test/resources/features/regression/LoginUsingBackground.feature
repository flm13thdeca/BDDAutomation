Feature: To validate login functionality of Demo open cart

Background: Preconditions steps
Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"


@wip3003 @smoke @regression
Scenario: To validate login using valid credentials


When user enters text "reyaz0806" into textbox using xpath "//input[@name='username']"
And user enters text "reyaz123" into textbox using xpath "//input[@name='password']"
And user clicks on button using xpath "//input[@name='login']"
Then user verify the title to be "Adactin.com - Search Hotel"

@regression
Scenario Outline: To validate login using Invalid credentials


When user enters text '<username>' into textbox using xpath "//input[@name='username']"
And user enters text '<password>' into textbox using xpath "//input[@name='password']"
And user clicks on button using xpath "//input[@name='login']"
Then user verify the title to be '<expectedTitle>'

Examples: 
| username | password | expectedTitle |
| reyaz0806 | reyaz456 | Adactin.com - Hotel Reservation System |
| reyaz1212 | reyaz123 | Adactin.com - Hotel Reservation System |
| reyaz1212 | reyaz456 | Adactin.com - Hotel Reservation System |



