

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajjujas\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement source = driver.findElement(By.id("hp-widget__sfrom"));
		source.clear();
		source.sendKeys("HYD");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination=driver.findElement(By.id("hp-widget__sTo"));
		destination.clear();
		destination.sendKeys("raj");
		Thread.sleep(2000);
		for (int i=1;i<3;i++) 
		{
			destination.sendKeys(Keys.ARROW_DOWN);
			//System.out.println(destination.getText());
		}
			destination.sendKeys(Keys.ENTER);
		    //System.out.println(destination.getText());
			
	}

}
