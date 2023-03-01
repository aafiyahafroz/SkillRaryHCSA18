package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//declaration
	@FindBy(xpath="//img[@alt='SkillRary']")
	private WebElement logo;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsTab;
	
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement skillraryDemoAppLink;
		
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath="//input[@placeholder='Search for Coursees']")
	private WebElement searchTF;
	
	//@FindBy(xpath="//input[@value='go']")
	//private WebElement searchButton;
	
	//Initialization
	public HomePage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	//Utilization
	public WebElement getLogo()
	{
		return logo;
	}
	
	public void clickGears()
	{
		gearsTab.click();
	}
	
	public void clickSkillRaryDemoApp()
	{
		skillraryDemoAppLink.click();
	}
	
	public void searchButton()
	{
		searchButton.click();
	}
	
	public void searchFor(String data)
	{
		searchTF.sendKeys(data);
		searchButton.click();
	}

}
