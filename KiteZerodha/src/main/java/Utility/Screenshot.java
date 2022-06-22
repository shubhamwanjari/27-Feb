package Utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = Browser.openBrowser();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("C:\\Selenium\\Screenshot\\vctcpune.jpeg");
		
		FileHandler.copy(source, Destination);
    }
}
