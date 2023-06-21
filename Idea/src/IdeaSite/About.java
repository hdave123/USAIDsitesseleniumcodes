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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class About {
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
	WebElement countrydash = driver.findElement(By.cssSelector("#outer-container > div:nth-child(1) > div > div.bm-menu-wrap.eads-menu > div.bm-menu > nav > ul > li > ul > li:nth-child(1) > ul > li:nth-child(9) > a"));
	Actions act = new Actions(driver);
	act.moveToElement(countrydash).
	click().build().perform();
	Thread.sleep(2000);  
	driver.findElement(By.xpath("//*[@id=\"outer-container\"]/div[1]/div/div[1]")).click();
	}
@Test 
//Collecting Taxes Database
public void test01() throws InterruptedException{
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
	String a = driver.getWindowHandle();
	Set<String> b = driver.getWindowHandles();
	for (String c: b);
//Open FAQ page
	driver.findElement(By.xpath("//*[@data-testid='tab-label-1']")).click();
	Thread.sleep(3000);
//Open link 1
	driver.findElement(By.xpath("//*[@id='accordion__heading-1']")).click();
	Thread.sleep(2000);
//Open link 2
	driver.findElement(By.xpath("//*[@id='accordion__heading-2']")).click();
	Thread.sleep(2000);
//Open link 3
	driver.findElement(By.xpath("//*[@id='accordion__heading-3']")).click();
	Thread.sleep(2000);
//Open link 4
	driver.findElement(By.xpath("//*[@id='accordion__heading-4']")).click();
	Thread.sleep(2000);
//Open link 5
	driver.findElement(By.xpath("//*[@id='accordion__heading-5']")).click();
	Thread.sleep(2000);
//Open Contact Us page
	WebElement contact = driver.findElement(By.xpath("//*[@data-testid='tab-label-2']"));
	contact.click();
	Thread.sleep(3000);
//Open About the Site
	driver.findElement(By.xpath("//*[text()='About the Website']")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(2000);
//Open Analytical Products page
	driver.get("https://idea.advise.devtechlab.com/analytical-products");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(2000);
//Open Source List page
	driver.findElement(By.xpath("//*[text()='Source List']")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(2000);
//Open Sources Option
	driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
	Thread.sleep(2000);
	WebElement Sources = driver.findElement(By.cssSelector("#outer-container > div:nth-child(1) > div > div.bm-menu-wrap.eads-menu > div.bm-menu > nav > ul > li > ul > li:nth-child(1) > ul > li:nth-child(10) > a"));
	Actions act = new Actions(driver);
	act.moveToElement(Sources).
	click().build().perform();
	Thread.sleep(2000);  
	driver.findElement(By.xpath("//*[@id=\"outer-container\"]/div[1]/div/div[1]")).click();
    Thread.sleep(2000);
//Open Query Option
	driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
	Thread.sleep(2000);
	WebElement Query = driver.findElement(By.cssSelector("#outer-container > div:nth-child(1) > div > div.bm-menu-wrap.eads-menu > div.bm-menu > nav > ul > li > ul > li:nth-child(1) > ul > li:nth-child(11) > a"));
	Actions act1 = new Actions(driver);
	act1.moveToElement(Query).
	click().build().perform();
	Thread.sleep(2000);  
	driver.findElement(By.xpath("//*[@id=\"outer-container\"]/div[1]/div/div[1]")).click();
	Thread.sleep(2000);
	
}
@AfterMethod
public void aftermethod() {
	driver.quit();
	System.out.println("Finished About page testing");
}
}
