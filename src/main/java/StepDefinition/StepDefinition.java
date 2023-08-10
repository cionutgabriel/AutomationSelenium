package StepDefinition;
import Locatori.Locatori;
import Utilities.ChromeConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class StepDefinition {
	ChromeDriver driver;
	Locatori locatori = new Locatori();;


	@Given("Open the browser")
	public void deschideChrome(){
		driver=ChromeConfig.getChromeDriver();
	}
	@When("Access page {string}")
	public void acceseazaPagina(String url){
		driver.get(url);
	}
    @And("Press button {string}")
	public void apasaButon(String var){
	    By buttonlocator = locatori.numeButon(var);
	    WebElement element = driver.findElement(buttonlocator);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
    }
	@And("Complete field {string} with value {string}")
	public void completeazaField(String numecamp,String value){
		By fieldLocator = locatori.numeField(numecamp);
		WebElement element = driver.findElement(fieldLocator);
		element.sendKeys(value );


	}
	@And ("Close browser {string}")
	public void close_browser(String string) {
		driver.quit();
	}
	@And("Hover over button {string}")
	public void hover(String hoverButton) throws InterruptedException {
		By buttonLocator = locatori.numeButon(hoverButton);
		WebElement element = driver.findElement(buttonLocator);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		//Thread.sleep(5000);
		String expectedText = "I am shown when someone hovers over the text above.";
		String actualText = driver.findElement(By.xpath("/html/body/div/div/div[3]")).getText();
		if (!expectedText.equals(actualText)) throw new AssertionError("Mesajul nu este corect/Nu sa facut hover");

	}



}
