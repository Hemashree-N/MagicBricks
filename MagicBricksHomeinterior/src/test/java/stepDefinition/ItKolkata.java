package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.ItKolkataPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class ItKolkata {
	
	public WebDriver driver = DriverFactory.getDriver();
	WebDriverUtility utility =new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	ItKolkataPage kolkata=new ItKolkataPage(driver);
	
//	@Given("Browser should be launched and url should be navigated")
//	public void browser_should_be_launched_and_url_should_be_navigated() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("user is able to mouse hover on the kolkata and navigated to kolkata page")
	public void user_is_able_to_mouse_hover_on_the_kolkata_and_navigated_to_kolkata_page() {
		utility.mouseHover(driver,kolkata.getHover());
    	Assert.assertTrue(kolkata.getKolkata().isDisplayed());
		Reporter.log("mouse hover on Kolkata link",true);
		kolkata.getKolkata().click();
		Reporter.log("user clicks on Kolkata",true);
	}

	@When("user is able to click on  Properties listed for you and navigated to House for Sale in Kolkata")
	public void user_is_able_to_click_on_properties_listed_for_you_and_navigated_to_house_for_sale_in_kolkata() throws Exception {
	   kolkata.getPropertieslistedforyou().click();
	   Reporter.log("user clicks on Properties listed for you",true);
	   String title=fileUtility.getDataFromPropertiesFiles("Properties");
	    utility.switchToTabOnTitle(driver, title);
	    Thread.sleep(3000);
	}

	@When("user is able to click on new project and navigated to new project page")
	public void user_is_able_to_click_on_new_project_and_navigated_to_new_project_page() throws Exception {
	    kolkata.getNewprojects().click();
	    String title=fileUtility.getDataFromPropertiesFiles("newproject");
	    utility.switchToTabOnTitle(driver, title);
	}

	@When("user is able to click on Expert Reviews")
	public void user_is_able_to_click_on_expert_reviews() {
	    kolkata.getExpertreviews().click();
	}

	@When("user is able to click on sunrise meadows and scroll down to PropWorth Insights")
	public void user_is_able_to_click_on_sunrise_meadows_and_scroll_down_to_prop_worth_insights() throws Exception {
	    kolkata.getSunrisemeadows().click();
	    String title=fileUtility.getDataFromPropertiesFiles("sunrise");
	    utility.switchToTabOnTitle(driver, title);
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1800);");
		Thread.sleep(3000);
	}

	@Then("user is able to click on Locality and Park Circus and Purba Barisha and Kalyani")
	public void user_is_able_to_click_on_locality_and_park_circus_and_purba_barisha_and_kalyani() throws InterruptedException {
	    kolkata.getLocality().click();
	    Thread.sleep(4000);
	    kolkata.getParkcircus().click();
	    Thread.sleep(4000);
	    kolkata.getPurbabarisha().click();
	    Thread.sleep(4000);
	}

}
