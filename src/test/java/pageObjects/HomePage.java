package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath="//a[normalize-space()='Login or register']")
	WebElement lnkRegister;
	
//	@FindBy(xpath="//input[@id='accountFrm_accountregister']")
//	WebElement lnkRegister;

	@FindBy(xpath="(//button[normalize-space()='Continue'])")   // Click on continue on homepage
	WebElement homepageClickContinue;
	
		
	// Action Methods
		public void clickRegister() {
			
			lnkRegister.click();
	}
		
		public void clickLogin() {
			
			lnkRegister.click();
	}
	
	public void homepageClickContinue()    // added in step6
	{
		homepageClickContinue.click();
	}
	
	
	
	}
	
	
	
