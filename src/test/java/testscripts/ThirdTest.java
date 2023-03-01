package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;
@Test

public class ThirdTest extends BaseClass {
	
	public void ThirdTest()
	{
	
	SoftAssert soft=new SoftAssert();
	
	home.searchFor("core java for selenium");
	soft.assertEquals(corejava.getPageHeader(),"CORE JAVA FOR SELENIUM");
	
	corejava.clickCoreJavaForSeleniumLink();
	soft.assertEquals(javaVideo.getPageHeader(),"Core java For Selenium Training");
	
	corejava.clickCloseCookies();
	web.switchToFrame();
	corejava.clickPlayButton();
	Thread.sleep(2000);
	corejava.clickPauseButton();
	
	web.switchBackFromFrame();
	
	corejava.clickAddToWishlist();
	
	soft.assertAll();
	}
	
}
