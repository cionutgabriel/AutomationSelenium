Feature: Open page
  Scenario: Deschide o pagina la alegere
    Given Open the browser
    When Access page "https://qa-practice.netlify.app/"
    And Press button "Forms"
    And Press button "Login"
    And Complete field "Email" with value "admin@admin.com"
    And Complete field "Password" with value "admin123"
    And Press button "Submit"
    Then Close browser "Close browser"
