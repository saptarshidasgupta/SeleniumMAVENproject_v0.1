package day1_DriverConfigure_DemoRun;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_DemoRun {

	
	@Test
	@Parameters({"URL","Count"})
	public void setup1(String URL, int Count) {
		Count=Count-1;
		System.out.println("I am inside setup1 login to "+URL+" with count = "+Count+" and Thread ID = "+ Thread.currentThread().getId() );
	}
	
	@Test
	@Parameters({"URL","Count"})
	public void setup2(String URL, int Count) {
		System.out.println("I am inside setup2 login to "+URL+" with count = "+Count+" and Thread ID = "+ Thread.currentThread().getId() );
	}
	
	@Test
	@Parameters({"URL","Count"})
	public void setup3(String URL, int Count) {
		Count=Count+1;
		System.out.println("I am inside setup3 login to "+URL+" with count = "+Count+" and Thread ID = "+ Thread.currentThread().getId() );
	}
}
