package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Action
{
	WebDriver driver;
	@BeforeTest
public void set()
{
	driver = new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test1()
{
	WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	fullname.sendKeys("abc");
	WebElement rediffid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	Actions act=new Actions(driver);
	act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	act.keyDown(fullname,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
//	act.build().perform();complile execute
	act.perform();	

}
}