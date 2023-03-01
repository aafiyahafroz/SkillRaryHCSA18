package GenericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/** this class contains all reusable methods of WebDriver
 * 
 * @author Aafiyah
 *
 */
public class WebDriverUtility {

	private WebDriver d;
	
	
	/**
	 * method used for navigating to an application to user desired browser
	 * @param browser
	 * @param url
	 * @param time
	 * @return
	 */
	public WebDriver openApplication(String browser,String url,long time)
	{
		switch(browser)
		{
		case "chrome":d=new ChromeDriver();break;
		case "firefox":d=new FirefoxDriver();break;
		case "Edge":d=new EdgeDriver();break;
		default:System.out.println("Invalid browser data");
		}
		d.manage().window().maximize();
		d.get(url);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		return d;	
	}
	
	/** method used to wait until the visibility of particular element
	 * 
	 * @param element
	 * @param time
	 * @return
	 */
	public WebElement explicitWait(WebElement element, long time)
	{
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(time));
		return wait.until(ExpectedConditions.visibilityOf(element));	
	}
	
	/**
	 * method used to perform mouse hovering
	 * @param element
	 */
	public void mouseHover(WebElement element)
	{
		Actions a=new Actions(d);
		a.moveToElement(element).perform();
	}
	
	
	/**
	 * method used to double click
	 * @param element
	 */
	public void doubleClickOnElement(WebElement element)
	{
		Actions a=new Actions(d);
		a.doubleClick(element).perform();
	}

	/**
	 * method used to drag and drop
	 * @param source
	 * @param target
	 */
	public void dragAndDropElement(WebElement source,WebElement target)
	{
		Actions a = new Actions(d);
		a.dragAndDrop(source,target).perform();
	}
	
	/**
	 * method used to select element from drop down based on visible text
	 * @param value
	 * @param element
	 */
	public void dropdown(String value,WebElement element)
	{
		Select s= new Select(element);
		s.selectByValue(value);
	}
	
	
	/**
	 * method used to scrolling till the element
	 * @param element
	 */
	public void scrollToElement(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	
	/**
	 * used to take screenshot of webpage
	 */
	public void takeScreenshot()
	{
		TakesScreenshot ts=(TakesScreenshot)d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/screenshot.png");
		try
		{
			FileUtils.copyFile(src, dest);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		}
	
	/**
	 * used to handle alert popups
	 */
	public void handleAlert()
	{
		d.switchTo().alert().accept();
	}
	
	/**
	 * used to switch to child browser
	 */
	public void switchToChildBrowser()
	{
		Set<String> set=d.getWindowHandles();
		for(String windowID:set)
		{
			d.switchTo().window(windowID);
			
		}
	}
	
	/**used to switch to frame
	 * 
	 */
	public void switchToFrame()
	{
		d.switchTo().frame(0);
		
	}
	
	/**
	 * used to switch back from the frame
	 */
	public void switchBackFromFrame()
	{
		d.switchTo().defaultContent();
	}
	
	/**
	 * used to close the current tab
	 */
	public void closeCurrentWindow()
	{
		d.close();
		
	}
	
	/**
	 * used to close all the tabs
	 */
	public void quitBrowser()
	{
		d.quit();
		
	}

	public void dropdown(WebElement categoryDropdown, int index) {
		// TODO Auto-generated method stub
		
	}
}
