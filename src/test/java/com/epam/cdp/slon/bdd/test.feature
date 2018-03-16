Feature: AP Creation


Scenario: Buyer User create Topic

	Given Buyer Login
	When Buyer navigates to AM and choose template
	And enter all required fields and click on [Save] Button
	Then new Topic is created
