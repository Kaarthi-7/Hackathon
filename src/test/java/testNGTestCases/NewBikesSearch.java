package testNGTestCases;

import org.testng.annotations.Test;

import pageObjects.UpcomingBikesPage;
import pageObjects.ZigWheelsHomePage;
import factory.BaseClass;

public class NewBikesSearch extends Setup {

	@Test(priority = 1, groups = { "regression", "smoke" })
	public void HoveringAtUpcomingBikes() throws Exception {
		ZigWheelsHomePage ZWHP = new ZigWheelsHomePage(BaseClass.getDriver());
		ZWHP.HoveringNewBikes();
		BaseClass.getLogger().info("----Successfully Hovered on the upcoming Bikes----");

	}

	@Test(priority = 2, groups = { "regression", "smoke" })
	public void NavigateToUpcomingBikes() {
		ZigWheelsHomePage ZWHP = new ZigWheelsHomePage(BaseClass.getDriver());
		ZWHP.ClickingUpcomingBikes();
		BaseClass.getLogger().info("----Successfully clicked on the upcoming Bikes----");
	}

	@Test(priority = 3,groups= {"regression","smoke"})
	public void SelectingHonda() throws Exception  {
		UpcomingBikesPage UBP = new UpcomingBikesPage(BaseClass.getDriver());
		
		UBP.SelectBrand();
		BaseClass.getLogger().info("----Successfully Selected Brand as \"HONDA\"----");
	}

	@Test(priority = 4, groups = { "regression", "smoke" })
	public void Scrolling() throws Exception {
		UpcomingBikesPage UBP = new UpcomingBikesPage(BaseClass.getDriver());
		UBP.load();
		BaseClass.getLogger().info("----Successfully Scrolled to bottom of the page----");
	}

	@Test(priority = 5, groups = { "regression", "smoke" })
	public void ClickingLoadMore() throws Exception {
		UpcomingBikesPage UBP = new UpcomingBikesPage(BaseClass.getDriver());
		UBP.clickLoadMore();
		BaseClass.getLogger().info("----Successfully Clicked read more----");
	}

	@Test(priority = 6, groups = { "regression", "smoke" })
	public void UpcommingBikes() throws Exception {
		UpcomingBikesPage UBP = new UpcomingBikesPage(BaseClass.getDriver());
		UBP.UpcomingBike();
		BaseClass.getLogger().info("----Successfully printed the details of the upcoming bikes----");
	}

}