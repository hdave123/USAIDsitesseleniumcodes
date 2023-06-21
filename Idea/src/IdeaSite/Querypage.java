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
//Open Country Roadmaps Option
		driver.findElement(By.xpath("//button[text()='Country Roadmaps']")).click();
		Thread.sleep(2000);
//Open Country Dashboard Option
		driver.findElement(By.xpath("//button[text()='Country Dashboard']")).click();
		Thread.sleep(2000);
//Open Global Health Option
		driver.findElement(By.xpath("//button[text()='Global Health']")).click();
		Thread.sleep(2000);
//Open IGD Option
		driver.findElement(By.xpath("//button[text()='Inclusive Growth Diagnostic (IGD)']")).click();
		Thread.sleep(2000);
//Open DRG Metrics Option
		driver.findElement(By.xpath("//button[text()='DRG Metrics Inventory']")).click();
		Thread.sleep(2000);
//Open Data Library Option
		driver.findElement(By.xpath("//*[@data-for='data-library']")).click();
		Thread.sleep(3000);
//Open IDEA Query Option
		driver.findElement(By.xpath("//button[text()='IDEA']")).click();
		Thread.sleep(2000);
//Select Series or type from the list
		driver.findElement(By.xpath("//*[@data-source-id='831']")).click();
		Thread.sleep(2000);		
//Select option from the list
		driver.findElement(By.xpath("//*[@data-source-id='218']")).click();
		Thread.sleep(2000);		
//Select option from the list
		driver.findElement(By.xpath("//*[@data-source-id='62']")).click();
		Thread.sleep(2000);	
//Show all the selected options
		driver.findElement(By.xpath("//*[@class='show-count']")).click();
		Thread.sleep(2000);		
//Move to "Where" tab
		driver.findElement(By.xpath("//*[@class='sw-bead']")).click();
		Thread.sleep(2000);
//Select country from the list
		driver.findElement(By.xpath("//*[text()='Afghanistan']")).click();
		Thread.sleep(2000);
//Move to "When" tab
		driver.findElement(By.xpath("//button[text()='When?']")).click();
		Thread.sleep(2000);
//Select year from the dropdown
		WebElement Toyear = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div[3]/select"));
		Toyear.sendKeys("2012");
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
		Thread.sleep(6000);
//Country Road Map query options
//Click What option
		driver.findElement(By.xpath("//*[text()='What?']")).click();
		Thread.sleep(2000);
//Open Country Roadmap
		driver.findElement(By.xpath("//button[text()='Country Roadmaps']")).click();
		Thread.sleep(2000);
//Select option from the list
		driver.findElement(By.xpath("//*[@data-source-id='159']")).click();
		Thread.sleep(2000);
//Select option from the list
		driver.findElement(By.xpath("//*[@data-source-id='194']")).click();
		Thread.sleep(2000);
//Select option from the list
		driver.findElement(By.xpath("//*[@data-source-id='62']")).click();
		Thread.sleep(2000);
//Show all the selected options
		driver.findElement(By.xpath("//*[@class='show-count']")).click();
		Thread.sleep(2000);		
//Move to "Where" tab
		driver.findElement(By.xpath("//*[@class='sw-bead']")).click();
		Thread.sleep(2000);
//Select country from the list
		driver.findElement(By.xpath("//*[text()='Angola']")).click();
		Thread.sleep(2000);
//Move to "When" tab
		driver.findElement(By.xpath("//button[text()='When?']")).click();
		Thread.sleep(2000);
//Select year from the dropdown
		WebElement Toyear1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div[3]/select"));
		Toyear1.sendKeys("1998");
		Toyear1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//Select year from the dropdown
		WebElement Fromyear1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div[5]/select"));
		Fromyear1.sendKeys("2012");
		Fromyear1.sendKeys(Keys.ENTER);
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
		WebElement activityreportModalClose1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='skylight-close-button']")));
		activityreportModalClose1.click();
		Thread.sleep(5000);
//Click What option
		driver.findElement(By.xpath("//*[text()='What?']")).click();
		Thread.sleep(2000);
//Open Country Dashboard query page
		driver.findElement(By.xpath("//button[text()='Country Dashboard']")).click();
		Thread.sleep(2000);
//Select option from the list
		driver.findElement(By.xpath("//*[text()='Access to electricity (percentage of population)']")).click();
		Thread.sleep(2000);
