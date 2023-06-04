package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.ShoppingCartPage;
import utilities.DataReader;

public class steps {
     WebDriver driver;
     HomePage hp;
     LoginPage lp;
     MyAccountPage macc;
     ShoppingCartPage shoppingCart;
     String productSelected;
     String productBeforeCheckout;

     List<HashMap<String, String>> datamap; //Data driven

     public Logger logger; //for logging
     public ResourceBundle rb; // for reading properties file
     public String br; //to store browser name



    @Before
    public void setup()    //Junit hook - executes once before starting
    {
        //for logging
        logger= LogManager.getLogger(this.getClass());
        //Reading config.properties (for browser)
        rb=ResourceBundle.getBundle("config");
        br=rb.getString("browser");
      
        macc=new MyAccountPage(driver);
                

    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Scenario status ======>"+scenario.getStatus());
        if(scenario.isFailed()) {
             byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png",scenario.getName());
            }
       driver.quit();
    }

    @Given("User Launch browser")
    public void user_launch_browser() {
        if(br.equals("chrome"))
        {
           driver=new ChromeDriver();
        }
        else if (br.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        else if (br.equals("edge")) {
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Given("opens URL {string}")
    public void opens_url(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("User clicks on Register")
    public void click_on_Register() {
    	hp=new HomePage(driver);
        hp.clickRegister();
        logger.info("Clicked on Register ");
    }
    
    @When("User clicks on Login")
    public void click_on_Login() {
    	hp=new HomePage(driver);
        hp.clickLogin();
        logger.info("Clicked on login ");
    }
    
     @When("User clicks on Continue")
     public void click_on_Continue() {
        hp=new HomePage(driver);
        hp.homepageClickContinue();
        logger.info("Clicked on Continue on homepage ");
    }

   @When("User enters First Name as {string} and Last Name as {string} and Email as {string} and Telephone as {string} and Fax as {string} and Company as {string} and Address1 as {string} and Address2 as {string} and State as {string} and Zipcode as {string} and Country as {string} and LoginName as {string} and Password as {string} and ConfirmPassword as {string}")
    public void user_enters_email_as_and_password_as(String firstName, String lastName, String email,String telePhone, String fax, String company,String address1, String address2,String state,String zipcode, String country,String loginName, String pwd,String pwdConfirm) {
    	lp=new LoginPage(driver);
    	
    	lp.setFirstName(firstName);
        logger.info("Provided First Name "); 
        
        lp.setLastName(lastName);
        logger.info("Provided Last Name "); 
       
    	lp.setEmail(email);
        logger.info("Provided Email ");
      
        lp.setTelephone(telePhone);
        logger.info("Provided Telephone "); 
      
        lp.setFax(fax);
        logger.info("Provided Fax "); 
       
        lp.setCompany(company);
        logger.info("Provided Company Name "); 
       
        lp.setAddress1(address1);
        logger.info("Provided Address1 "); 
        
        lp.setAddress2(address2);
        logger.info("Provided Address2 "); 

        lp.setState(state);
        logger.info("Provided Region/State "); 
        
        lp.setZipcode(zipcode);
        logger.info("Provided Zip Code "); 
        
        lp.setCountry(country);
        logger.info("Provided Country "); 
       
        lp.setLoginName(loginName);
        logger.info("Provided Login Name "); 
        
        lp.setPassword(pwd);
        logger.info("Provided Password ");
        
        lp.setConfirmPassword(pwdConfirm);
        logger.info("Provided Password Confirmation");
        
        lp.clickPrivacyPolicy();
        logger.info("Agree to the privacy policy");
    }

   @When("User enters on Registered LoginName as {string} and Registered Password as {string}")
   public void user_enters_registered_username_and_registered_password_as(String regLoginName, String regLoginPwd) throws InterruptedException {
   	    lp=new LoginPage(driver);
   	    Thread.sleep(3000);
   	
   	lp.setregLoginName(regLoginName);
       logger.info("Provided Registered login Name "); 
       Thread.sleep(3000);
       lp.setRegLoginPwd(regLoginPwd);
       logger.info("Provided registered password"); 
       Thread.sleep(3000);
   }
   
   @When("User clicks on Registered login button")
   public void click_on_regLogin() throws InterruptedException {
	   Thread.sleep(3000);
   	   lp.clickregLogin();
   }
  
   @Then("User navigates to My Account Page")
   public void check_user_navigates_to_AccountPage() {
      	macc.isNavigatedToAccountPage();
      	 
           boolean targetpage=macc.isNavigatedToAccountPage();
             if(targetpage)
                 {
                   MyAccountPage myaccpage=new MyAccountPage(driver);
                   Assert.assertTrue(true);
                }
           }

    @When("User clicks on Subscribe")
   public void click_on_Subscribe() {
    	lp.clickSubscribe();
    }
    
    @When("User clicks on Privacy Policy")
    public void click_on_privacy_policy() {
    	lp.clickPrivacyPolicy();
    }
    
    @When("User clicks on Appearal and Accessories")
    public void click_on_appearal_and_accessories() {
    	shoppingCart = new ShoppingCartPage(driver);
    	shoppingCart.clickOnAppearalAndAccessories();
    }
    
    @When("User clicks on Tshirts")
    public void click_on_tshirts() {
    	shoppingCart = new ShoppingCartPage(driver);
    	shoppingCart.clickOnTshirts();
    }
    
    @When("User clicks on add to cart")
    public void addtoCart() throws InterruptedException {
    	shoppingCart = new ShoppingCartPage(driver);
    	productSelected = shoppingCart.getTitle();
    	shoppingCart.addtoCart();
    }
    
    @When("User clicks on Checkout")
    public void click_On_Checkout() throws InterruptedException {
        shoppingCart = new ShoppingCartPage(driver);
        shoppingCart.clickOnCheckout();
    }
    
    @When("User navigates Checkout page")
    public void check_user_navigates_to_checkoutPage() {
            shoppingCart = new ShoppingCartPage(driver);
            String verifyCheckoutPage = shoppingCart.checkoutPage();
            Assert.assertEquals("CHECKOUT CONFIRMATION", verifyCheckoutPage);
            String VerifyCheckoutItem = shoppingCart.verifyCheckoutItemMethod();
            productBeforeCheckout = shoppingCart.getTitle1();
            Assert.assertEquals(productBeforeCheckout, VerifyCheckoutItem);
    	 }
    	 
    @When("User clicks on Confirm Order")
    public void click_On_ConfirmOrder() throws InterruptedException {
    	      shoppingCart = new ShoppingCartPage(driver);
    	     productBeforeCheckout = shoppingCart.getTitle1();
    	      Assert.assertEquals(productBeforeCheckout, productSelected);
    	      shoppingCart.confirmOrder();
    }
}