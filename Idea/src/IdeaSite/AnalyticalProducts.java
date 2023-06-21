package IdeaSite;

import java.time.Duration;
import java.util.Set;

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

public class AnalyticalProducts {

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
			driver.get("https://idea.advise.devtechlab.com/");
			wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
			Thread.sleep(2000);
			WebElement countrydash = driver.findElement(By.cssSelector("#outer-container > div:nth-child(1) > div > div.bm-menu-wrap.eads-menu > div.bm-menu > nav > ul > li > ul > li:nth-child(1) > ul > li:nth-child(3) > a"));
			Actions act = new Actions(driver);
			act.moveToElement(countrydash).
			click().build().perform();
			Thread.sleep(2000);  
			driver.findElement(By.xpath("//*[@id=\"outer-container\"]/div[1]/div/div[1]")).click();
		}
@Test
public void test01() throws InterruptedException{
//Select Angola country and open the country page
		WebElement Fiji = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@alt='Flag of Fiji']")));
		Fiji.click();
		Thread.sleep(2000);
		Actions scroll = new Actions(driver);
		scroll.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		Actions scroll1 = new Actions(driver);
		scroll1.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		Actions scroll2 = new Actions(driver);
		scroll2.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		Actions scroll3 = new Actions(driver);
		scroll3.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		String a = driver.getWindowHandle();
		 Set<String> b = driver.getWindowHandles();
			 for (String c: b){
// switching to main window	
		driver.switchTo().window(a);
		String s= driver.getTitle();
//Snapshot option
		driver.findElement(By.xpath("//*[@data-testid='tab-label-1']")).click();
		Thread.sleep(2000);
//Newsletter Sign up link
		//driver.findElement(By.xpath("//*[text()='here']")).click();
		//Thread.sleep(2000);
//Expand 2018 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-1']")).click();
		Thread.sleep(2000);
//Expand 2017 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-2']")).click();
		Thread.sleep(2000);
//Expand 2016 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-3']")).click();
		Thread.sleep(2000);
//Expand 2015 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-4']")).click();
		Thread.sleep(2000);
//Expand 2014 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-5']")).click();
		Thread.sleep(2000);
//Expand 2013 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-6']")).click();
		Thread.sleep(2000);
//Expand 2012 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-7']")).click();
		Thread.sleep(2000);
//Expand 2011 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-8']")).click();
		Thread.sleep(2000);
//Expand 2010 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-9']")).click();
		Thread.sleep(2000);
//Expand 2009 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-10']")).click();
		Thread.sleep(2000);
//Analytical Briefs option
		driver.findElement(By.xpath("//*[@data-testid='tab-label-2']")).click();
		Thread.sleep(2000);
//Newsletter Sign up link
		//driver.findElement(By.xpath("//*[text()='here']")).click();
		//Thread.sleep(2000);
//Expand 2018 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-1']")).click();
		Thread.sleep(2000);
//Expand 2017 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-2']")).click();
		Thread.sleep(2000);
//Expand 2016 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-3']")).click();
		Thread.sleep(2000);
//Expand 2015 Reports
		driver.findElement(By.xpath("//*[@id='accordion__heading-4']")).click();
		Thread.sleep(2000);
//Regional Context Indicators
		driver.findElement(By.xpath("//*[@data-testid='tab-label-3']")).click();
		Thread.sleep(2000);
//Interpretation Guide PDF
        driver.findElement(By.xpath("//*[text()='Interpretation Guide PDF']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(a);
//Select Togo country and open the country page
		WebElement Togo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@alt='Flag of Togo']")));
		Togo.click();
		Thread.sleep(2000);
		driver.switchTo().window(a);
//Health System Benchmarking
		driver.findElement(By.xpath("//*[@data-testid='tab-label-4']")).click();
		Thread.sleep(2000);
//Open Idea Query page
		driver.findElement(By.xpath("//*[text()='https://idea.advise.devtechlab.com/query']")).click();
		Thread.sleep(8000);
		driver.navigate().back();
//Download the Tool
		driver.findElement(By.xpath("//*[text()='Download the Tool']")).click();
		Thread.sleep(2000);		
//Download the User Manual
		driver.findElement(By.xpath("//*[text()='Download the User Manual']")).click();
		Thread.sleep(2000);
			 }		
}
@AfterMethod
public void aftermethod() {
	    driver.quit();
	    System.out.println("Finished Analytical Prodducts page testing");
}
	}

