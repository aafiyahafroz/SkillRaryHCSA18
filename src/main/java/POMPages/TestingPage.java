package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	//declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(xpath="//img[@id='java']")
	private WebElement javaImage;
	@FindBy(xpath="//div[@id='cartArea']")
	private WebElement myCartArea;
	@FindBy(xpath="//footer/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	//Initialization
	public TestingPage(WebDriver d)
	{
		PageFactory.initElements(d,this);
		
	}
	
	//Utilization
	public WebElement getPageHeader()
	{
		return pageHeader;
	}
	
	public WebElement getJavaImage()
	{
		return javaImage;
		
	}

	public WebElement getMyCartArea()
	{
		return myCartArea;
		
	}
	
	public WebElement getFacebookIcon()
	{
		return facebookIcon;
	}
	public void clickFacebookIcon()
	{
		facebookIcon.click();
		
	}
	
	
}
