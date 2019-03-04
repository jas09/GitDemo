import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Selenium code-
		
		//Create Driver Object for chrome browser
		
		/* class name = x
				x driver = new x(); */
		//Invoking Browser - 15 & 16
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajjujas\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//count number of check boxes in page
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox'")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox'")).size(), "6");
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);

		   /*int i=1;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();//4 times
		i++;
		}*/
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//Dynamic Drop down (with index)
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		//Dynamic Drop down (Parent child relactionship)
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
		
		
		
	}

}
