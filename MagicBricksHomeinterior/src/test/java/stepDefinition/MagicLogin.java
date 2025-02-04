package stepDefinition;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;
	import org.testng.Reporter;

	import elementRepository.MagicLoginPage;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import utilPackage.DriverFactory;
	import utilityClasses.FileUtility;
	import utilityClasses.WebDriverUtility;
	
public class MagicLogin {
		WebDriver driver=DriverFactory.getDriver();
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		FileUtility fileUtility=new FileUtility();
		MagicLoginPage loginPage=new MagicLoginPage(driver);
		
		@When("user should be able to hover on login link")
		public void user_should_be_able_to_hover_on_login_link() throws InterruptedException {
			webDriverUtility.mouseHover(driver, loginPage.getLoginLink());
			Thread.sleep(3000); 
		}

		@When("user should be able to click on login button and navigate to the login page")
		public void user_should_be_able_to_click_on_login_button_and_navigate_to_the_login_page() throws Exception {
			loginPage.getLoginButton().click();
			Thread.sleep(3000);
			webDriverUtility.switchToTabOnTitle(driver, fileUtility.getDataFromPropertiesFiles("loginTitle"));
			Thread.sleep(3000);
		}

		@When("user should be able to enter valid credentails and click on next button")
		public void user_should_be_able_to_enter_valid_credentails_and_click_on_next_button() throws Exception {
			loginPage.getEmailOrPhoneTextFeild().sendKeys(fileUtility.getDataFromPropertiesFiles("mobilenumber"));
		    Thread.sleep(5000);
		    loginPage.getNextButton().click();
		    Thread.sleep(30000);
		}

		@When("user should be able to click on continue")
		public void user_should_be_able_to_click_on_continue() throws InterruptedException {
			loginPage.getContinueButton().click();
			driver.findElement(By.xpath("//div[@class='onmodal__cross']")).click();
		}

		@Then("user should be logged in")
		public void user_should_be_logged_in() {
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='mb-header__main__login js-menu-container loggedin']")).isDisplayed());
		    Reporter.log("User is logged in");
		    
		}


}

