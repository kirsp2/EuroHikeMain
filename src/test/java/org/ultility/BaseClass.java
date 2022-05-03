package org.ultility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class BaseClass {
	
	public static WebDriver driver;
	//1. Launch the Chrome
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	//2. load url
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	//3. window maximize 
	public static void winMax() {
		driver.manage().window().maximize();
		
	}
	//4. print window title
	public static void printTitle() {
		System.out.println(driver.getTitle());	
		
	}
	
	//5. get window title
		public static String Titleget() {
			String title = driver.getTitle();
			
			return title;
			
		
		}
	//6. print current window url
	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
						
	}
	
	//7. Get current window url
		public static String CurrentUrlget () {
		String url = driver.getCurrentUrl();
		return url;
							
		}
	//8. Window close
	public static void winClose() {
		driver.close();
	}
	//9. window quite (current tap)
	public static void winQuit() {
		driver.quit();		

	}
	
	//10. Send key function
	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);		

	}
	//11. button click function
	public static void btnClick(WebElement ele) {
		ele.click();
		
		}
	
	//12. TakeScreenshot
	public static void screenshot(String name) throws IOException {
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File res = new File("E:\\Selenium\\EuroHike\\target\\Screenshot\\"+name+".jpg");		
		FileUtils.copyFile(src, res);

	}
	public static void implicitywaiting(int a) {
		
		driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
	

	}
	
	public static void pageDown(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		js.executeScript("arguments[0].scrollIntoView(true)", ele);

	}
}
