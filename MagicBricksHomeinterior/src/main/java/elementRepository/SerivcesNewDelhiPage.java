package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SerivcesNewDelhiPage {
	
	public SerivcesNewDelhiPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='New Delhi']")
	private WebElement newdelhi;

	public WebElement getNewdelhi() {
		return newdelhi;
	}
	
	@FindBy(xpath = "//a[@class='quote-card icon-2']//span[text()='Calculate']")
	private WebElement Kitchen;
	
	
	public WebElement getKitchen() {
		return Kitchen;
	}

	@FindBy(xpath = "//div[text()='U - shape']")
	private WebElement ushape;
	
	
	public WebElement getUshape() {
		return ushape;
	}

	@FindBy(xpath = "//div[text()='Big (Above 100 sq ft)']")
	private WebElement big;

	public WebElement getBig() {
		return big;
	}
	
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement next;

	public WebElement getNext() {
		return next;
	}
	
	@FindBy(xpath = "//button[text()='+']")
	private WebElement press;
	
	
	public WebElement getPress() {
		return press;
	}

	@FindBy(xpath = "//div[text()='Large']")
	private WebElement Large;

	public WebElement getLarge() {
		return Large;
	}
	
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement next2;

	public WebElement getNext2() {
		return next2;
	}
	
	@FindBy(xpath = "//label[text()='Self-use']")
	  private WebElement selfuse;
	
	
	
	
	public WebElement getSelfuse() {
		return selfuse;
	}

	@FindBy(xpath = "//label[text()='More than 3 Months']")
	private WebElement morethan;

	public WebElement getMorethan() {
		return morethan;
	}
	
	@FindBy(xpath = "//label[text()='5-10 Lakhs']")
	private WebElement Budget;

	public WebElement getBudget() {
		return Budget;
	}
	
	@FindBy(xpath = "//button[text()='Get Free Estimate']")
	private WebElement getfreestimate;

	public WebElement getGetfreestimate() {
		return getfreestimate;
	}
	
	@FindBy(xpath = "//button[text()='Get these Estimations on your Email']")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	//assert
	@FindBy(xpath = "//div[text()='Great!']")
	private WebElement great;

	public WebElement getGreat() {
		return great;
	}
	
	
	@FindBy(xpath = "//div[text()='Filter by ']")
	private WebElement filter;

	public WebElement getFilter() {
		return filter;
	}
	
	@FindBy(xpath = "//label[text()='Email']")
	private WebElement emailid;

	public WebElement getEmailid() {
		return emailid;
	}
	
	@FindBy(xpath = "//button[text()='Get Now']")
	private WebElement getnow;

	public WebElement getGetnow() {
		return getnow;
	}
	
	
	//whithoutlogin
	
@FindBy(id = "user-name")
private WebElement username;

public WebElement getUsername() {
	return username;
}
@FindBy(id = "phone")
private WebElement phone;

public WebElement getPhone() {
	return phone;
}

@FindBy(id = "email")
private WebElement enteremail;

public WebElement getEnteremail() {
	return enteremail;
}

@FindBy(xpath = "//button[text()='Get Free Estimate']")
private WebElement getfree;

public WebElement getGetfree() {
	return getfree;
}

@FindBy(xpath = "//button[text()='Verify']")
private WebElement verify;

public WebElement getVerify() {
	return verify;
}


	
	
	
	
	
	
	
	
	
	
	
	
}
