package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboarddemo {
	WebDriver driver;

  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");	  
	  driver.manage().window().maximize();
	  WebElement f=driver.findElement(By.xpath("//input[@name='q']"));
	  Actions a1=new Actions(driver);
	  a1.keyDown(f,Keys.SHIFT).sendKeys("computer").build().perform();
	  Thread.sleep(5000);
	  a1.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).keyUp(Keys.SHIFT).build().perform();
	  driver.close();
	  
  }
}