package day1_DriverConfigure_DemoRun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConfig_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.hotstar.com/");
		
		//Validate Title
		String sActual_Title = driver.getTitle();
			
		if(sActual_Title.contains("Disney+ Hotstar")) {
			System.out.println("We are inside Disney+ Hotstar website with Title :"+ sActual_Title);
		}
			
		//Close Browser
		driver.quit();

	}

}
