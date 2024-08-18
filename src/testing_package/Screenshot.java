package testing_package;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void scrnsht() throws Exception
	{
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		File scrnsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrnsht, new File("D://erro4.png"));    // saved in driver

	//	WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));  //day saving
		//File src2=dayelement.getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(src2,new File("./screenshot//Elmentscreenshot.png"));
		
		
	}
}