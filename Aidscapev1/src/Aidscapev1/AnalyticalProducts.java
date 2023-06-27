package Aidscapev1;


	

	import java.time.Duration;
	import java.util.Set;

	import org.openqa.selenium.By;
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
		driver.get("https://aidscapev1.prod.devtechlab.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Thread.sleep(2000);

	}
		@Test 
	//Country Spotlight
		public void test01() throws InterruptedException{
		//Brazil
			WebElement Brazil = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='https://idea.usaid.gov/cd/brazil?comparisonGroup=region']")));
			Actions brazil = new Actions(driver);
			brazil.moveToElement(Brazil).
			click().build().perform();
			Thread.sleep(10000);
			String a = driver.getWindowHandle();
			 Set<String> b = driver.getWindowHandles();
				 for (String c: b){
	// switching to main window	
			driver.switchTo().window(a);
			String s= driver.getTitle();
			Thread.sleep(8000);
					 }
	//Ghana
			WebElement Ghana = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='https://idea.usaid.gov/cd/ghana?comparisonGroup=region']")));
			Actions ghana = new Actions(driver);
			ghana.moveToElement(Ghana).
			click().build().perform();
			Thread.sleep(10000);
					 
	// switching to main window
			 driver.switchTo().window(a);
			 String s= driver.getTitle();
			 Thread.sleep(2000);
				 
	//India
			 WebElement India = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='https://idea.usaid.gov/cd/india?comparisonGroup=region']")));
			 Actions india = new Actions(driver);
			 india.moveToElement(India).
			 click().build().perform();
			 Thread.sleep(10000);
				
	// switching to main window
			 driver.switchTo().window(a);
				
	//Italy
			 WebElement Italy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='https://idea.usaid.gov/cd/italy?comparisonGroup=region']")));
			 Actions italy = new Actions(driver);
			 italy.moveToElement(Italy).
			 click().build().perform();
			 Thread.sleep(10000);
					 
	// switching to main window
			driver.switchTo().window(a);
				
	//Thailand
			 WebElement Thailand = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='https://idea.usaid.gov/cd/thailand?comparisonGroup=region']")));
			 Actions thailand = new Actions(driver);
			 thailand.moveToElement(Thailand).
			 click().build().perform();
			 Thread.sleep(10000);
		 
	// switching to main window
			driver.switchTo().window(a);
		}
	@AfterMethod
		public void afterMethod(){
		  driver.quit();
		  System.out.println("Country Spotlights");
	}
	}


