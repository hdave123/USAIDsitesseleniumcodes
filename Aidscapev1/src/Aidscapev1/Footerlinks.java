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

	public class Footerlinks {
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
	//USAId
	    WebElement USAID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='usaid-alt-logo']")));
		Actions link1 = new Actions(driver);
		link1.moveToElement(USAID).
		click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	//Explore
		WebElement Explore = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='/search']")));
		Actions link2 = new Actions(driver);
		link2.moveToElement(Explore).
		click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
			
	//Profiles
		//Countries
		WebElement Countries = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Countries']")));
		Actions link3 = new Actions(driver);
		link3.moveToElement(Countries).
		click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
	   //Sectors
		WebElement Sectors = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Sectors']")));
		Actions link4 = new Actions(driver);
		link4.moveToElement(Sectors).
		click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		//Agencies
		WebElement Agencies = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Agencies']")));
		Actions link5 = new Actions(driver);
		link5.moveToElement(Agencies).
		click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	//Contact US
		//USAID Users
		WebElement Users = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/footer/div/div/div[2]/div/div[3]/ul/li[1]/a")));
		Actions link6 = new Actions(driver);
		link6.moveToElement(Users).
		click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		//Non USAID Users
		WebElement NonUsers = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/footer/div/div/div[2]/div/div[4]/ul/li[2]/a")));
		Actions link7 = new Actions(driver);
		link7.moveToElement(NonUsers).
		click().build().perform();
		link7.sendKeys(Keys.ALT +"F4");
		link7.sendKeys(Keys.ENTER).click().build().perform();
		Thread.sleep(5000);
		
		
	//Social
		//Twitter
		WebElement Twitter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/footer/div/div/div[2]/div/div[4]/ul/li[1]/a")));
		Actions link8 = new Actions(driver);
		link8.moveToElement(Twitter).
		click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		//Insight Newsletter
		WebElement Newsletter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/footer/div/div/div[2]/div/div[4]/ul/li[1]/a")));
		Actions link9 = new Actions(driver);
		link9.moveToElement(Newsletter).
		click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
		
	}
	@AfterMethod
	public void afterMethod(){
	  driver.quit();
	  System.out.println("Footer links");
	}
	}



