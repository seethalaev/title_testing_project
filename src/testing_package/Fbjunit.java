package testing_package;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fbjunit {
		ChromeDriver driver;
		@Before
		public void setup()
		{
		
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		@Test
		public void test()
		{
		//driver.get("https://www.google.com");	
		//driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();//don't get
			
			
			
			driver.findElement(By.name("email")).sendKeys("lkj@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("mnj");
		    driver.findElement(By.name("login")).click();
				}}	
