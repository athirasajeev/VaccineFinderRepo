package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class VaccineFinderPage extends BaseClass {
	WebDriver driver;
	@FindBy(xpath="//select[@name='selectState']")
	WebElement firstDd;
	
	@FindBy(xpath="//select[@name='selectedDistrict']")
	WebElement secondDd;
	
	@FindBy(xpath="//button[@title='Reset Current Search']")
	WebElement close;
	
	@FindBy(xpath="//button[@title='Refresh']")
	WebElement refresh;
	
	@FindBy(xpath="//button[@title='Notification']")
	WebElement notification;
	
	@FindBy(xpath="//a[@href='/total-cases']")
	WebElement covidCases;
	
	@FindBy(xpath="//a[@class='cursor-pointer nav-link']")
	WebElement certificate;
	
	@FindBy(xpath="//span[contains(.,'About')]")
	WebElement about;
	@FindBy(xpath="//h5[@class='card-title']")
	WebElement message;
	@FindBy(xpath="//select[@name='selectedState']")
	WebElement state;
	@FindBy(xpath="//select[@name='selectedDistrict']")
	WebElement district;
	@FindBy(css="div[class='col-md-9'] div:nth-child(2) h4:nth-child(1)")
	WebElement disekm;
	@FindBy(css="//button[.='Cancel']")
	WebElement cancel;
	@FindBy(css="//a[normalize-space()='Vaccine Finder']")
	WebElement title;
	@FindBy(css="//strong[normalize-space()='whatsapp link']")
	WebElement wtsapp;
	@FindBy(css="//h2[contains(text(),'This link is incorrect. Close this window and try ')]")
	WebElement incorrectMSG;



	public VaccineFinderPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement ToClickFirstDd()
	{
		return firstDd;
	}
	public WebElement ToClicksecondDd()
	{
		return secondDd;
	}
	public WebElement ToClickclose()
	{
		return close;
	}
	public WebElement ToClickrefresh()
	{
		return refresh;
	}
	public WebElement ToClickNotification()
	{
		return notification;
	}
	public WebElement ToClickcovidCases()
	{
		return covidCases;
	}
	public WebElement ToClickDownload()
	{
		return certificate;
	}
	public WebElement message()
	{
		return message;
	}
	public WebElement ToClickState()
	{
		return state;
	}
	public WebElement ToClickDistrict()
	{
		return district;
	}
	public WebElement ToCheckdisekm()
	{
		return disekm;
	}
	public WebElement tocancel()
	{
		return cancel;
	}
	public WebElement tocheckTitle()
	{
		return title;
	}
	public WebElement tochecklink()
	{		return wtsapp;
	}
	public WebElement tocheckIncorrectmsg()
	{		return incorrectMSG;
	}


}
