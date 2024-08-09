package testing_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//driver.close()'' //close the window
		String title = driver.getTitle();
		String expected_title = "Google";
		
		if (title.equals(expected_title) )
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed ");
		}
		System.out.println("title:"+title);
		driver.quit(); //quit all the tabs
 
	}

}
