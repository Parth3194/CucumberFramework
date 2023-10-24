Feature: Register and search feature

Background:
Given user performs browser setup


Scenario Outline: User register process
When user opens "<url>"
And navigate to Register page
Then user enters data for "<firstname>" , "<lastname>" , "<email>" , "<telephone>" , "<password>" , "<passwordconfirm>" 
And user agree to the privacy ploicy 
And clicks on continue button
Then regrestion process is completed successfully
And user can user successfully logout 
Then user close the browser
Examples:
|url|firstname|lastname|email|telephone|password|passwordconfirm|
|https://tutorialsninja.com/demo/|Parthsinh|Chauhan|chauhanparth22119988980319@gmail.com|9137270768|Parth@3194|Parth@3194|


Scenario Outline: Search process
When user opens "<url>"
And search the "<product>"
Then product is displayed
And user close the browser 
Examples:
|url|product|
|https://tutorialsninja.com/demo/|HP|
