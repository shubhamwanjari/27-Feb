package Test;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

public class ZerodhaPinPageTest {
	WebDriver driver;

	@BeforeMethod
	public void LaunchBrowser() {
	driver = Browser.openBrowser();
	}

	@Test
	public void LoginToZerodhaWithPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
	ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
	String userName = Parametrization.getData(0,1);
	String password = Parametrization.getData(1,1);
	zerodhaloginpage.enterUserID(userName);
	zerodhaloginpage.enterpassword(password);
	zerodhaloginpage.ClickOnLogin();

	Thread.sleep(5000);

	ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver);
	String pin = Parametrization.getData(2, 1);
	zerodhaPinPage.enterpin(pin);
	System.out.println(pin);
	zerodhaPinPage.clickOnContinue();
	}
}



