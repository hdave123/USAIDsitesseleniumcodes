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

public class Querypage {
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
//Click 
		WebElement option1 = driver.findElement(By.xpath("//a[@id='data-menu-label']"));
		option1.click();
		WebElement Query = option1.findElement(By.xpath("//*[text()='QUERY']"));
		Query.click();
		Thread.sleep(2000);
//Add Filter options from the list
		WebElement arrow = driver.findElement(By.xpath("//*[@class='Select-arrow']"));
		arrow.click();
		Thread.sleep(2000);
//Select Country option
		WebElement country = arrow.findElement(By.xpath("//*[text()='Country']"));
		country.click();
		WebElement option12 = driver.findElement(By.xpath("//*[@id=\"country-filter-definition\"]/div[2]/div/span/div/div[1]/span"));
		option12.click();
		Thread.sleep(2000);
		WebElement India = option12.findElement(By.xpath("//*[text()='Cambodia']"));
		India.click();
		Thread.sleep(2000);
//Select Eligibility Rule option	
		//WebElement arrow1 = driver.findElement(By.xpath("//*[@class='Select-arrow']"));
		//arrow1.click();
		//Thread.sleep(2000);
		//WebElement eligibility = arrow1.findElement(By.xpath("//*[text()='Eligibility Rule']"));
		//eligibility.click();
		//Thread.sleep(2000);
		//WebElement option2 = driver.findElement(By.xpath("//*[@id=\"eligibility-rule-filter-definition\"]/div[2]/div/span/div/div[1]/span"));
		//option2.click();
		//Thread.sleep(2000);
		//WebElement value = option2.findElement(By.xpath("//*[text()='true']"));
		//value.click();
		//Thread.sleep(2000);
//Select Fiscal year option
		WebElement arrow2 = driver.findElement(By.xpath("//*[@class='Select-arrow']"));
		arrow2.click();
		Thread.sleep(2000);
		WebElement fiscal = arrow2.findElement(By.xpath("//*[text()='Fiscal Year']"));
		fiscal.click();
		Thread.sleep(2000);
		WebElement option3 = driver.findElement(By.xpath("//*[@id=\"fiscal-year-filter-definition\"]/div[2]/div/span/div/div[1]/span"));
		option3.click();
		Thread.sleep(2000);
		WebElement year = option3.findElement(By.xpath("//*[text()='2017']"));
		year.click();
		Thread.sleep(2000);
//Click Apply Filter
		WebElement filter = option3.findElement(By.xpath("//*[text()='Apply Filter']"));
		filter.click();
		Actions scroll = new Actions(driver);
		scroll.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		Actions scroll1 = new Actions(driver);
		scroll1.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
//Open columns option
		WebElement columns = driver.findElement(By.xpath("//*[@class='closed dd-btn']"));
		columns.click();
		Thread.sleep(2000);
		WebElement options = columns.findElement(By.xpath("//*[text()='Project Id']"));
		options.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"query-page\"]/span")).click();
//Export to CSV
		WebElement csv = driver.findElement(By.xpath("//*[@value='Export to CSV']"));
		csv.click();
		Thread.sleep(3000);
		Actions scrollup = new Actions(driver);
		scrollup.sendKeys(Keys.PAGE_UP);
		Thread.sleep(2000);
}
@AfterMethod
public void aftermethod(){
	driver.quit();
	System.out.println("Finished Query Page testing");
}
}
