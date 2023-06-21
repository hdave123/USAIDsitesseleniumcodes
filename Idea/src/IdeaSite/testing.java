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
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class testing {
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
		 WebElement query = driver.findElement(By.cssSelector("#outer-container > div:nth-child(1) > div > div.bm-menu-wrap.eads-menu > div.bm-menu > nav > ul > li > ul > li:nth-child(1) > ul > li:nth-child(1) > a"));
		 Actions act = new Actions(driver);
		 act.moveToElement(query).
		 click().build().perform();
		 Thread.sleep(8000);  
	}
	@Test
public void test01() throws InterruptedException{
//Click What option
		driver.findElement(By.xpath("//*[text()='What?']")).click();
		Thread.sleep(2000);
//Open DRG Metrics Inventory Query option
		driver.findElement(By.xpath("//button[text()='DRG Metrics Inventory']")).click();
		Thread.sleep(2000);
//Select option from the list
		driver.findElement(By.xpath("//*[text()='Access to Computers with Internet: female']")).click();
		Thread.sleep(2000);
//Select option from the list
		driver.findElement(By.cssSelector("#app > div.sw-container > div.sr-viewport > div > div > div:nth-child(1) > div > div > div > div.react-xzibit-select > div > div.content > div > div > div:nth-child(7) > div > div.rxs-option-button-click > span")).click();
		Thread.sleep(2000);			
//Move to "Where" tab
		driver.findElement(By.xpath("//*[@class='sw-bead']")).click();
		Thread.sleep(2000);
//Select country from the list
		driver.findElement(By.xpath("//*[text()='World']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//*[text()='Algeria']")).click();
		Thread.sleep(2000);	
//Move to "When" tab
		driver.findElement(By.xpath("//button[text()='When?']")).click();
		Thread.sleep(2000);
//Select year from the dropdown
		WebElement Toyear = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div[3]/select"));
		Toyear.sendKeys("1998");
		Toyear.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//Select year from the dropdown
		WebElement Fromyear = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div[5]/select"));
		Fromyear.sendKeys("2012");
		Fromyear.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//Click By Country button
		driver.findElement(By.xpath("//*[text()='By Country']")).click();
		Thread.sleep(2000);
//Click By Series button
		driver.findElement(By.xpath("//*[text()='By Series']")).click();
		Thread.sleep(2000);
//Move to "When" tab
		driver.findElement(By.xpath("//button[text()='Results']")).click();
		Thread.sleep(2000);
//Click Download button
		driver.findElement(By.xpath("//*[text()='Download']")).click();
		Thread.sleep(2000);
//Click Download button
		driver.findElement(By.xpath("//*[@value='Data to CSV']")).click();
		Thread.sleep(2000);
//Click Download button
		driver.findElement(By.xpath("//*[@value='Series Metadata to CSV']")).click();
		Thread.sleep(2000);
//Click Download button
		driver.findElement(By.xpath("//*[text()='Tableau WDC Link']")).click();
		Thread.sleep(5000);
		WebElement activityreportModalClose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='skylight-close-button']")));
		activityreportModalClose.click();
		Thread.sleep(5000);
//Click What option
		driver.findElement(By.xpath("//*[text()='What?']")).click();
		Thread.sleep(2000);
	}	
	}





