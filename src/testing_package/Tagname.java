package testing_package;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tagname
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
	driver.get("https://www.google.com");	
	List<WebElement> li=driver.findElements(By.tagName("a"));// a tag nte under ulla multiple elemnets list li ind
	System.out.println("total no of links="+li.size());
     }
}
