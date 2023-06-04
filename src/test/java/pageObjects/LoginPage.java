package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='AccountFrm_firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath = "//input[@id='loginFrm_loginname']")
	WebElement regFirstName;
	
	@FindBy(xpath = "//input[@id='loginFrm_password']")
	WebElement regPwd;

	@FindBy(xpath = "//input[@id='AccountFrm_lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath = "//input[@id='AccountFrm_email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath = "//input[@id='AccountFrm_telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath = "//input[@id='AccountFrm_fax']")
	WebElement txtFax;
	
	@FindBy(xpath = "//input[@id='AccountFrm_company']")
	WebElement txtComapny;


	@FindBy(xpath = "//input[@id='AccountFrm_address_1']")
	WebElement txtAddress1;
	
	@FindBy(xpath = "//input[@id='AccountFrm_address_2']")
	WebElement txtAddress2;

	@FindBy(xpath = "//input[@id='AccountFrm_city']")
	WebElement txtCity;
	
	@FindBy(xpath = "//select[@id='AccountFrm_zone_id']")
	WebElement txtState;
	
	@FindBy(xpath = "//input[@id='AccountFrm_postcode']")
	WebElement txtZipcode;
	
	@FindBy(xpath = "//select[@id='AccountFrm_country_id']")
	WebElement txtCountry;
	
	@FindBy(xpath = "//input[@id='AccountFrm_loginname']")
	WebElement txtLoginName;
	
	@FindBy(xpath = "//input[@id='AccountFrm_password']")
	WebElement loginPwd;
	
	@FindBy(xpath = "//input[@id='AccountFrm_confirm']")
	WebElement loginPwdConfirm;
	
	@FindBy(xpath = "//input[@id='accountFrm_accountregister']")
	WebElement btnRegister;
	
	@FindBy(xpath = "//input[@id='AccountFrm_newsletter1']")
	WebElement selectSubscribeYes;
	
	
	@FindBy(xpath = "//input[@id='AccountFrm_agree']")
	WebElement selectPrivacyPolicy;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement regLoginButton;
	
	
	
	public void setFirstName(String firstName) {
		txtFirstname.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		txtLastname.sendKeys(lastName);
	}

	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}
	
	public void setAddress1(String address1) {
		txtAddress1.sendKeys(address1);
	}

	public void setAddress2(String address2) {
		txtAddress2.sendKeys(address2);
		}
	
	public void setState(String state) {
		txtState.sendKeys(state);
	}

	public void setZipcode(String zipcode) {
		txtZipcode.sendKeys(zipcode);
	}

	public void setLoginName(String loginName) {
		txtLoginName.sendKeys(loginName);
	}
	
	public void setCountry(String country) {
		txtCountry.sendKeys(country);
	}
	
	public void setTelephone(String telePhone) {
		txtTelephone.sendKeys(telePhone);
	}
	
	public void setFax(String fax) {
		txtFax.sendKeys(fax);
	}
	   
	public void setCompany(String company) {
		txtComapny.sendKeys(company);
	}
	
	public void setPassword(String pwd) {
		loginPwd.sendKeys(pwd);
	}

	public void setConfirmPassword(String pwdConfirm) {
		loginPwdConfirm.sendKeys(pwdConfirm);
	}
	
//	public void setSubscribeYes(String subscribeYes) {
//		selectSubscribeYes.sendKeys(subscribeYes);
//	}
//	
//	public void setSubscribeYes(String subscribeYes) {
//		selectPrivacyPolicy.sendKeys(subscribeYes);
//	}
	
	public void clickSubscribe() {
		selectSubscribeYes.click();
	}
	
	public void clickPrivacyPolicy() {
		selectPrivacyPolicy.click();
	}
	
	public void setregLoginName(String regLoginName) {
		regFirstName.sendKeys("s.p.saagar");
	}
	
	public void setRegLoginPwd(String regLoginPwd ) {
		regPwd.sendKeys("thesagar");
	}
	
	public void clickLogin() {
		btnRegister.click();
	}
	
	public void clickregLogin() {
		regLoginButton.click();
	}
}
