package casepack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class scenario1 {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	@BeforeClass
	public void Beforeclass() {
		  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
	}
  @Test(priority=1)
  public void Login() {
	  test=extent.createTest("Tc01","Login");
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("asdfgh");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("asdfgh");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
  }
		@Test(priority=2)
		public void testCart() {
			  test=extent.createTest("Tc02","Cart");
		driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Head Phone')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),' Add to cart')]")).click();
		driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
		driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
		}
		@Test(priority=3)
		public void testpayment() {
			  test=extent.createTest("Tc03","Payment");
		driver.findElement(By.xpath("//textarea[@name='ShippingAdd']")).sendKeys("assrryfiujnkjl");
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.xpath("//input[@name='transpwd']")).sendKeys("Trans@456");
		driver.findElement(By.xpath("//input[@value='PayNow']")).click();
		}
	@AfterClass
	public void testlogout() {

		driver.findElement(By.xpath("//a[contains(text(),'SignOut')]")).click();
		driver.close();


		//input[@name='username']
		}
		
		//Actions a=new Actions(driver);
  @AfterMethod
  public void getResult(ITestResult result) throws IOException {
	  if(result.getStatus()==ITestResult.FAILURE) {
		  test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"FAILED", ExtentColor.RED));
		  TakesScreenshot snapshot=(TakesScreenshot)driver;
		  File src=snapshot.getScreenshotAs(OutputType.FILE);
		  String Path=System.getProperty("user.dir")+"/test.output/screens/"+result.getName()+".png";
		  FileUtils.copyFile(src,new File(Path));
		  test.addScreenCaptureFromPath(Path,result.getName());
		  test.fail(result.getThrowable());
	  }
	  else if(result.getStatus()==ITestResult.SUCCESS) {
		  test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"PASSED", ExtentColor.GREEN));
	  }
	  else {
		  test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"SKIPPED", ExtentColor.ORANGE));
		  test.skip(result.getThrowable());
	  }
	  
  }
//  @Parameters({"OS","browser"})
  @BeforeTest
//  public void startReport(String OS,String browser)
	  public void startReport() {
		  htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test.output/testReport123.html");
		  extent=new ExtentReports();
		  extent.attachReporter(htmlReporter);
//		  extent.setSystemInfo("OS",OS);
//		  extent.setSystemInfo("Browser",browser);
//		  htmlReporter.config().setCharVisibilityOnOpen(true);
		  htmlReporter.config().setDocumentTitle("Extent Report Demo");
		  htmlReporter.config().setReportName("Test Report");
//		  htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		  htmlReporter.config().setTheme(Theme.STANDARD);
		  htmlReporter.config().setTimeStampFormat("EEEE,MMMM dd,yyyy,hh:mm a '('zzz')'");
  }

}
