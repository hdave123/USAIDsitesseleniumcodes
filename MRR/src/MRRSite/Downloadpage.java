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

public class Downloadpage {
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
//Hamburger Menu
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"usaid-head\"]/div/button"));
		menu.click();
		Thread.sleep(2000);
//Click 
		WebElement option2 = driver.findElement(By.xpath("//a[@id='data-menu-label']"));
		option2.click();
		WebElement Query1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='DOWNLOAD']")));
		Query1.click();
		Thread.sleep(2000);
//Download MSME Data 2021 XLSX file
		driver.findElement(By.xpath("//*[@id=\"data-download\"]/ul[1]/li/a")).click();
		Thread.sleep(4000);
//Download MSME Data 2020 XLSX file
		driver.findElement(By.xpath("//*[@id=\"data-download\"]/ul[2]/li/a")).click();
		Thread.sleep(4000);
//Download MSME Results Data 2019 XLSX file
		driver.findElement(By.xpath("//*[@id=\"data-download\"]/ul[3]/li/a")).click();
		Thread.sleep(4000);
//Download MSME Activity Data 2019 XLSX file
		driver.findElement(By.xpath("//*[@id=\"data-download\"]/ul[4]/li/a")).click();
		Thread.sleep(4000);
//Download MRR Data 2011-2018 XLSX file
		driver.findElement(By.xpath("//*[@id=\"data-download\"]/ul[5]/li/a")).click();
		Thread.sleep(4000);

}
@AfterMethod
public void aftermethod(){
	driver.quit();
	System.out.println("Finished Download Page testing");
}
}


