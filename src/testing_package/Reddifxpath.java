
package testing_package;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Reddifxpath
{

	ChromeDriver driver;
	@Before
	public void setup()
	{

		driver=new ChromeDriver();
	
	
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Manu Ram");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("a@gmail.com");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();

	}
}  