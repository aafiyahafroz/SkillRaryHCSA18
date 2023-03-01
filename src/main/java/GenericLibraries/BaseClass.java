package GenericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POMPages.ContactUsPage;
import POMPages.CoreJavaForSeleniumPage;
import POMPages.CoreJavaVideoPage;
import POMPages.HomePage;
import POMPages.SeleniumTraininigPage;
import POMPages.SkillRaryDemoAppPage;
import POMPages.TestingPage;

public class BaseClass {

	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver d;
	protected HomePage home;
	protected SkillRaryDemoAppPage demoApp;
	protected SeleniumTraininigPage selenium;
	protected TestingPage testing;
	protected CoreJavaForSeleniumPage corejava;
	protected CoreJavaVideoPage javaVideo;
	protected ContactUsPage contact;
	//@BeforeSuite
	//@BeforeTest
	
	@BeforeClass
	public void classConfiguration()
	{
		 property=new PropertiesUtility();
		excel=new ExcelUtility();
		web=new WebDriverUtility();
		
		property.propertiesInitialization(IConstantPath.PROPERTIES_FILE_PATH);
		excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
	}
	
	@BeforeMethod
public void methodConfiguration()
{
		long time= Long.parseLong(property.fetchProperty("timeouts"));
		 d=web.openApplication(property.fetchProperty("browser"), 
				 property.fetchProperty("url"), time);
		 
		 home= new HomePage(d);
		 Assert.assertTrue(home.getLogo().isDisplayed());
		 demoApp= new SkillRaryDemoAppPage(d);
		 selenium=new SeleniumTraininigPage(d);
		 testing=new TestingPage(d);
		 corejava=new CoreJavaForSeleniumPage(d);
		 javaVideo=new CoreJavaVideoPage(d);
		 contact = new ContactUsPage(d); 		
}
	
	@AfterMethod
	public void methodTeardown()
	{
		web.quitBrowser();
	}
	
	@AfterClass
	public void classTeardown()
	{
		excel.closeExcel();
	}
	
	//AfterTest
	//AfterSuite
	
}
