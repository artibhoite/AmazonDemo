package TestNGClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AddToCartPage;
import Pages.BuyNowPage;
import Pages.HomePage;


public class VerifyMobileModulePage {
	
	private WebDriver driver;
	 @BeforeClass
	 public void launchBrowser() {
		   System.setProperty("webdriver.Opera.driver","D:\\Automation\\chromedriver-win32\\chromedriver.exe");
			
			OperaOptions options = new OperaOptions();
			options.addArguments("--remote-allow-origins=*");
		    driver = new OperaDriver(options);

	 }
	 
    @BeforeMethod
    public void openHomePage() {
   	   driver.get("https://www.amazon.in/");
 		    driver.manage().window().maximize();
 		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
 		   HomePage homePage = new HomePage(driver);
 			homePage.clickOnSelectMobileModule();
 			homePage.clickOnLatestMobileBrand();
 	 }
    
    @Test
    public void toVerifyAddToCartPage() {
    	AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCartButton();
		addToCartPage.clickOnCartButton();
		addToCartPage.clickOnQuantitybutton();
		addToCartPage.clickOnProceedToBuyButton();
         
    }
    
    @Test
    public void toVerifyBuyNowPage() {
    	BuyNowPage buyNowPage = new BuyNowPage(driver);
		buyNowPage.clickOnBuynowButton();
   	 
	}
     
    @AfterClass
    public void closeBrowser() {
   	 driver.close();
  	 }  

   

}
