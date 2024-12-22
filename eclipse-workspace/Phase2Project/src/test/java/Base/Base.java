package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.homePage;

public class Base {
	
	static WebDriver driver;
	static Base b;
	
	public Base(WebDriver driver) {
    	Base.driver=driver;
	}
    
	public static void main(String[] args) throws InterruptedException {
    	b=new Base(driver);
    	b.OpenBrowser();
	}
	
	
	
	public void OpenBrowser() throws InterruptedException {
        
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_drivers\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/Ecomm/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		homePage h = new homePage(driver);
		h.clickAction(driver);
		
	}

}
