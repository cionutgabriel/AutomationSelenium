Feature: Open page
  Scenario: Deschide o pagina la alegere
    Given Open the browser
    When Access page "https://qa-practice.netlify.app/"
    And Press button "Btn actions"
    And Press button "Mouse hover"
    And Hover over button "Hover over me"