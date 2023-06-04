package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	// Elements
		@FindBy(name = "firstname")
		WebElement txtFirstname;

		@FindBy(name = "lastname")
		WebElement txtLasttname;

		@FindBy(name = "email")
		WebElement txtEmail;

		@FindBy(name = "telephone")
		WebElement txtTelephone;

		@FindBy(name = "fax")
		WebElement txtFax;
		
		@FindBy(name = "company")
		WebElement txtCompany;


		@FindBy(name = "address_1")
		WebElement txtAddress1;
		
		@FindBy(name = "address_2")
		WebElement txtAddress2;
		
		@FindBy(name = "city")
		WebElement txtCity;
		
		@FindBy(name = "zone_id")
		WebElement txtZoneId;
		
		@FindBy(name = "postcode")
		WebElement txtPostCode;

		@FindBy(name = "country_id")
		WebElement chkCountryId;
		
		@FindBy(name = "loginname")
		WebElement txtLoginname;
		
		@FindBy(name = "password")
		WebElement txtPassword;

		@FindBy(name = "confirm")
		WebElement pwdConfirm;

		@FindBy(xpath = "//input[@id='AccountFrm_newsletter1']")
		WebElement yesSubscribe;
		
		@FindBy(xpath = "//input[@id='AccountFrm_newsletter0']")
		WebElement noSubscribe;
		
		@FindBy(xpath = "//input[@id='AccountFrm_agree']")
		WebElement chkPrivacyPoliy;
		
		
		@FindBy(xpath = "//button[normalize-space()='Continue']")
		WebElement continueRegister;

		public void setFirstName(String fname) {
			txtFirstname.sendKeys(fname);

		}

		public void setLastName(String lname) {
			txtLasttname.sendKeys(lname);

		}

		public void setEmail(String email) {
			txtEmail.sendKeys(email);

		}

		public void setTelephone(String tel) {
			txtTelephone.sendKeys(tel);

		}

		public void setPassword(String pwd) {
			txtPassword.sendKeys(pwd);

		}

		public void setConfirmPassword(String pwd) {
			pwdConfirm.sendKeys(pwd);

		}

		public void setPrivacyPolicy() {
			chkPrivacyPoliy.click();

		}

		public void clickContinue() {
			continueRegister.click();

		}

//		public String getConfirmationMsg() {
//			try {
//				return (msgConfirmation.getText());
//			} catch (Exception e) {
//				return (e.getMessage());
//
//			}

		}
		

		
