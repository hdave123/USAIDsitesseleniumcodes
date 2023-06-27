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

	public class LatestNews {
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
	//Latest News
		
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
	//News 1
	    WebElement News1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='New Tax Facts Visualization Feature Launches on IDEA']")));
		Actions news1 = new Actions(driver);
		news1.moveToElement(News1).
		click().build().perform();
		Thread.sleep(5000);
		WebElement close1 = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("body > div.ReactModalPortal > div > div > div.latest-news__modal__header > svg"))));
		close1.click();
		Thread.sleep(5000);
		
	//News 2
		 WebElement News2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/main/div/div[5]/div/div[2]")));
		 Actions news2 = new Actions(driver);
		 news2.moveToElement(News2).
		 click().build().perform();
		 Thread.sleep(5000);
	//switching to main window	
		 driver.switchTo().window(a);
		 Thread.sleep(3000);
		 WebElement close2 = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("body > div.ReactModalPortal > div > div > div.latest-news__modal__header > svg"))));
		 close2.click();
		 Thread.sleep(2000);
	//News3
		 WebElement News3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='New Democracy, Human Rights, and Governance Third Party Indicators Tool on IDEA']")));
		 Actions news3 = new Actions(driver);
		 news3.moveToElement(News3).
		 click().build().perform();
		 Thread.sleep(5000);
		 WebElement close3 = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("body > div.ReactModalPortal > div > div > div.latest-news__modal__header > svg"))));
		 close3.click();
		 Thread.sleep(2000);

	//News4
		 WebElement News4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/main/div/div[5]/div/div[4]")));
		 Actions news4 = new Actions(driver);
		 news4.moveToElement(News4).
		 click().build().perform();
		 Thread.sleep(5000);
		 WebElement close4 = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("body > div.ReactModalPortal > div > div > div.latest-news__modal__header > svg"))));
		 close4.click();
		 Thread.sleep(2000);
		 
	//News5
		 WebElement News5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/main/div/div[5]/div/div[5]")));
		 Actions news5 = new Actions(driver);
		 news5.moveToElement(News5).
		 click().build().perform();
		 Thread.sleep(5000);
		 WebElement close5 = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("body > div.ReactModalPortal > div > div > div.latest-news__modal__header > svg"))));
		 close5.click();
		 Thread.sleep(2000);
		 
	//News6
	     WebElement News6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/main/div/div[5]/div/div[6]")));
		 Actions news6 = new Actions(driver);
		 news6.moveToElement(News6).
		 click().build().perform();
		 Thread.sleep(5000);
		 WebElement close6 = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("body > div.ReactModalPortal > div > div > div.latest-news__modal__header > svg"))));
		 close6.click();
		 Thread.sleep(2000);
		 
	}
	@AfterMethod
	public void afterMethod(){
	  driver.quit();
	  System.out.println("Latest News");
	}
	}


