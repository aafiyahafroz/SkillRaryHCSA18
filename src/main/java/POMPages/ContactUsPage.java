package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	//Declaration
	@FindBy(xpath="//img[contains(@src,'contactUs')]")
	private WebElement pageHeader;
	@FindBy(name="name")
	private WebElement fullNameTF;
	@FindBy(name="sender")
	private WebElement emailTF;
    @FindBy(name="subject")
    private WebElement subjectTF;
    @FindBy(name="message")
	private WebElement messageArea;
    @FindBy(xpath="//button[text()='Send us mail']")
	private WebElement sendUsMailButton;
    
    //Initialization
    public ContactUsPage(WebDriver d)
    {
    PageFactory.initElements(d,this);
    }
    
    //Utilization
    public WebElement getPageHeader()
    {
    	return pageHeader;
    
    }


    



}