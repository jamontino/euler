@all @web
Feature:  Demonstrate how to write a feature which interacts with a given website, do stuff, and assert the outcome


  Scenario: Connect to a Wikipedia website and search for an article
    Given that the web browser is "firefox"
    And the user opens website "https://en.wikipedia.org/wiki/Main_Page"
    Then user should see "Wikipedia, the free encyclopedia" on the title

    When user clicks the Search input and searches for "Singapore"
    Then user should see "Singapore" on the article title

    When the fourth link to Chinese is clicked
    Then user should see "Chinese Singaporeans" on the article title