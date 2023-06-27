package Aidscapev1;



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

	public class LatestResources {
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
	//Latest Resources
		
		public void test01() throws InterruptedException{
	//Scroll Down
		Actions act11 = new Actions(driver);
	  	act11.sendKeys(Keys.PAGE_DOWN).build().perform();
	    System.out.println("Scroll down perfomed");
	    Thread.sleep(3000);
	    Actions act12 = new Actions(driver);
	  	act12.sendKeys(Keys.PAGE_DOWN).build().perform();
	    System.out.println("Scroll down perfomed");
	    Thread.sleep(3000);
	    Actions act13 = new Actions(driver);
	  	act13.sendKeys(Keys.PAGE_DOWN).build().perform();
	    System.out.println("Scroll down perfomed");
	    Thread.sleep(3000);
	    Actions act14 = new Actions(driver);
	  	act14.sendKeys(Keys.PAGE_DOWN).build().perform();
	    System.out.println("Scroll down perfomed");
	    Thread.sleep(3000);
	    Actions act15 = new Actions(driver);
	  	act15.sendKeys(Keys.PAGE_DOWN).build().perform();
	    System.out.println("Scroll down perfomed");
	    Thread.sleep(3000);
	    Actions act16 = new Actions(driver);
	  	act16.sendKeys(Keys.PAGE_DOWN).build().perform();
	    System.out.println("Scroll down perfomed");
	    Thread.sleep(3000);
	   
		        
	    String a = driver.getWindowHandle();
	    Set<String> b = driver.getWindowHandles();
		 for (String c: b){
		 }
	//Resource 1
	    WebElement Resources1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Energy-efficiency opportunities in sub-Saharan Africa scaling up renewable energy (SURE)']")));
		Actions resources1 = new Actions(driver);
		resources1.moveToElement(Resources1).
		click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	//Resource 2
		WebElement Resources2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Policy review : natural resource management in agriculture and food security within selected USAID policies and strategies']")));
		Actions resources2 = new Actions(driver);
		resources2.moveToElement(Resources2).
		click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
			
	//Resource 3
	    WebElement Resources3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Prevent : combating environmental crimes activity: annual performance report : October 2020 - September 2021']")));
		Actions resources3 = new Actions(driver);
		resources3.moveToElement(Resources3).
		click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	//Resource 4
	    WebElement Resources4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Strengthening own source revenue policy in Lamongan district to support economic recovery']")));
		Actions resources4 = new Actions(driver);
		resources4.moveToElement(Resources4).
		click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	//Resource 5
	    WebElement Resources5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Preschool education in Morocco : challenges and key potential inputs']")));
		Actions resources5 = new Actions(driver);
		resources5.moveToElement(Resources5).
		click().build().perform();
		Thread.sleep(15000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	//Resource 6
	    WebElement Resources6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Resilience and economic growth in the Sahel : enhanced resilience (REGIS-ER) outcome harvesting report']")));
		Actions resources6 = new Actions(driver);
		resources6.moveToElement(Resources6).
		click().build().perform();
		Thread.sleep(15000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	//Resource 7
	    WebElement Resources7 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Mainstreaming wildlife incident management into utilities in Southern Africa']")));
		Actions resources7 = new Actions(driver);
		resources7.moveToElement(Resources7).
		click().build().perform();
		Thread.sleep(15000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	//Resource 8
	    WebElement Resources8 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Improving gender budgeting in Indonesia']")));
		Actions resources8 = new Actions(driver);
		resources8.moveToElement(Resources8).
		click().build().perform();
		Thread.sleep(15000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	//Resource 9
	    WebElement Resources9 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Financing tuberculosis : context, economic case, and political considerations']")));
		Actions resources9 = new Actions(driver);
		resources9.moveToElement(Resources9).
		click().build().perform();
		Thread.sleep(15000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	//Resource 10
	    WebElement Resources10 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='USAID supporting the policy enabling environment for development (SPEED) project management plan']")));
		Actions resources10 = new Actions(driver);
		resources10.moveToElement(Resources10).
		click().build().perform();
		Thread.sleep(15000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	//Resource 11
	    WebElement Resources11 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Mapping the ecosystem of education data for internally displaced persons in the Middle East and beyond : issues, challenges, and recommendations']")));
		Actions resources11 = new Actions(driver);
		resources11.moveToElement(Resources11).
		click().build().perform();
		Thread.sleep(15000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	//Resource 12
	    WebElement Resources12 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Water sanitation and conservation project : startup report']")));
		Actions resources12 = new Actions(driver);
		resources12.moveToElement(Resources12).
		click().build().perform();
		Thread.sleep(15000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	}
	@AfterMethod
	public void afterMethod(){
	  driver.quit();
	  System.out.println("Latest Resources");
	}
	}


