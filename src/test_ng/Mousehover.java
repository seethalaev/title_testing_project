package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Mousehover
{
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void urlloading()
		{
			driver.get("https://www.ebay.com/");
		}
		@Test
		public void test1()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement mouse=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")); //
		    Actions act=new Actions(driver);
		    
		    act.moveToElement(mouse).perform();	
		    driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		}
}









