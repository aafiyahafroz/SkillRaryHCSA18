package testscripts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

	public class FourthTest extends BaseClass
	{
		@Test
		public void FourthTest()
		{
			SoftAssert soft=new SoftAssert();
			
			home.clickGears();
			home.clickSkillRaryDemoApp();
			web.switchToChildBrowser();
			
			soft.assertEquals(demoApp.getPageHeader(),"SkillRary-ECommerece");
			
			web.scrollToElement(demoApp.getContactus());
			demoApp.clickContactUs();
			
			soft.assertEquals(contact.getPageHeader(),"CONTACT US");
			List<String> dataList= excel.readDataFromExcel("Sheet1");
			contact.sendContactDetails(dataList.get(0),dataList.get(1),dataList.get(2),dataList.get(3));
			
			soft.assertAll();
			
		}
	}

