package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNowPage {
	
	//Variable- private
	@FindBy (xpath = "//input[@id = 'buy-now-button'] ")
	private WebElement buynowButton;
		//Constructor public
	public BuyNowPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods - public
	
	public void clickOnBuynowButton() {
		buynowButton.click();
	}
	

	

}
