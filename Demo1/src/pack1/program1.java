package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("asdfgh");
		driver.findElement(By.cssSelector("input#password")).sendKeys("asdfgh");
		driver.findElement(By.cssSelector("input[name='Login']")).click();
	}

}
