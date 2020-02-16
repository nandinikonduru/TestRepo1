package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalenderByJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.spicejet.com/");

		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateVal = "18-8-2020";
//		while (true) {
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//
//			String month = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
//
//			if (month.contains("March ")) {
//				WebElement table = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table"));
//				List<WebElement> rows = table.findElements(By.tagName("tr"));
//
//				for (WebElement r : rows) {
//					List<WebElement> columns = r.findElements(By.tagName("td"));
//
//					for (WebElement c : columns) {
//						String date = c.getText();
//
//						if (date.contains("30")) {
//							c.click();
//							break;
//						}
//					}
//				}
//
//			}

		//}
		
		selectDateByJS(driver, date, dateVal);
		

	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
	}

}
