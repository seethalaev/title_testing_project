package testing_package;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown
{
  ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void Buttonverify()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(dayelement);    
		day.selectByValue("25"); 
		List<WebElement> li=day.getOptions();
		System.out.println("total no of links="+li.size());
		
		
		WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select month=new Select(monthelement);
		month.selectByValue("06");            
		
		
		WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select year=new Select(yearelement);     //select tag nte under-class
		year.selectByValue("2000");
		                                    
			
	}
}
