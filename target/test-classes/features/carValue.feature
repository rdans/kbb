Feature: Checking my car value

Scenario: User receive their car value
Given Initialize browser with chrome
And User navigate to "https://www.kbb.com/" site
And Click on My Car's Value and user will arrive at Car Worth page
When User select "2016", "BMW", "3 Series", enter "45000", "90232" and press Next 
Then Website will navigate to Category and Style page, and user choose category
And User also choose the style of vehicle and press Next
And User will direct to Options and Condition Page, and pick options, color, condition of their vehicle
And User will navigate to Compare your values page and display Trade-in-Value
And close browser


