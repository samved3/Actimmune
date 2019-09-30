package HorizonPharma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage {
	 WebDriver driver;
		
		//for Mac change chromedriver.exe to chromedriver
	 public void launch( String url)

	 {
		 String ChromeexePath = "C:\\Users\\shegde2\\Music\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", ChromeexePath);
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
	 }
	 
	 public void clickoncss(String css)
	 {
		 driver.findElement(By.cssSelector(css)).click();
		 
	 }
	 public void sendkeyscss(String css)
	 {
		 driver.findElement(By.cssSelector(css)).click();
	 }
	 
	 public void gettextcss(String css)
	 {
		String text= driver.findElement(By.cssSelector(css)).getText();
		 System.out.println(text);
	 }
	 


}
