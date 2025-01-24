package RegressionSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Reg_execution {
	
	@Test
	@Parameters({"URL","Count"})
	public void ExecuteBrowserURL(String URL, int Count) throws InterruptedException, IOException {
		
		String propFileNamePath = System.getProperty("user.dir")+"/src/test/java/resources/config.properties";
		FileInputStream fis = new FileInputStream(propFileNamePath);
		Properties prop = new Properties();
		prop.load(fis);
		
		String SuiteName = prop.getProperty("RegSuite");
		String SuiteTesterName = prop.getProperty("RegSuite_Tester");
		
		    System.out.println("=======================================================");
		    System.out.println("Regression Suite Execution initiated");
		    System.out.println("Executing "+SuiteName+" by Tester: "+SuiteTesterName);
		    System.out.println("=======================================================");
		
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
