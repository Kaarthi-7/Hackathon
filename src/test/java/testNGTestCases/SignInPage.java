package testNGTestCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import pageObjects.GoogleSigninPage;
import pageObjects.ZigWheelsHomePage;
import factory.BaseClass;

public class SignInPage extends UsedCarsSearch{
	
	@Test(priority = 12,groups= {"regression"})
	public void navigateToMainpage() throws Exception {
		ZigWheelsHomePage ZWHP = new ZigWheelsHomePage(BaseClass.getDriver());
		ZWHP.NavigateBack();
		BaseClass.getLogger().info("----Successfully navigated to home page----");
	}
	
	@Test(priority = 13,groups= {"regression","smoke"})
	public void ClickonSignIn() throws Exception {
		ZigWheelsHomePage ZWHP = new ZigWheelsHomePage(BaseClass.getDriver());
		ZWHP.SignIn();
		BaseClass.getLogger().info("----Successfully clicked on login in home page----");
	}
	
	@Test(priority = 14,groups= {"regression","smoke"})
	public void Clickongoogle() throws Exception {
		ZigWheelsHomePage ZWHP = new ZigWheelsHomePage(BaseClass.getDriver());
		ZWHP.GoogleClick();
		BaseClass.getLogger().info("----Successfully clicked on google in signin home page----");
	}
	
	@Test(priority = 15,groups= {"regression","smoke"})
	public void SwitchingTab() throws Exception {
		List<String> handleList = new ArrayList<String>(BaseClass.getDriver().getWindowHandles());
		BaseClass.getDriver().switchTo().window(handleList.get(1));
		Thread.sleep(3000);
		BaseClass.getLogger().info("----Successfully switched to login tab----");
	}
	
	@Test(priority = 16,groups= {"regression","smoke"})
	public void SendMailID() throws Exception {
		GoogleSigninPage GSP = new GoogleSigninPage(BaseClass.getDriver());
		GSP.GivingMailID();
		BaseClass.getLogger().info("----Successfully sent the mail-ID to login page----");
	}
	
	@Test(priority = 17,groups= {"regression","smoke"})
	public void ProcedingWithMain() throws Exception {
		GoogleSigninPage GSP = new GoogleSigninPage(BaseClass.getDriver());
		GSP.ProcedingWithMailID();
		BaseClass.getLogger().info("----Successfully procedded with the Mail-ID----");
	}
	
	@Test(priority = 18,groups= {"regression","smoke"})
	public void captureSigninError() throws Exception {
		GoogleSigninPage GSP = new GoogleSigninPage(BaseClass.getDriver());
		GSP.CaptureError();
		BaseClass.getLogger().info("----Successfully captured the Error message----");
	}
}