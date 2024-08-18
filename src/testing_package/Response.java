package testing_package;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class Response
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

     public void linkcount () throws IOException
		
		{
			URL ob=new URL(baseurl);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();            //response code validate chyuna code
			int responsecode=con.getResponseCode();
			
			System.out.println(responsecode);
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("VALID----");
			}
			else if(con.getResponseCode()==400)
			{
				System.out.println("Broken link---");
			}
		}
	}

