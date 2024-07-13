package execution_Pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExecutionDemo {
	
	@Test
	@Parameters({"URL","Count"})
	public void ExecuteBrowserURL(String URL, int Count) throws InterruptedException {
	        //Launch Browser
			WebDriver driver = new ChromeDriver();
			
			//Open URL
			driver.get(URL);
			System.out.println("Browser Opened Successfully");
			
			//Validate Title
			String sActual_Title = driver.getTitle();
			System.out.println("Web-page Title extracted Successfully");	
			
			
			if(sActual_Title.contains("Disney+ Hotstar")) {
				System.out.println("We are inside Disney+ Hotstar website with Title :"+ sActual_Title);
				System.out.println("Web Page Title validation - Successful");
			}
				
			//delay
			Thread.sleep(Count*1000);
			System.out.println("Waited 5 seconds...");
			
			//Close Browser
			driver.quit();
			System.out.println("Browser Closed Successfully");
	}
}
