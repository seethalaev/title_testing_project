package testing_package;

import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Lnik
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https:/www.google.com");	

	}
	@Test
	public void linkcount()
	{
	
	List<WebElement> as=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+as.size());
	
	for(WebElement s:as)
	{
	  String link=s.getAttribute("href");
	  String text=s.getText();
	  System.out.println(link+"....."+text);
	 // verify(link);
	}	
}

	}
     
