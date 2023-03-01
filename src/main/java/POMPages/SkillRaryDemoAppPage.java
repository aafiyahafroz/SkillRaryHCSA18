package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.WebDriverUtility;

public class SkillRaryDemoAppPage {

	//declaration
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement pageHeader;
	@FindBy(id="course")
	private WebElement courseTab;
	@FindBy(xpath="//span[@class='wrappers']/a[text()='Selenium Training']")
	private WebElement SeleniumTrainingLink;
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement categoryDropdown;
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUsLink;
	
	//initialization
	public  SkillRaryDemoAppPage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	//utilization

	
	public void mouseHoverToCourse(WebDriverUtility web)
	{
		web.mouseHover(courseTab);
	}
	
	public void clickSeleniumtraining()
	{
		SeleniumTrainingLink.click();
		
	}
	
	public void selectCategory(WebDriverUtility web,int index)
	{
		web.dropdown(categoryDropdown,index);
	}
	
	public WebElement getContactus()
	{
		return contactUsLink;
		
	}
	public void clickContactUs()
	{
		contactUsLink.click();
	}
	
	public String getPageHeader()
	{
		return pageHeader.getText();
	}
}
