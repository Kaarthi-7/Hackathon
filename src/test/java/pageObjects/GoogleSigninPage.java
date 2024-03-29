package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtilities;

public class GoogleSigninPage extends BasePage {
	WebDriver Driver;
	public GoogleSigninPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "identifierId")
	WebElement Username;
	
	@FindBy(xpath = "//div[@class='LXRPh']//div[@class='dEOOab RxsGPe']/div")
	WebElement error;
	
	public void GivingMailID() {
		Username.click();
		Username.sendKeys("abc@gmail.com");
	}
	
	public void ProcedingWithMailID() {
		Username.sendKeys(Keys.ENTER);
	}
	
	public void CaptureError() throws Exception {
		ExcelUtilities EU = new ExcelUtilities();
		Thread.sleep(1000);
		System.out.println(error.getText());
		System.out.println("==================================================");
		EU.write(1,4,error.getText());
	}
}