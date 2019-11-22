#Author: your.email@your.domain.com


Feature: Google Translate
	As a web user
	I want to use Google translate
	to translate words between different languages

  Scenario: Translate from English to Spanish
    Given That Susan wants to translate word
    When She translates the word cheese from English to Spanish
    Then She should see the word "Queso" in the screen

		##That_susan_wants_to_translate_word() ---> Underscore
		##ThatSusanWantsToTranslateWord() ---> Camel