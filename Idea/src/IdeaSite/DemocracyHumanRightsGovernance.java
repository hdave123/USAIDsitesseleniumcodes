package IdeaSite;

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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemocracyHumanRightsGovernance {
	
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
		WebElement countrydash = driver.findElement(By.cssSelector("#outer-container > div:nth-child(1) > div > div.bm-menu-wrap.eads-menu > div.bm-menu > nav > ul > li > ul > li:nth-child(1) > ul > li:nth-child(4) > a"));
		Actions act = new Actions(driver);
		act.moveToElement(countrydash).
		click().build().perform();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//*[@id=\"outer-container\"]/div[1]/div/div[1]")).click();
		}
@Test 
//Country Spotlight
public void test01() throws InterruptedException{
		driver.findElement(By.xpath("//*[text()='Program Cycle']")).click();
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
		String a = driver.getWindowHandle();
		Set<String> b = driver.getWindowHandles();
		 for (String c: b){
//Approach option
		driver.findElement(By.xpath("//*[@data-testid='tab-label-1']")).click();
		Thread.sleep(2000);
//Open Rule of Law link
		driver.findElement(By.xpath("//*[text()='Rule of Law']")).click();
		Thread.sleep(5000);
// switching to main window	
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open Human Rights
		driver.findElement(By.xpath("//*[text()='Human Rights']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open Civil Society link
		driver.findElement(By.xpath("//*[text()='Civil Society']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open Political Competition and Consensus-Building (Elections) link
		driver.findElement(By.xpath("//*[text()='Political Competition and Consensus-Building (Elections)']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open Independent Media and Free Flow of Information link
		driver.findElement(By.xpath("//*[text()='Independent Media and Free Flow of Information']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open Good Governance link
		driver.findElement(By.xpath("//*[text()='Good Governance']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open Foreign Assistance (F) Framework link
		driver.findElement(By.xpath("//*[text()='Foreign Assistance (F) Framework.']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open Additional background information link
		driver.findElement(By.xpath("//*[text()='Click here for additional background information on the approaches.']")).click();
        Thread.sleep(5000);
        driver.switchTo().window(a);
        Thread.sleep(2000);
//Open Evidence option
        driver.findElement(By.xpath("//*[@data-testid='tab-label-2']")).click();
		Thread.sleep(5000);
//Open Rule of Law link
		driver.findElement(By.xpath("//*[text()='Rule of Law']")).click();
		Thread.sleep(5000);
// switching to main window	
		driver.switchTo().window(a);
		Thread.sleep(2000);		
//Open Human Rights
		driver.findElement(By.xpath("//*[text()='Human Rights']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open Civil Society link
		driver.findElement(By.xpath("//*[text()='Civil Society']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open Political Competition and Consensus-Building (Elections) link
		driver.findElement(By.xpath("//*[text()='Political Competition and Consensus-Building (Elections)']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open Independent Media and Free Flow of Information link
		driver.findElement(By.xpath("//*[text()='Independent Media and Free Flow of Information']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open Good Governance link
		driver.findElement(By.xpath("//*[text()='Good Governance']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open All Program Areas and Regions link
		driver.findElement(By.xpath("//*[text()='All Program Areas and Regions']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(a);
		Thread.sleep(2000);
//Open working paper link
		driver.findElement(By.xpath("//*[text()='working paper']")).click();
        Thread.sleep(5000);
        driver.switchTo().window(a);
        Thread.sleep(2000);
//Open Metrics option
        driver.findElement(By.xpath("//*[@data-testid='tab-label-3']")).click();
		Thread.sleep(5000);
//Open Country Data Portraits link
		driver.findElement(By.xpath("//*[text()='Country Data Portraits']")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(2000);
//Open Third Party Indicators Database link
        driver.findElement(By.xpath("//*[text()='Third Party Indicators Database']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
//Download Third Party Indicators Spreadsheets
        driver.findElement(By.xpath("//*[text()='Third Party Indicators Spreadsheets']")).click();
        Thread.sleep(2000);
//Open Rule of Law Metrics link
        driver.findElement(By.xpath("//*[text()='Rule of Law Metrics']")).click();
        Thread.sleep(5000); 
// switching to main window	
        driver.switchTo().window(a);
        Thread.sleep(2000);
//Open Human Rights Metrics link
        driver.findElement(By.xpath("//*[text()='Human Rights Metrics']")).click();
        Thread.sleep(5000);
        driver.switchTo().window(a);
        Thread.sleep(2000);
//Open Civil Society Metrics link
        driver.findElement(By.xpath("//*[text()='Civil Society Metrics']")).click();
        Thread.sleep(5000);
        driver.switchTo().window(a);
        Thread.sleep(2000);
//Open Political Competition and Consensus-Building (Elections) Metrics link
        driver.findElement(By.xpath("//*[text()='Political Competition and Consensus-Building (Elections) Metrics']")).click();
        Thread.sleep(5000);
        driver.switchTo().window(a);
        Thread.sleep(2000);
//Open Independent Media and Free Flow of Information Metrics link
        driver.findElement(By.xpath("//*[text()='Independent Media and Free Flow of Information Metrics']")).click();
        Thread.sleep(5000);
        driver.switchTo().window(a);
        Thread.sleep(2000);
//Open Good Governance Metrics link
        driver.findElement(By.xpath("//*[text()='Good Governance Metrics']")).click();
        Thread.sleep(5000);
        driver.switchTo().window(a);
        Thread.sleep(2000);
//Open Metrics link
       // driver.findElement(By.xpath("//*[@id=\"react-tabs-39\"]/div/p[4]/ul/li[4]/ul/li/a[1]")).click();
       // Thread.sleep(5000);
       // driver.switchTo().window(a);
      //  Thread.sleep(2000);
//Open Guide link
      //  driver.findElement(By.xpath("//*[@id=\"react-tabs-39\"]/div/p[4]/ul/li[4]/ul/li/a[2]")).click();
       // Thread.sleep(5000);
        //driver.switchTo().window(a);
       // Thread.sleep(2000);
//Open additional resources page
        driver.findElement(By.xpath("//*[text()='Click here for additional background information on the Metrics.']")).click();
        Thread.sleep(2000);
        driver.switchTo().window(a);
        Thread.sleep(2000);
//Open Metrics: Third Party Indicators
        driver.findElement(By.xpath("//*[@data-testid='tab-label-4']")).click();
		Thread.sleep(5000);
//Open Metrics: Country Portraits
		driver.findElement(By.xpath("//*[@data-testid='tab-label-5']")).click();
		Thread.sleep(5000);
}
	}
@AfterMethod
public void aftermethod() {
		driver.quit();
		System.out.println("Finished Democracy Human Rights Governance testing");
	}
}
