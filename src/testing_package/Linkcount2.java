package testing_package;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Linkcount2
{

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void linkcount()
	{
	//driver.get("https://www.netflix.com");	
	//List<WebElement> ma=driver.findElements(By.tagName("a"));
	//System.out.println("total no of links="+ma.size());
	
    driver.get("https://www.keralapsc.gov.in/");	
    List<WebElement> la=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+la.size());
	 
     }
}
