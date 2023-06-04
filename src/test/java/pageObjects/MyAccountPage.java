package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
//  //span[@class='subtext']
//	@FindBy(xpath = "//span[@class='maintext']='Create Account']") // Create Account Page heading
//	WebElement msgHeading;
//	
//	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
//	WebElement lnkLogout;
//	
//
//	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
//	{
//		try {
//			return (msgHeading.isDisplayed());
//		} catch (Exception e) {
//			return (false);
//		}
	//}

//	public void clickLogout() {
//		lnkLogout.click();

	@FindBy(xpath = "//span[@class='maintext']='YOUR ACCOUNT HAS BEEN CREATED!']") // Create Account Page heading
	WebElement msgHeading;
	
	@FindBy(xpath = "//span[@class='maintext']='MY ACCOUNT']") // Create Account Page heading
	WebElement msgHeading1;
	
	
	
	public boolean isAccountRegistered() 
{
	try {
		return (msgHeading.isDisplayed());
	} catch (Exception e) {
		return (false);
	}
	}
	
	public boolean isNavigatedToAccountPage() 
	{
		try {
			return (msgHeading1.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
		}
	}
	
