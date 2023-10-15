package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	 //Variable- private
		@FindBy (xpath = "//a[text() = 'Mobiles']")
		private WebElement selectMobileModule;
		
		@FindBy (xpath = "(//a[@role  =  'tab'  ])[3]")
		private WebElement latestMobileBrand;
		
		//Constructor public
		public  HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Methods - public
		
        public void clickOnSelectMobileModule() {
			 selectMobileModule.click();
		}
        
        public void clickOnLatestMobileBrand() {
        	latestMobileBrand.click();
		}
		
		
		
		
		

}
