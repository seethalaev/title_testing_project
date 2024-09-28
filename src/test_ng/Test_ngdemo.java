package test_ng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_ngdemo
{
@BeforeTest
public void set()
{
	System.out.println("browser open");
}
@BeforeMethod
public void urlload()
{
	System.out.println("url open");
}
@Test(priority=2,invocationCount=3,dependsOnMethods= {"test3"})
public void test1()
{
	System.out.println("test1");
}
@Test(enabled=false)
public void test2()
{
	System.out.println("test2");
}
@Test(priority=1)
public void test3()
{
	System.out.println("test3");
}
@AfterMethod
public void report()
{
	System.out.println("report");
}
@AfterTest
public void close()
{
		System.out.println("browserclose");
}

}

