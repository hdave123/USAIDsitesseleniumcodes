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

	public class IdeaLandingpage {
		
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
}
@Test
public void test() throws InterruptedException {
// Open Source List page
		driver.findElement(By.xpath("//*[@data-testid='sources-button']")).click();
		Thread.sleep(2000);
		Actions fae = new Actions(driver);
		fae.sendKeys(Keys.PAGE_DOWN).build().perform();
		System.out.println("Scroll down perfomed");
		driver.navigate().back();
		Thread.sleep(2000);
// Search option
		WebElement selectcategory = driver.findElement(By.xpath("//*[@data-testid='idea-search-query']"));
		selectcategory.sendKeys("Enterprise Development");
		selectcategory.sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
//Open Learn More about How to use IDEA page
		driver.findElement(By.xpath("//*[@data-testid='learn-more-button']")).click();
		Thread.sleep(2000);
		driver.navigate().back();		
//Contact US Twitter page
		WebElement Twitter = driver.findElement(By.xpath("//*[@title='Twitter @USAID_DATA']"));
		Twitter.click();
		Thread.sleep(2000);
		driver.switchTo().window(driver.getWindowHandle());
		driver.get("https://idea.advise.devtechlab.com/");
		Thread.sleep(2000);		
//Contact US Email page
		WebElement email = driver.findElement(By.xpath("//*[@title='Email']"));
		email.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.switchTo().window(driver.getWindowHandle());
		driver.get("https://idea.advise.devtechlab.com/");
		driver.manage().window().maximize();		
//Contact US News Letter page
		driver.findElement(By.xpath("//*[@title='Newsletter Signup']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(driver.getWindowHandle());
		driver.get("https://idea.advise.devtechlab.com/");
		Thread.sleep(2000);
		driver.close();
	}
@AfterMethod
public void aftermethod() {
	driver.quit();
	System.out.println("Finished Idea Landing page testing");
}
}