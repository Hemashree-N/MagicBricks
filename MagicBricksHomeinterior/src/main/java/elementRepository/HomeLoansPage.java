package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLoansPage {
	
	public HomeLoansPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Home Loans']")
	private WebElement homeloans;
	
	
	public WebElement getHomeloans() {
		return homeloans;
	}

	@FindBy(xpath = "//span[text()='Home Loan']")
	private WebElement homeloan;
	
	public WebElement getHomeloan() {
		return homeloan;
	}
	
	@FindBy(id = "amountRequiredEmiCal")
	private WebElement amountRequiredEmiCal;


	public WebElement getAmountRequiredEmiCal() {
		return amountRequiredEmiCal;
	}
	
	@FindBy(id="interestRateEmiCal")
	private WebElement interestRateEmiCal;


	public WebElement getInterestRateEmiCal() {
		return interestRateEmiCal;
	}
	@FindBy (xpath = "//li[text()='Loan Eligibility Calculator']")
	private WebElement loanEligibilityCalculator;
	
	
	public WebElement getLoanEligibilityCalculator() {
		return loanEligibilityCalculator;
	}

	@FindBy(id = "existingLoanEliCal")
	private WebElement existingLoanEliCal;


	public WebElement getExistingLoanEliCal() {
		return existingLoanEliCal;
	}
	
	@FindBy(id = "submitbuttonEliCalid")
	private WebElement submitbuttonEliCalid;


	public WebElement getSubmitbuttonEliCalid() {
		return submitbuttonEliCalid;
	}
	
	
	
	
	
	

}
