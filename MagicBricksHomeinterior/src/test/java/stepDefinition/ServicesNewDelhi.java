package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.SerivcesNewDelhiPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class ServicesNewDelhi {
    WebDriver driver = DriverFactory.getDriver();
	WebDriverUtility utility =new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	SerivcesNewDelhiPage servicesnewdelhi=new SerivcesNewDelhiPage(driver);
	
	@When("user should be able to click on New delhi")
	public void user_should_be_able_to_click_on_new_delhi() throws Exception {
		servicesnewdelhi.getNewdelhi().click();
	    Thread.sleep(2000);
	    String title=fileUtility.getDataFromPropertiesFiles("newdelhidesigers");
	    utility.switchToTabOnTitle(driver, title);
	    Reporter.log("user is able to click on New delhi button",true);
	}

	@When("user should be navigated to the Interior Designers in new delhi")
	public void user_should_be_navigated_to_the_interior_designers_in_new_delhi() {
	    Assert.assertTrue(servicesnewdelhi.getFilter().isDisplayed());
	    Reporter.log("user is able to View  Interior Designers in new delhi",true);
	}

	@When("user should be able to scroll down")
	public void user_should_be_able_to_scroll_down() throws InterruptedException {
		Thread.sleep(5000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1800);");
		Reporter.log("user is able to scroll down",true);
	}

	@When("user should be able to click on Kitchen & Wardrobes")
	public void user_should_be_able_to_click_on_kitchen_wardrobes() {
	    servicesnewdelhi.getKitchen().click();
	    Reporter.log("user is able to click on Kitchen & Wardrobes",true);
	}

	@Then("user should be able to fill all the data")
	public void user_should_be_able_to_fill_all_the_data() throws Exception {
	    servicesnewdelhi.getUshape().click();
	    Reporter.log("user is able to click on ushape");
	    servicesnewdelhi.getBig().click();
	    Reporter.log("user is able to click on bigelement",true);
	    servicesnewdelhi.getNext().click();
	    Reporter.log("user is able to click on next",true);
	    servicesnewdelhi.getPress().click();
	    Reporter.log("user is able to click on greatsymbol",true);
	    servicesnewdelhi.getLarge().click();
	    Reporter.log("user is able to click on large",true);
	    servicesnewdelhi.getNext2().click();
	    Reporter.log("user is able to click on nextbutton",true);
	    String enter1=fileUtility.getDataFromExcel("sheet2", 1, 0);
	    driver.findElement(By.id("user-name")).sendKeys(enter1);
	    String enter2=fileUtility.getDataFromExcel("sheet2", 2, 0);
	    driver.findElement(By.id("phone")).sendKeys(enter2);
	    String enter3=fileUtility.getDataFromExcel("sheet2", 3, 0);
	    driver.findElement(By.id("email")).sendKeys(enter3);
	    
//	    servicesnewdelhi.getUsername().sendKeys("ram");
//	    servicesnewdelhi.getPhone().sendKeys("6362542958");
//	    servicesnewdelhi.getEnteremail().sendKeys("hema@gmail.com");
	    servicesnewdelhi.getGetfree().click();
	    Thread.sleep(2000);
	    servicesnewdelhi.getVerify().click();
	    Thread.sleep(1000);
	    servicesnewdelhi.getSelfuse().click();
	    Reporter.log("user is able to click on selfuse",true);
	    servicesnewdelhi.getMorethan().click();
	    Reporter.log("user is able to click on plans",true);
	    servicesnewdelhi.getBudget().click();
	    Reporter.log("user is able to click on budget",true);
	    servicesnewdelhi.getGetfreestimate().click();
	    Reporter.log("user is able to click on Getfreestimate",true);
	    servicesnewdelhi.getEmail().click();
	    Reporter.log("user is able to click on mail",true);
	    String enter4=fileUtility.getDataFromExcel("sheet2", 0, 0);
	    driver.findElement(By.id("ptch-pop-name-1")).sendKeys(enter4);
	    servicesnewdelhi.getGetnow().click();
	    Reporter.log("user is able to enter the mail");
	    
	}

}
