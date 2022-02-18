import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethod02 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://oklahomacity.craigslist.org/");
		driver.manage().window().maximize();

		sendKey("//input[@id='query']", "car" + Keys.ENTER);

		click("//a[@id='owner-purveyor']");

		click("//input[@name='hasPic']");

		sendKey("//input[@class='flatinput searchInput search_distance']", "50");

		sendKey("//input[@class='flatinput searchInput postal']", "73173");
		
		sendKey("//input[@name='min_price']", "100");
		
		sendKey("//input[@name='max_price']", "500");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='update search']")).sendKeys(Keys.ENTER);
		
		String totalNum = driver.findElement(By.xpath("//form/div[3]/div[3]/span[2]/span/span[@class='totalcount']")).getText();
		System.out.println("Total Result: " + totalNum);
		
		//click("//input[@name='min_price']");

		// driver.findElement(By.xpath("//input[@id='query']")).sendKeys("car" +
		// Keys.ENTER);
		// driver.findElement(By.xpath("//input[@class=\"flatinput searchInput
		// search_distance\"]")).sendKeys("50");
		// driver.findElement(By.xpath("//input[@class='flatinput searchInput
		// postal']")).sendKeys("73173");
		// driver.findElement(By.xpath("//button[@class='searchlink
		// linklike']")).click();

	}// main

	public static void sendKey(String xpath, String key) {
		driver.findElement(By.xpath(xpath)).sendKeys(key);
	}

	public static void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

}// class
