import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
	
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://oklahomacity.craigslist.org/");
		
		driver.manage().window().maximize();
		
		sendKey("//input[@id='query']","camera" + Keys.ENTER );
		
		sendKey("//input[@class='flatinput searchInput search_distance']", "10");
		
		sendKey("//input[@class='flatinput searchInput postal']", "73173" + Keys.ENTER);
		
		sendKey("//input[@name='min_price']","30" + Keys.ENTER);
		
		sendKey("//input[@name=\"max_price\"]", "100" + Keys.ENTER);
		
		click("//button[@class='searchlink linklike']");
		
		
	
		
		// driver.findElement(By.xpath("//input[@id='query']")).sendKeys("camera" + Keys.ENTER);
		////driver.findElement(By.xpath("//input[@class='flatinput searchInput search_distance']")).sendKeys("10");
		//driver.findElement(By.xpath("//input[@class='flatinput searchInput postal']")).sendKeys("73173" + Keys.ENTER);
		
		//driver.findElement(By.xpath("//input[@name='min_price']")).sendKeys("30" + Keys.ENTER);
		//driver.findElement(By.xpath("//input[@name=\"max_price\"]")).sendKeys("100" + Keys.ENTER);
		//driver.findElement(By.xpath("//button[@class='searchlink linklike']")).click();

	}// main
	
	public static void sendKey(String xpath, String key) {
		driver.findElement(By.xpath(xpath)).sendKeys(key);
	}
	
	public static void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	

}// class
