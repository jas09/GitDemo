import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajjujas\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		Thread.sleep(6000);
		int count =driver.findElements(By.xpath("//input[@name='group2']")).size();
		
		for (int i=0;i<count;i++) 
		{
			String text=driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value");
			if (text.equals("Water")) 
			{
				driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
			}
		}	
	}
}
