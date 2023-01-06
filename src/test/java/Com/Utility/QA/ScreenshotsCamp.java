package Com.Utility.QA;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotsCamp {

	public static void screenshot(WebDriver driver, String screenshot) {
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String dir= System.getProperty("user.dir");
		try {
			FileUtils.copyFile(srcfile, new File(dir+"/ScreenshotsCamp/"+screenshot+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}