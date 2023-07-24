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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CountryDashboard {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeMethod
	public void setup() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hdave\\Downloads\\chromedriver_win321\\chromedriver.exe");
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
		WebElement countrydash = driver.findElement(By.cssSelector("#outer-container > div:nth-child(1) > div > div.bm-menu-wrap.eads-menu > div.bm-menu > nav > ul > li > ul > li:nth-child(1) > ul > li:nth-child(2) > a"));
		Actions act = new Actions(driver);
		act.moveToElement(countrydash).
		click().build().perform();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//*[@id=\"outer-container\"]/div[1]/div/div[1]")).click();
	}
	@Test
	public void test01() throws InterruptedException{
//Select Angola country and open the country page
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div/div/div/div[2]/div")));
		dropdown.click();
		Thread.sleep(2000);
		WebElement Angola = dropdown.findElement(By.xpath("//*[text()='Angola']"));
		Angola.click();
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
		Actions scroll6 = new Actions(driver);
		scroll6.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		Actions scroll7 = new Actions(driver);
		scroll7.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		Actions scroll8 = new Actions(driver);
		scroll8.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
//Open Info for Country profile vs
		WebElement country = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div[1]/div[1]/span"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(country).
		click().build().perform();
		Thread.sleep(5000);
		
//Open Lower Middle Income info
		WebElement Income = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[1]/div[3]/div[1]/button/div"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(Income).
		click().build().perform();
		Thread.sleep(2000);
		WebElement activityreportModalClose = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("button[class='modal-close']"))));
		activityreportModalClose.click();
		Thread.sleep(2000);
// Open Population info
		WebElement Population = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[1]/div[3]/div[3]/button/div"));
		Actions act3 = new Actions(driver);
		act3.moveToElement(Population).
		click().build().perform();
		Thread.sleep(5000);
		WebElement activityreportModalClose1 = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("button[class='modal-close']"))));
		activityreportModalClose1.click();
		Thread.sleep(2000);
//Open Development Assistance
		WebElement development = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[1]/div[3]/div[4]/button/div"));
		Actions act4 = new Actions(driver);
		act4.moveToElement(development).
		click().build().perform();
		Thread.sleep(5000);
		WebElement activityreportModalClose3 = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("button[class='modal-close']"))));
		activityreportModalClose3.click();
		Thread.sleep(2000);
//Open Language info
		WebElement language = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[1]/div[3]/div[5]/button/div"));
		Actions act5 = new Actions(driver);
		act5.moveToElement(language).
		click().build().perform();
		Thread.sleep(5000);
		WebElement activityreportModalClose4 = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("button[class='modal-close']"))));
		activityreportModalClose4.click();
		Thread.sleep(2000);
//Open Land Size Comparison info
		WebElement land = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[1]/div[3]/div[6]/button/div"));
		Actions act6 = new Actions(driver);
		act6.moveToElement(land).
		click().build().perform();
		Thread.sleep(5000);
		WebElement activityreportModalClose5 = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("button[class='modal-close']"))));
		activityreportModalClose5.click();
		Thread.sleep(2000);
//Download Data
		driver.findElement(By.xpath("//*[text()='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Data (CSV)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Metadata (CSV)']")).click();
		Thread.sleep(2000);
		
//View Printable Page
		driver.findElement(By.xpath("//*[@class='print-formatted__button']")).click();
		Thread.sleep(2000);
		 Actions scroll9 = new Actions(driver);
		 scroll9.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(2000);
		 Actions scroll10 = new Actions(driver);
		 scroll10.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(2000);
		 Actions scroll11 = new Actions(driver);
		 scroll11.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(2000);
		 Actions scroll12 = new Actions(driver);
		 scroll12.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(2000);
		 Actions scroll13 = new Actions(driver);
		 scroll13.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(2000);
		 Actions scroll14 = new Actions(driver);
		 scroll14.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(2000);
		 Actions scroll15 = new Actions(driver);
		 scroll15.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(2000);
		 Actions scroll16 = new Actions(driver);
		 scroll16.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(2000);
		 Actions scroll17 = new Actions(driver);
		 scroll17.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(2000);
		 Actions scroll18 = new Actions(driver);
		 scroll18.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(2000);
		 Actions scroll19 = new Actions(driver);
		 scroll19.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(2000);
		 Thread.sleep(10000);
	}
@AfterMethod
public void aftermethod(){
	  	driver.quit();
	  	System.out.println("Finished Country Dashboard Page testing");
}
}
