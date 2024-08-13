package testing_package;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Aalert
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void Aalert()
	{
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//*[@id=\"alertButton\"].click();"
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		//a.accept();
		a.dismiss();
		driver.switchTo().alert().accept();	
		}
}
