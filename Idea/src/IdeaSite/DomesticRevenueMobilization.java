package IdeaSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DomesticRevenueMobilization {
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
	WebElement countrydash = driver.findElement(By.cssSelector("#outer-container > div:nth-child(1) > div > div.bm-menu-wrap.eads-menu > div.bm-menu > nav > ul > li > ul > li:nth-child(1) > ul > li:nth-child(7) > a"));
	Actions act = new Actions(driver);
	act.moveToElement(countrydash).
	click().build().perform();
	Thread.sleep(2000);  
	driver.findElement(By.xpath("//*[@id=\"outer-container\"]/div[1]/div/div[1]")).click();
	}
@Test 
//Collecting Taxes Database
public void test01() throws InterruptedException{
//Download Full Database
	driver.findElement(By.xpath("//*[text()='Full Database']")).click();
	Thread.sleep(2000);
//Open Idea's Query page
	driver.findElement(By.xpath("//*[@id=\"react-tabs-1\"]/div/p[3]/a")).click();
	Thread.sleep(2000);
	driver.navigate().back();
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
	Actions scroll4 = new Actions(driver);
	scroll4.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	Actions scroll5 = new Actions(driver);
	scroll5.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
	Thread.sleep(2000);
//Open Hamburger menu
	WebElement countrydash = driver.findElement(By.cssSelector("#outer-container > div:nth-child(1) > div > div.bm-menu-wrap.eads-menu > div.bm-menu > nav > ul > li > ul > li:nth-child(1) > ul > li:nth-child(8) > a"));
	Actions act = new Actions(driver);
	act.moveToElement(countrydash).
	click().build().perform();
	Thread.sleep(2000);  
//Open Gender Dashboard page
	driver.findElement(By.xpath("//*[@id=\"outer-container\"]/div[1]/div/div[1]")).click();
	Thread.sleep(2000);
	

}
@AfterMethod
public void aftermethod() {
	driver.quit();
	System.out.println("Finished Domestic Revenue Mobilization testing");
}
}
