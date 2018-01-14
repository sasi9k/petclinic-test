Feature: Outline 

Background: Open the web browser 
	Given Open Petclinic application 
	
Scenario: Checking the web page 
	When I click on findowners 
	
	Then It should go to findowners page