package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	        //Variable- private
			@FindBy (xpath = "//input[@id = 'add-to-cart-button']")
			private WebElement addToCartButton;
			
			@FindBy (xpath = "//input[@aria-labelledby = 'attach-sidesheet-view-cart-button-announce']")
			private WebElement cartButton;
			
			@FindBy (xpath = "//span[@class ='a-button-text a-declarative']")
			private WebElement quantitybutton;
			
			@FindBy (xpath = "(//input[@class = 'a-button-input'])[1]")
			private WebElement proceedToBuyButton ;
			
			
			
			//Constructor public
			public AddToCartPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Methods - public
			
			public void clickOnAddToCartButton() {
				addToCartButton.click();
			}
			
			public void clickOnCartButton() {
				caButton.click();
			}
			
			public void clickOnQuantitybutton() {
				clickqubutton.click();
			}
			
			public void clickOnProceedToBuyButton() {
				proceedToBuyButton.click();
			}
}
