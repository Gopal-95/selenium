import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal {

public static void main(String[] args)throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GOPAL\\eclipse-workspace\\project class\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	WebElement srhbar= driver.findElement(By.id("inputValEnter"));
	srhbar.sendKeys("smartwatch men");
	Thread.sleep(5000);
	WebElement srhbarclk=driver.findElement(By.className("searchTextSpan"));
	Thread.sleep(1000);
	srhbarclk.click();
	Thread.sleep(1000);
	WebElement prdt=driver.findElement(By.id("643301171952"));
	Thread.sleep(1000);
	prdt.click();
	WebElement buy=driver.findElement(By.cssSelector("div[catalog=\"669336972534\"]"));
	
	Thread.sleep(1000);
	buy.click();
	
		
	
			
}






}
