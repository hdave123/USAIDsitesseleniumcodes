package IdeaSite;

import java.time.Duration;

import org.openqa.selenium.By;
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

public class USAIDsites {
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
	Thread.sleep(5000);
		}
@Test 
//Other USAID Sites
public void test01() throws InterruptedException{
//Open FAE site
	driver.findElement(By.xpath("//*[text()='FAE']")).click();
	Thread.sleep(3000);
	driver.navigate().back();
//Open MRR site
	driver.findElement(By.xpath("//*[text()='MRR']")).click();
	Thread.sleep(3000);
	driver.navigate().back();
//Open TCB site
	driver.findElement(By.xpath("//*[text()='TCB']")).click();
	Thread.sleep(3000);
	driver.navigate().back();
//Open D2R site
	driver.findElement(By.xpath("//*[text()='D2R']")).click();
	Thread.sleep(3000);
	driver.navigate().back();
//Open USAID main page 
	driver.findElement(By.xpath("//*[@id=\"outer-container\"]/div[1]/div/div[3]/div[1]/nav/div[2]/a/img")).click();
	Thread.sleep(3000);
	driver.navigate().back();

}
@AfterMethod
public void aftermethod() {
	driver.quit();
	System.out.println("Finished USAID othersites testing");
}

}
