package testing_package;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Brokenlink2
{
	ChromeDriver driver;
	String baseurl="https://www.google.com";							//brokenlink
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	
	}
		
	@Test

     public void linkcount () 
		{
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
	//	System.out.println("total no of links="+li.size());
	     
		for(WebElement s:li)
		{
		 String link=s.getAttribute("href");
		// String text=s.getText();
		// System.out.println(link+"....."+text);
		  verify(link);
		}
		}
		 public void verify(String link)
		 {
			 {

				try
				{
				
					URL ob=new URL(link);
					HttpURLConnection con=(HttpURLConnection)ob.openConnection();   //response code validate chyuna code
					con.connect();
			
					if(con.getResponseCode()==200)
					{
						System.out.println("VALID----"+link);
					}
					else if(con.getResponseCode()==404)
					{
						System.out.println("Broken link---"+link);
					}}
					catch (Exception e)
					{
						System.out.println(e.getMessage());
					}
				}
			}}
			
			

