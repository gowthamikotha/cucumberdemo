package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signup {
	public static void main(String args[]) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		WebElement Reg=driver.findElement(By.xpath("//a[@href='RegisterUser.htm']"));
		Reg.click();
		WebElement Uname=driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement Fname=driver.findElement(By.xpath("//input[@name='firstName']"));
		WebElement Lname=driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement Pswd=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement Cpswd=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		WebElement Email=driver.findElement(By.xpath("//input[@name='emailAddress']"));
		WebElement Mnum=driver.findElement(By.xpath("//input[@name='mobileNumber']"));
		WebElement add=driver.findElement(By.xpath("//textarea[@name='address']"));
		WebElement Dob=driver.findElement(By.xpath("//input[@name='dob']"));
		WebElement Sq=driver.findElement(By.xpath("//select[@name='sequrityQuestion']"));
		Select s1=new Select(Sq);
		s1.selectByIndex(1);
		WebElement Ans=driver.findElement(By.xpath("//input[@name='answer']"));
		WebElement Sbmt=driver.findElement(By.xpath("//input[@name='Submit']"));
		Uname.sendKeys("qwert");
		Fname.sendKeys("qwert");
		Lname.sendKeys("qwert");
		Pswd.sendKeys("qwert");
		Cpswd.sendKeys("qwert");
		Email.sendKeys("qwert@gmail.com");
		Mnum.sendKeys("7412589632");
		add.sendKeys("kjsklt");
		Dob.sendKeys("15/06/1998");
		Ans.sendKeys("hyd");
		Sbmt.click();
		WebElement name=driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement Pswd1=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement Sb=driver.findElement(By.xpath("//input[@name='Login']"));
		name.sendKeys("asdfgh");
		Pswd1.sendKeys("asdfgh");
		Sb.click();
		driver.findElement(By.xpath("//a[contains(text(),'SignOut')]"));
	}

}
