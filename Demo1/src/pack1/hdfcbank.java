package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hdfcbank {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/htdocs/common/onlineservices/netbankingloginsafe_nri.htm");
		String win1=driver.getWindowHandle();
		System.out.println(win1);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/htdocs/nri_banking/accounts/fixed_deposits/fixed_deposits.htm' ]")).click();
		Thread.sleep(5000);
		Set<String> t_windows=driver.getWindowHandles();
		int c_win=t_windows.size();
		//System.out.println(c_win);
		for(String s:t_windows) {
			driver.switchTo().window(s);
			System.out.println(driver.getWindowHandle());
		}
		driver.findElement(By.xpath("//img[@src='/htdocs/nri_banking/product_page/images/primnav/loans.gif']")).click();
		String t="Attractive interest rates";
		String a=driver.findElement(By.xpath("//li[text()='Attractive interest rates ']")).getText();
		
//		a=((WebElement) driver)
		Assert.assertEquals(t, a);
		System.out.println("success");
  }
}
