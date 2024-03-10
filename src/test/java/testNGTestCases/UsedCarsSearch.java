package testNGTestCases;

import org.testng.annotations.Test;

import pageObjects.UsedCarPage;
import pageObjects.ZigWheelsHomePage;
import factory.BaseClass;

public class UsedCarsSearch extends NewBikesSearch{

	@Test(priority = 7,groups= {"regression"})
	public void navigateToHomepage() throws Exception {
		ZigWheelsHomePage ZWHP = new ZigWheelsHomePage(BaseClass.getDriver());
		ZWHP.NavigateBack();
		BaseClass.getLogger().info("----Successfully navigated on the Used Cars----");
	}
	
	@Test(priority = 8,groups= {"regression"})
	public void HoveringUsedCars() throws Exception {
		ZigWheelsHomePage ZWHP = new ZigWheelsHomePage(BaseClass.getDriver());
		ZWHP.HoveringUsedCars();
		BaseClass.getLogger().info("----Successfully hovered on the Used Cars----");
	}
	
	@Test(priority = 9,groups= {"regression"})
	public void ClickingOnChennai() throws Exception {
		ZigWheelsHomePage ZWHP = new ZigWheelsHomePage(BaseClass.getDriver());
		ZWHP.ClickingUsedCarsInChennai();
		BaseClass.getLogger().info("----Successfully clicked on the Used Cars in chennai----");
	}
	
	@Test(priority = 10,groups= {"regression"})
	public void Scroll() {
		UsedCarPage UCP = new UsedCarPage(BaseClass.getDriver());
		UCP.ScrollingToPopularSection();
		BaseClass.getLogger().info("----Successfully Scrolled to bottom of the page----");
	}
	
	@Test(priority = 11,groups= {"regression"})
	public void usedCars() throws Exception {
		UsedCarPage UCP = new UsedCarPage(BaseClass.getDriver());
		UCP.UsedCarBrand();
		BaseClass.getLogger().info("----Successfully displayed the popular car brand name----");
	}
}