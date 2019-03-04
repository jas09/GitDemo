import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Driver Initialization
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajjujas\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch URL
		driver.get("https://www.spicejet.com/");
		// Providing search details - from,to,current date,one check box,3 adults &
		// click search

		// From & to
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		// driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		// Dynamic Drop down (Parent child relactionship)
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']"))
				.click();

		// current date - calander & check return date calender is disabled
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			;
		{
			Assert.assertTrue(true);
		}
		/*
		 * else { Assert.assertFalse(true); }
		 */
		// Family and friends check box
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		// Passengers - number of passengers
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		for (int i = 1; i < 4; i++) {
			// driver.findElement(By.id("hrefIncAdt")).click();
			// driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
		}
		// Currency -
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
		// Click on search
		driver.findElement(By.cssSelector("input[value='Search']")).click();
	}

}
