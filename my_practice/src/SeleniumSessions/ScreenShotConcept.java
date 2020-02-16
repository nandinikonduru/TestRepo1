package SeleniumSessions;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotConcept {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		screenshot("google1");
		
		driver.close();
		
	}
	
	public static void screenshot(String Screenname) throws AWTException, IOException, InterruptedException {
		
		Robot r = new Robot();
		
		BufferedImage bi = r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		
		ImageIO.write(bi, "png", new File(".\\ScreenShot"+Screenname+".png"));
		Thread.sleep(3000);
		
		
		
//		//Take screenshot and store as a file format
//		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		
//		//now copy the screenshot in desired location by using copyFile method
	
	}
		
	

}