//Select option from the list
		driver.findElement(By.xpath("//*[text()='Active mobile money accounts (per 1,000 adults)']")).click();
		Thread.sleep(2000);
			
//Move to "Where" tab
		driver.findElement(By.xpath("//*[@class='sw-bead']")).click();
		Thread.sleep(2000);
//Select country from the list
		driver.findElement(By.xpath("//*[text()='Algeria']")).click();
		Thread.sleep(2000);
		
//Move to "When" tab
		driver.findElement(By.xpath("//button[text()='When?']")).click();
		Thread.sleep(2000);
//Select year from the dropdown
		WebElement Toyear2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div[3]/select"));
		Toyear2.sendKeys("1998");
		Toyear2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//Select year from the dropdown
		WebElement Fromyear2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div[5]/select"));
		Fromyear2.sendKeys("2012");
		Fromyear2.sendKeys(Keys.ENTER);
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
		WebElement activityreportModalClose2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='skylight-close-button']")));
		activityreportModalClose2.click();
		Thread.sleep(5000);
//Click What option
		driver.findElement(By.xpath("//*[text()='What?']")).click();
		Thread.sleep(2000);
	}
@Test
public void test02() throws InterruptedException {
//Open Global Health Query options
		driver.findElement(By.xpath("//button[text()='Global Health']")).click();
		Thread.sleep(2000);
//Select option from the list
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[1]/div/div/div/div[2]/div/div[2]/div/div/div[4]/div/div[1]/span")).click();
		Thread.sleep(2000);
//Select option from the list
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[1]/div/div/div/div[2]/div/div[2]/div/div/div[6]/div/div[1]/span")).click();
		Thread.sleep(2000);			
//Move to "Where" tab
		driver.findElement(By.xpath("//*[@class='sw-bead']")).click();
		Thread.sleep(2000);
//Select country from the list
		driver.findElement(By.xpath("//*[text()='Albania']")).click();
		Thread.sleep(2000);
		
//Move to "When" tab
		driver.findElement(By.xpath("//button[text()='When?']")).click();
		Thread.sleep(2000);
//Select year from the dropdown
		WebElement Toyear3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div[3]/select"));
		Toyear3.sendKeys("1998");
		Toyear3.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//Select year from the dropdown
		WebElement Fromyear3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div[5]/select"));
		Fromyear3.sendKeys("2012");
		Fromyear3.sendKeys(Keys.ENTER);
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
		WebElement activityreportModalClose3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='skylight-close-button']")));
		activityreportModalClose3.click();
		Thread.sleep(5000);
//Click What option
		driver.findElement(By.xpath("//*[text()='What?']")).click();
		Thread.sleep(2000);
//Open Inclusive Growth Diagnostic (IGD)
		driver.findElement(By.xpath("//button[text()='Inclusive Growth Diagnostic (IGD)']")).click();
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
		driver.findElement(By.xpath("//*[text()='Afghanistan']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//*[text()='Algeria']")).click();
		Thread.sleep(2000);	
//Move to "When" tab
		driver.findElement(By.xpath("//button[text()='When?']")).click();
		Thread.sleep(2000);
//Select year from the dropdown
		WebElement Toyear4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div[3]/select"));
		Toyear4.sendKeys("1998");
		Toyear4.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//Select year from the dropdown
		WebElement Fromyear4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div[5]/select"));
		Fromyear4.sendKeys("2012");
		Fromyear4.sendKeys(Keys.ENTER);
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
		WebElement activityreportModalClose4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='skylight-close-button']")));
		activityreportModalClose4.click();
		Thread.sleep(5000);
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
		WebElement Toyear5 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div[3]/select"));
		Toyear5.sendKeys("1998");
		Toyear5.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//Select year from the dropdown
		WebElement Fromyear5 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div[5]/select"));
		Fromyear5.sendKeys("2012");
		Fromyear5.sendKeys(Keys.ENTER);
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
		WebElement activityreportModalClose5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='skylight-close-button']")));
		activityreportModalClose5.click();
		Thread.sleep(5000);
//Click What option
		driver.findElement(By.xpath("//*[text()='What?']")).click();
		Thread.sleep(2000);

	}
@AfterMethod
public void aftermethod() {
	driver.quit();
	System.out.println("Finished Query page testing");


}
}


