import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajjujas\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		Thread.sleep(5000);
		
		//Check the first  Checkbox and verify if it is successfully checked
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		//Uncheck it again to verify if it is successfully Unchecked
		
		
		//How to get the Count of number of check boxes present in the page
		
	}

}
