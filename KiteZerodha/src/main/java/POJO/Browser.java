package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcastingchrome driver class to webdriver
		
		
		driver.get("https://kite.zerodha.com/");//mrthod of webdriver interface
		driver.manage().window().maximize();
		return driver;
	}

}
