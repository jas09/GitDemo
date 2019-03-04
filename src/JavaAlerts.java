import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajjujas\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class='mainIn']/div[4]/form/input")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}

}
