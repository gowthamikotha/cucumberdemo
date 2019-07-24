package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

public class TESTMEAPP {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String s1, String s2) throws InterruptedException {
	Thread.sleep(5000);	
	driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(s1);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s2);
	driver.findElement(By.xpath("//input[@name='Login']")).click();
	String t_title="Home";
	String a_title=driver.getTitle();
	if(t_title.equals(a_title)) {
		System.out.println("Login is successfull "+s1);
	}
	else {
		System.out.println("Login is failed");
	}
	
  }

  @AfterMethod 
  public void afterMethod1() {
		WebElement o=driver.findElement(By.xpath("//a[contains(text(),'SignOut')]"));
		o.click();
  }
 


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "asdfgh", "asdfgh" },
      new Object[] { "qwerty", "qwerty" },
      new Object[] { "zxcvbn", "zxcvbn" },
      new Object[] { "ram123", "ram123" },

    };
  }
  @BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
  }

}
