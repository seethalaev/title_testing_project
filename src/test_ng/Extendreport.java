package test_ng;


import java.io.File;
import java.io.IOException;
	import java.time.Duration;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
	import org.testng.Assert;
	import org.testng.ITestResult;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.markuputils.ExtentColor;
	import com.aventstack.extentreports.markuputils.MarkupHelper;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

	
	public class Extendreport
	{
		WebDriver driver;

		ExtentHtmlReporter reporter;
		ExtentTest test;
		ExtentReports extent;

			@BeforeTest
			public void beftest()
			{
			    reporter=new ExtentHtmlReporter("./reports/myreport1.html");
				reporter.config().setDocumentTitle("Automationreport");
				reporter.config().setReportName("functional test");
				reporter.config().setTheme(Theme.DARK);
				extent=new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("hostname", "localhost");
				extent.setSystemInfo("os", "windows10");
				extent.setSystemInfo("testername", "sheethu");
				extent.setSystemInfo("Browser Name", "chrome");
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();	
			}
			@BeforeMethod
			public void setup() 
			{
				driver.get("https://www.facebook.com");
			}
			@Test
			public void fbtitleverification() throws IOException
			{
				test=extent.createTest("Fbtitleverification");
				String Exp="facebook";
				String actual=driver.getTitle();
				Assert.assertEquals(Exp, actual);				
			}
			@Test
			public void fbbuttontest() throws IOException
			{
				test=extent.createTest("Fbbuttontest");
				String buttontext=driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).getText();
				Assert.assertEquals(buttontext, "register");
				
			}
			@Test
			public void fblogotest() throws IOException
			{
				test=extent.createTest("Fblogotest");
				boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
				Assert.assertTrue(b);	
			}
			@AfterTest
			public void teardown()
			{
				extent.flush();
			}
				@AfterMethod
					public void browserclose(ITestResult result) throws IOException
					{
			
				if(result.getStatus()==ITestResult.FAILURE)
				{
					test.log(Status.FAIL, "test case failed is"+result.getName());
					test.log(Status.FAIL, "test case failed is"+result.getThrowable());
					String screenshotpath=ExtendedReport.screenshotMethod(driver,result.getName());
					test.addScreenCaptureFromPath(screenshotpath);
					
				}else if(result.getStatus()==ITestResult.SKIP)
				{
					test.log(Status.SKIP, "test case skipped is"+result.getName());
				}
				else if(result.getStatus()==ITestResult.SUCCESS)
				{
					test.log(Status.PASS, "test case Passed is"+result.getName());
				}
				 
			}
			
			public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
			{
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				String destination="./Screenshott/"+screenshotname +".png";
				
				
				FileHandler.copy(src, new File(destination)); //"D://ExtendedReport.png"
				return destination;
				
			}
	}
