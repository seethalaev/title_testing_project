package testing_package;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Reddif
{

	ChromeDriver driver;
	@Before
	public void setup()
	{
//		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void Rediff()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
    
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		
		String buttontext=button.getAttribute("value=\\\"Create my account >>\\"");
		if(buttontext.equals("Register"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
}} 
//comment by arun
