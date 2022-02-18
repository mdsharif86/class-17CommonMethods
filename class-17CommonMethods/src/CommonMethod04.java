import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethod04 {
	static WebDriver website;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver website;
		website = new ChromeDriver();
		website.get("http://sit.skyschooling.com/");
		website.manage().window().maximize();
		Thread.sleep(1000);
		click("//button[@data-target='#loginModal'][text()='Login']");
		//website.findElement(By.xpath("//button[@data-target='#loginModal'][text()='Login']")).click();	
		

	}
	public static void sendKey(String xpath, String key) {
			website.findElement(By.xpath(xpath)).sendKeys(key);
		}
		public static void click(String xpath) {
			website.findElement(By.xpath(xpath)).click();
		}
	
	
	
}
