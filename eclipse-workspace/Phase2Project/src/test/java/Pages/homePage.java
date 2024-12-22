package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class homePage{

	
        WebDriver driver;

        public homePage(WebDriver driver) {
	          this.driver=driver;
        }
        
         By Dresses=By.linkText("Dresses");
         By Contact=By.linkText("Contact");


	     public void clickAction(WebDriver driver) throws InterruptedException {
	 	
	     Actions act= new Actions(driver);
	     WebElement mouseMove=driver.findElement(By.linkText("Shop"));
	     act.moveToElement(mouseMove).build().perform();
	    	    
		 Thread.sleep(2000);
		 driver.findElement(Dresses).click();
		 Thread.sleep(2000);
		 driver. navigate(). back();
		 Thread.sleep(2000);
		 driver.findElement(Contact).click();
		
	}
	
}
