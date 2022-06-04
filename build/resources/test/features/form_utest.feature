#Autor: Christian Tapias Escudero - christiantapias404@gmail.com

Feature: I as a user want to create a new user on the Utest page

  Background: home page
    Given the user are in home page

  Scenario: create a new user
    When the user click Join Today
    And the user fill the Step one
      | name      | lastName | email           | month | day | year | idiom   |
      | Christian | Tapias   | ddd21sss6@tkkyl.com | July  | 6   | 1992 | Spanish |
    And the user fill the step two
      | city | code   | country  |
      | Cali | 220022 | Colombia |
    And the user fill the step three
      | computer | version  | language | movileDivice | model  | operationSystem |
      | Windows  | 7 64-bit | Hebrew   | Alcatel      | OT-890 | Android         |
    And the user fill the Last Step and click on button Complete Setup
      | password   | confirmPassword |
      | Mayhi123.a | Mayhi123.a      |
    Then the user see this message Welcome to the world's largest community of freelance software testers!