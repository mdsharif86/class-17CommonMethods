import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethod03 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://sit.skyschooling.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[@class='btn btn-warning btn-sm'][@data-target='#registerModal']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='name'][@placeholder='Enter Name']")).sendKeys("Md Tanvir Sharif");
//		driver.findElement(By.xpath("//div[2]/input[@type='email']")).sendKeys("mdtanvirsharif@gmail.com");
//		driver.findElement(By.xpath("//input[@id=\'phone\']")).sendKeys("405-567-8912");
//		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("5013, SW 130th Street. OKC-73170");
//		driver.findElement(By.xpath("//div[5]/input[@id=\"password\"][@class=\"form-control \"]")).sendKeys("Anupom12345");
//		driver.findElement(By.xpath("//input[@id=\"password-confirm\"]")).sendKeys("Anupom12345");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='Register'][@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Login'][@type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email'][@name='email'][@class='form-control ']")).sendKeys("mdtanvirsharif@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password'][@autocomplete='current-password']")).sendKeys("Anupom12345");
		driver.findElement(By.xpath("//label[@for='remember']")).click();
		driver.findElement(By.xpath("//button[text()='Login'][@type='submit']")).click();
		driver.findElement(By.xpath("//button[@class='openbtn']")).click();
		driver.findElement(By.xpath("//a[@href='http://sit.skyschooling.com/employee']")).click();
		driver.findElement(By.xpath("//a[@href='http://sit.skyschooling.com/employee/create']")).click();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("MD");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Sharif");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='photo']")).sendKeys("C:\\Java\\dp.jpg");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mdsharif@gmail.com");
		driver.findElement(By.xpath("//input[@id='ccode']"));
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("111-1111");
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys("USA");
		driver.findElement(By.xpath("//input[@value='graduation']")).click();
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("12314, South Land Avenue, OK-73173");
		driver.findElement(By.xpath("//select[@name='salary_range']/option[3]")).click();
		driver.findElement(By.xpath("//input[@name='department']")).sendKeys("Psychology");
		driver.findElement(By.xpath("//input[@id='hr']")).click();
		driver.findElement(By.xpath("//input[@name='salary']")).sendKeys("50000");
		driver.findElement(By.xpath("//input[@name='status'][@value='0']")).click();
		driver.findElement(By.xpath("//input[@name='check_me']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//button[@class='openbtn']")).click();
		driver.findElement(By.xpath("//a[@href='http://sit.skyschooling.com/employee']")).click();
		
		//driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input")).sendKeys("mdtanvirsharif@gmail.com"+Keys.ENTER);
	}

}
