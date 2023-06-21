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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testing {
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
WebElement currentreports = driver.findElement(By.xpath("//*[text()='2021 MSME Results Report']"));
Actions creports = new Actions(driver);
creports.moveToElement(currentreports).
click().build().perform();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);

}
}