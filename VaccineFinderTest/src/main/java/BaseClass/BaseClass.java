package BaseClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.server.RemoteServer;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import Actions.Action;
import PageObjects.VaccineFinderPage;
//import io.github.bonigarcia.wdm.WebDriverManager;



     public class BaseClass {
	public static Properties prop;
	public static VaccineFinderPage vp;
	public static Action act=new Action();
	FirefoxDriver driver = new FirefoxDriver();
	
	
	//public static ThreadLocal<RemoteServer> driver=new ThreadLocal<RemoteServer>();
	@BeforeSuite
	public void loadConfig() {
		

		try {
			 prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configurations\\Config.Properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@BeforeMethod
	public void firstCall() throws IOException {
		launchApp();
		

		
	}

	/*
	 * public static WebDriver getDriver() { return (WebDriver) driver.get(); }
	 */
	public void launchApp() {
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(prop.getProperty("url"));
	    act.implicitWait(driver, 10);
		act.pageLoadTimeOut(driver, 30); 
		vp=new VaccineFinderPage(driver);

		 
	}
	@AfterMethod
	public void endbrowser()
	{
		driver.close();
	}
	
	
	

	
	}
