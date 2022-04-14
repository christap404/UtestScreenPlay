#Actor: Christian Tapias Escudero - t.christian@tcs.com

Feature: as a user want to validate the web page Choucair Testing

  Background: home page
    Given the user are in home page

  @ES1
  Scenario: button to scroll to the top of the page
    When user scrolls down the main page
    And the user clicks on the button to return to the top
    Then the user see the top page



  Scenario: button to scroll down the home page
    When the user see the button to scroll down (an arrow) and clicks on it
    Then scroll down the section on the home page


  Scenario: buttons to navigate in the Formacion section
    When the user clicks on the Formacion button
    And the user clicks on the button Programacion de cursos
    Then The course scheduling section is displayed