package MRRSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReportsLandingPage {
	
		
		WebDriver driver;
		WebDriverWait wait;
		@BeforeMethod
public void setup() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hdave\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities Cp = new DesiredCapabilities();
		Cp.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://mrr.advise.devtechlab.com/reports.html");
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Thread.sleep(5000);
		Actions scroll = new Actions(driver);
		scroll.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		Actions scroll1 = new Actions(driver);
		scroll1.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
}
@Test
//Open Current reports
public void test1() throws InterruptedException {
	WebElement currentreports = driver.findElement(By.xpath("//*[text()='2021 MSME Results Report']"));
	Actions creports = new Actions(driver);
	creports.moveToElement(currentreports).
	click().build().perform();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
//Expand Previous Reports	
	WebElement reports = driver.findElement(By.xpath("//*[text()='Previous Reports']"));
	reports.click();
	Thread.sleep(2000);
//2020 MSME Results Report
	WebElement reports2020 = driver.findElement(By.xpath("//*[text()='2020 MSME Results Report']"));
	reports2020.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2019 MSME Results Report
	WebElement reports2019 = driver.findElement(By.xpath("//*[text()='2019 MSME Results Report']"));
	reports2019.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2018 Microenterprise Results Report
	WebElement reports2018 = driver.findElement(By.xpath("//*[text()='2018 Microenterprise Results Report']"));
	reports2018.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2017 Microenterprise Results Report
	WebElement reports2017 = driver.findElement(By.xpath("//*[text()='2017 Microenterprise Results Report']"));
	reports2017.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2016 Microenterprise Results Report
	WebElement reports2016 = driver.findElement(By.xpath("//*[text()='2016 Microenterprise Results Report']"));
	reports2016.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2015 Microenterprise Results Report
	WebElement reports2015 = driver.findElement(By.xpath("//*[text()='2015 Microenterprise Results Report']"));
	reports2015.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2014 Microenterprise Results Report
	WebElement reports2014 = driver.findElement(By.xpath("//*[text()='2014 Microenterprise Results Report']"));
	reports2014.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2013 Microenterprise Results Report
	WebElement reports2013 = driver.findElement(By.xpath("//*[text()='2013 Microenterprise Results Report']"));
	reports2013.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2012 Microenterprise Results Report
	WebElement reports2012 = driver.findElement(By.xpath("//*[text()='2012 Microenterprise Results Report']"));
	reports2012.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2011 Microenterprise Results Report
	WebElement reports2011 = driver.findElement(By.xpath("//*[text()='2011 Microenterprise Results Report']"));
	reports2011.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2010 Microenterprise Results Report
	WebElement reports2010 = driver.findElement(By.xpath("//*[text()='2010 Microenterprise Results Report']"));
	reports2010.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2009 Microenterprise Results Report
	WebElement reports2009 = driver.findElement(By.xpath("//*[text()='2009 Microenterprise Results Report']"));
	reports2009.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2008 Microenterprise Results Report
	WebElement reports2008 = driver.findElement(By.xpath("//*[text()='2008 Microenterprise Results Report']"));
	reports2008.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2007 Microenterprise Results Report
	WebElement reports2007 = driver.findElement(By.xpath("//*[text()='2007 Microenterprise Results Report']"));
	reports2007.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2006 Microenterprise Results Report
	WebElement reports2006 = driver.findElement(By.xpath("//*[text()='2006 Microenterprise Results Report']"));
	reports2006.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2005 Microenterprise Results Report
	WebElement reports2005 = driver.findElement(By.xpath("//*[text()='2005 Microenterprise Results Report']"));
	reports2005.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2004 Microenterprise Results Report
	WebElement reports2004 = driver.findElement(By.xpath("//*[text()='2004 Microenterprise Results Report']"));
	reports2004.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2003 Microenterprise Results Report
	WebElement reports2003 = driver.findElement(By.xpath("//*[text()='2003 Microenterprise Results Report']"));
	reports2003.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2002 Microenterprise Results Report
	WebElement reports2002 = driver.findElement(By.xpath("//*[text()='2002 Microenterprise Results Report']"));
	reports2002.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2001 Microenterprise Results Report
	WebElement reports2001 = driver.findElement(By.xpath("//*[text()='2001 Microenterprise Results Report']"));
	reports2001.click();
	Thread.sleep(2000);
	driver.navigate().back();
//2000 Microenterprise Results Report
	WebElement reports2000 = driver.findElement(By.xpath("//*[text()='2000 Microenterprise Results Report']"));
	reports2000.click();
	Thread.sleep(2000);
	driver.navigate().back();
//1999 Microenterprise Results Report
	WebElement reports1999 = driver.findElement(By.xpath("//*[text()='1999 Microenterprise Results Report']"));
	reports1999.click();
	Thread.sleep(2000);
	driver.navigate().back();
//1998 Microenterprise Results Report
	WebElement reports1998 = driver.findElement(By.xpath("//*[text()='1998 Microenterprise Results Report']"));
	reports1998.click();
	Thread.sleep(2000);
	driver.navigate().back();
//1997 Microenterprise Results Report
	WebElement reports1997 = driver.findElement(By.xpath("//*[text()='1997 Microenterprise Results Report']"));
	reports1997.click();
	Thread.sleep(2000);
	driver.navigate().back();
}
@AfterMethod
public void aftermethod(){
	driver.quit();
	System.out.println("Finished Reports Landing Page testing");
}
}

	
