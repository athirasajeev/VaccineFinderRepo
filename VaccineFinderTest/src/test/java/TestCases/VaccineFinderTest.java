package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;


public class VaccineFinderTest extends BaseClass{
	@Test
	public void findCovidCases()
	{
		vp.ToClickcovidCases().click();
		Select selectstate=new Select(vp.ToClickState());
		selectstate.selectByValue("Kerala");
		Select selectdistrict=new Select(vp.ToClickDistrict());
		selectdistrict.selectByValue("Ernakulam");
		String Expected="District - Ernakulam";
		String actual=vp.ToCheckdisekm().getText();
		Assert.assertEquals(actual, Expected);
		
	
	}
	/*@Test
	public void downloadCertificate()
	{
		vp.ToClickDownload().click();
		vp.tocancel().click();
		String Expected=" Vaccine Finder";
		String actual=vp.tocheckTitle().getText();
		Assert.assertEquals(actual, Expected);
	}
	@Test
	public void checkDownloadLink()
	{
		vp.ToClickDownload().click();
		vp.tocancel().click();
		String Expected="This link is incorrect. Close this window and try a different link.";
		String actual=vp.tocheckIncorrectmsg().getText();
		Assert.assertEquals(actual, Expected);
	}
	@Test
	public void toCloseFilter()
	{
		vp.ToClickclose().click();
		
	}
	@Test
	public void toRefreshFiltering()
	{
		vp.ToClickrefresh().click();
	}
	@Test
	public void toViewNotification()
	{
		vp.ToClickNotification().click();
	}
	
	*/

}
