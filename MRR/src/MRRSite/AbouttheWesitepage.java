package MRRSite;

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

public class AbouttheWesitepage {
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
//Hamburger Menu
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"usaid-head\"]/div/button"));
		menu.click();
		Thread.sleep(2000);
//About option
		WebElement about = driver.findElement(By.xpath("//*[@id=\"about-menu-label\"]"));
		about.click();
		Thread.sleep(2000);
//About The Site page
		WebElement aboutthesite = driver.findElement(By.xpath("//*[@id=\"about-menu\"]/ul/li[1]/a/span"));
		aboutthesite.click();
		Thread.sleep(5000);
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
		 for (String c: b){
	  	 }
//Open Partner License link
		WebElement link1 = driver.findElement(By.xpath("//*[text()='Partner License']"));
		link1.click();
		Thread.sleep(2000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open Government Work License	
		WebElement link2 = driver.findElement(By.xpath("//*[text()='Government Work License']"));
		link2.click();
		Thread.sleep(2000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open USAID Data Services link
		WebElement link3 = driver.findElement(By.xpath("//*[@id=\"about\"]/p[8]/a[1]"));
		link3.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
//Open Trade Capacity Building link
		WebElement link4 = driver.findElement(By.xpath("//*[text()='Trade Capacity Building']"));
		link4.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
//Open Foreign Aid Explorer link
		WebElement link5 = driver.findElement(By.xpath("//*[text()='Foreign Aid Explorer']"));
		link5.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
//Open International Data & Economic Analysis link
		WebElement link6 = driver.findElement(By.xpath("//*[text()='International Data & Economic Analysis']"));
		link6.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
}

@ AfterMethod
public void aftermethod(){
	driver.quit();
	System.out.println("Finished About the Website Page testing");
	
}
}

