package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {

	//declaration
	@FindBy(xpath="//h2[@class='list_title']")
	private WebElement pageHeader;
	@FindBy(xpath="//a[text()='Core Java for Selenium Training']")
	private WebElement coreJavaForSeleniumLink;


//Initialization
public CoreJavaForSeleniumPage(WebDriver d)
{
	PageFactory.initElements(d, this);
}
//Utilization
public String getPageHeader()
{
	return pageHeader.getText();
}
public void clickCoreJavaForSeleniumLink()
{
	coreJavaForSeleniumLink.click();
}
}
