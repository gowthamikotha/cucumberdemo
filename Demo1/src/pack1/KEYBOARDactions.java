package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KEYBOARDactions {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");	  
	  driver.manage().window().maximize();
	  WebElement f=driver.findElement(By.xpath("//input[@name='q']"));
	  //f.sendKeys("Accenture");
	  Actions a1=new Actions(driver);
	  a1.keyDown(f,Keys.SHIFT).sendKeys("Accenture").build().perform();
	  Thread.sleep(5000);
	  a1.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).keyUp(Keys.SHIFT).build().perform();
	  //a1.keyDown(f,Keys.SHIFT).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).keyUp(Keys.SHIFT).build().perform();

	  driver.close();
	  
  }
}

