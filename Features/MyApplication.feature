@tag
Feature: Add a computer kit bundle and see that it is correctly in the basket, with the correct information. 
@tag1
	Scenario: Add a computer kit bundle and see that it is correctly in the basket, with the correct information.
	Given Open firefox and start application
	And User is on kano website
	When I add computer kit bundle to basket
	Then kit is added to basket with correct information 

@tag2
Scenario: Change to another country, Add a computer kit bundle and see that it is correctly in the basket with the correct information 
Given Open firefox and start application
And User is on kano website
And change to another country
When I add computer kit bundle to basket
Then kit is added to basket with correct information 

@tag3
	Scenario: Verifying text on the homempage
	Given Open firefox and start application
	When user clicks on make 
	Then user is directed to the project page 
  And World is displayed correctly on the nav bar 
  And Make is displayed correctly on the nav bar 
  And Shop is displayed correctly on the nav bar 
  And Connected Kanos present on the footer
  And Online Today present on the footer 
  And Lines of code present on the footer 
  And Creations shared present on the footer
