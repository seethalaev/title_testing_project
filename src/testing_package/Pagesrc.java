package testing_package;

import org.openqa.selenium.chrome.ChromeDriver;


public class Pagesrc
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String sc=driver.getPageSource();
		if(sc.contains("Gmail"))
		{
			System.out.println("pass:text is present");
		}
		else
		{
			System.out.println("fail:text is not present");
		}
	}

}