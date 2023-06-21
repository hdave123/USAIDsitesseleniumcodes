package MRRSite;



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

public class Glossarypage {
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
public void test1() throws InterruptedException {
// Open Glossary page
//Hamburger Menu
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"usaid-head\"]/div/button"));
		menu.click();
		Thread.sleep(2000);
//About option
		WebElement about1 = driver.findElement(By.xpath("//*[@id=\"about-menu-label\"]"));
		about1.click();
		Thread.sleep(2000);
//Glossary page
		WebElement glossary = driver.findElement(By.xpath("//*[@id=\"about-menu\"]/ul/li[2]/a"));
		glossary.click();
		Thread.sleep(2000);
//Close Acronyms option
		WebElement link1 = driver.findElement(By.xpath("//*[text()='Acronyms']"));
		link1.click();
		Thread.sleep(2000);
//Expand Enterprise Development information
		WebElement link2 = driver.findElement(By.xpath("//*[text()='Enterprise Development']"));
		link2.click();
		Thread.sleep(2000);
//Expand Financial Services/Microfinance information
		WebElement link3 = driver.findElement(By.xpath("//*[text()='Financial Services/Microfinance']"));
		link3.click();
		Thread.sleep(2000);
//Expand Mechanism Number information
		WebElement link4 = driver.findElement(By.xpath("//*[text()='Mechanism Number']"));
		link4.click();
	    Thread.sleep(2000);
//Expand Microenterprise information
	    WebElement link5 = driver.findElement(By.xpath("//*[text()='Microenterprise']"));
	    link5.click();
	    Thread.sleep(2000);
//Expand Microfinance information
	    WebElement link6 = driver.findElement(By.xpath("//*[text()='Microfinance']"));
	    link6.click();
	    Thread.sleep(2000);
//Policy for Enterprise Development
	    WebElement link7 = driver.findElement(By.xpath("//a[text()='Policy for Enterprise Development']"));
	    link7.click();
	    Thread.sleep(2000);
//Policy for Financial Services/Microfinance
	    WebElement link8 = driver.findElement(By.xpath("//a[text()='Policy for Financial Services/Microfinance']"));
	    link8.click();
	    Thread.sleep(2000);
//Sector
	    WebElement link9 = driver.findElement(By.xpath("//*[text()='Sector']"));
	    link9.click();
	    Thread.sleep(2000);
}		  
@AfterMethod
public void aftermethod(){
	driver.quit();
	System.out.println("Finished Glossary Page testing");	
	}	
	}


