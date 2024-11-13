package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HomeLoansPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class HomeLoans {
	public WebDriver driver = DriverFactory.getDriver();
	WebDriverUtility utility =new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	HomeLoansPage homeloans=new HomeLoansPage(driver);
	
	@When("user should be able to mouse over on Home Loan")
	public void user_should_be_able_to_mouse_over_on_home_loan() {
		utility.mouseHover(driver,homeloans.getHomeloans());
    	Assert.assertTrue(homeloans.getHomeloan().isDisplayed());
		Reporter.log("mouse hover on homeloans link",true);
	}

	@When("user should be able to click on Home Loan")
	public void user_should_be_able_to_click_on_home_loan() throws Exception {
		homeloans.getHomeloan().click();
	    String title=fileUtility.getDataFromPropertiesFiles("homeloans");
	    utility.switchToTabOnTitle(driver, title);
	    Thread.sleep(5000);
	    
	}

	@When("user should be able to click on scroll down to Home Loan Calculator")
	public void user_should_be_able_to_click_on_scroll_down_to_home_loan_calculator() throws InterruptedException {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,2000);");
		 Thread.sleep(3000);
	}

	@When("user should be able to click on EMI Calculator and Loan Eligibility Calculator")
	public void user_should_be_able_to_click_on_emi_calculator_and_loan_eligibility_calculator() {
	      homeloans.getAmountRequiredEmiCal().sendKeys("205000");
	      homeloans.getLoanEligibilityCalculator().click();
	      homeloans.getExistingLoanEliCal().sendKeys("20000");
	      homeloans.getSubmitbuttonEliCalid().click();
	}

	@Then("user should be able to click on Monthly Loan Repayment")
	public void user_should_be_able_to_click_on_monthly_loan_repayment() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
