package test_ng;

import org.testng.annotations.Test;

public class Grouping 
{
@Test(groups= {"sanity"})
public void main1()
{
	System.out.println("This is main 1");
}
@Test(groups= {"sanity","smoke"})
public void main2()
{
	System.out.println("This is main 2");
}
@Test(groups= {"regression"})
public void main3()
{
	System.out.println("This is main 3");
}
@Test(groups= {"sanity","regression"})
public void main4()
{
	System.out.println("This is main 4");
}
@Test(groups= {"regression"})
public void main5()
{
	System.out.println("This is main 5");
}

}
