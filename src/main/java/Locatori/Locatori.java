package Locatori;

import org.openqa.selenium.By;

public class Locatori {
	public By numeButon (String buttonname){
		switch (buttonname){
			case "Buttons":
				return By.id("buttons");

			case    "Checkboxes"	:
				return By.id("checkboxes");
			case    "Checkbox1"	:
				return By.id("checkbox1");
			case    "Checkbox2"	:
				return By.id("checkbox2");
			case    "Checkbox3"	:
				return By.id("checkbox3");
			case    "Forms"	:
				return By.id("forms");
			case    "Login"	:
				return By.id("login");
			case    "Email"	:
				return By.id("email");
			case    "Password"	:
				return By.id("password");
			case "Submit":
				return By.id("submitLoginBtn");
			case "Btn actions":
				return By.id("actions");
			case "Mouse hover":
				return By.id("mouse-hover");
			case "Hover over me":
				return By.id("button-hover-over");





			default: throw new IllegalArgumentException("Nu exista acest buton");
		}
	}
	public By numeField (String fieldname) {
		switch (fieldname) {
			case "Email":
				return By.id("email");
			case "Password":
				return By.id("password");




			default:
				throw new IllegalArgumentException("Nu exista acest buton");
		}
	}
}
