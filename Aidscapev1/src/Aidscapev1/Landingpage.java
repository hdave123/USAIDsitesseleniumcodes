package Aidscapev1;

	import java.time.Duration;
	import java.util.Iterator;
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

	public class Landingpage {
		
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
	//Hamburger Menu

	public void test01() throws InterruptedException{
		WebElement stepback1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/div/div[2]/div[3]")));
		Actions back0 = new Actions(driver);
		back0.moveToElement(stepback1).
		click().build().perform();
		Thread.sleep(2000);
		
		
	//Close Menu
		WebElement stepback11 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-icon='xmark']")));
		Actions back = new Actions(driver);
		back.moveToElement(stepback11).
		click().build().perform();
		Thread.sleep(2000);
		
	//Search Valid test
		WebElement validtest = driver.findElement(By.xpath("//*[@id='aidscape-search']"));
		validtest.sendKeys("Agriculture");
		validtest.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//Scroll Down
		Actions act12 = new Actions(driver);
		act12.sendKeys(Keys.PAGE_DOWN).build().perform();
	    System.out.println("Scroll down perfomed");
	    Thread.sleep(3000);
	    driver.navigate().back();
	  	Actions act1 = new Actions(driver);
	  	act1.sendKeys(Keys.PAGE_DOWN).build().perform();
	    System.out.println("Scroll down perfomed");
	    Thread.sleep(3000);
		
	//Search Invalid test
		WebElement invalidtest = driver.findElement(By.xpath("//*[@id='aidscape-search']"));
		invalidtest.sendKeys("njnjkkdjdjdjdjhjffffffffffjjjjjjjje");
		invalidtest.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	     
	      String a = driver.getWindowHandle();
	      Set<String> b = driver.getWindowHandles();
	  	 for (String c: b){
	  	 }
					 
		// switching to main window
			 driver.switchTo().window(a);
	}
	@ AfterMethod
	public void aftermethod(){
		driver.quit();
		System.out.println("Landing Page");
		
	}
	}


