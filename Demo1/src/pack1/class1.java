package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		WebElement Reg=driver.findElement(By.xpath("//a[text()=..]"));
		Reg.click();
		WebElement Uname=driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement Pswd=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement Sbmt=driver.findElement(By.xpath("//input[@name='Login']"));
		Uname.sendKeys("asdfgh");
		Pswd.sendKeys("asdfgh");
		Sbmt.click();
	}

}
