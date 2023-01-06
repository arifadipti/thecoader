package Com.Utility.QA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCamp {

	public static WebDriver driver;
	public static Properties pro;
	
	
	public  BaseCamp() {
		try {
			FileInputStream file  = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Com\\ConfigCamp\\QA\\ConfigCampFile.properties");
		 pro=new Properties();
			pro.load(file);
		} catch (FileNotFoundException e) {
			System.out.println("please check this");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 
			 }
		
		public void initbrowser() {
			
		String Browser = pro.getProperty("Browser1");
		if(Browser.equals("chrome")) {
			
		
		
			System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		
		}
			
			else if (Browser.equals("firefox")) {
				
			}
			
		}
		 public static void launchURL (String URL) {
		
		driver.get(pro.getProperty("url"));
		
			

		
	}
	 
		
			

	}

