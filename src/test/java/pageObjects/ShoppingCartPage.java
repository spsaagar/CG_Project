package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage
	{
	public ShoppingCartPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/nav[1]/ul[1]/li[2]/a[1]")
	WebElement btnItems;
	
	@FindBy(xpath="//a[normalize-space()='T-shirts']")
	WebElement clickOnTshirts;
	
	@FindBy(xpath="//div[6]//div[2]//div[3]//a[1]//i[1]")
	WebElement addtoCart;
	
	@FindBy(xpath="//a[normalize-space()='Add to Cart']")
	WebElement addtoCart1;
	
	@FindBy(xpath="//button[@id='checkout_btn']")
	WebElement confirmOrder;
	
	@FindBy(xpath="//a[@id='cart_checkout1']")
	WebElement btnCheckout;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[6]/div[1]/div[1]/a[1]")
	WebElement getTitle;
		
	@FindBy(xpath="//a[@class='checkout_heading']")
	WebElement getTitle1;
	
	@FindBy(xpath="//span[@class='maintext']")
	WebElement checkoutPage;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[3]/tbody[1]/tr[1]/td[2]/a[1]")
	WebElement verifyCheckoutItem;
	
	public void clickOnAppearalAndAccessories()
	{
		btnItems.click();
	}
	
	
	public void clickOnTshirts()
	{
		clickOnTshirts.click();
	}
	
	public void addtoCart() throws InterruptedException
	{
		Thread.sleep(3000);
		addtoCart.click();
		addtoCart1.click();
	}
	
	
	public void clickOnCheckout()
	{
		btnCheckout.click();
	}
	
	public void confirmOrder()
	{
		confirmOrder.click();
	}
	
	public String getTitle()
	{
		String title = getTitle.getAttribute("title");
		return title;
	}
	
	public String getTitle1()
	{
		String title1 = getTitle1.getText();
		return title1;
	}
	
	public String checkoutPage()
	{   
		String checkoutPageVerify = checkoutPage.getText();
		return checkoutPageVerify;
	}
	
	public String verifyCheckoutItemMethod() {
		String verifyCheckoutText = verifyCheckoutItem.getText();
		return verifyCheckoutText;
		
		
	}
}
