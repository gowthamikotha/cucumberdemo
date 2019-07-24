package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driver {

	public static WebDriver getDriver(String browser) {
		// TODO Auto-generated method stub
		if(browser.equals("ie")) {
			  System.setProperty("webdriver.ie.driver","C:\\drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			  return  new InternetExplorerDriver();
	
		}
		else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		  return new ChromeDriver();
		}
		else return null;

	}

}
