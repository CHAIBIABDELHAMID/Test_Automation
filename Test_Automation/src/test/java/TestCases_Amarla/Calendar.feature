Feature: Calendar

Background: User Is Logged In
	Given Navigate to "amarla" on "build" Login page and connect
	Then  Home page is displayed
	
	
	
@Calendar
Scenario: Calendar Default Display For role COR
	Given Select role "COR"
	When Page Title is displayed
	And Navigation buttons are displayed
	And Pencil icon is displayed
	And Displayin is displayed
	And Colored by is displayed
	And Segment is displayed
	