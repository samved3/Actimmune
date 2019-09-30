package HorizonPharma;

import org.junit.Test;
import org.openqa.selenium.By;
import HorizonPharma.HomepageLocator;

public class AppTest extends Basepage
{
	@Test
	
	public void sample ()
	{
		HomepageLocator hl= new HomepageLocator();
		launch("https://hpreview:W3lc0me2C0mIn@horizonpharma-actimmune-dev.cphostaccess.com");
		clickoncss(hl.locator);
		String value =driver.findElement(By.cssSelector(" section.content.secondary-page > div > div > div > div > div:nth-child(1) > h2")).getText();
		System.out.println(value);
		

		
	
		
		
	}
	
	
}
