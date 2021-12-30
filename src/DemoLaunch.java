import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com");
		driver.navigate().to("https://facebook.com");
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		//difference between close() and quit() method
		//difference between get() and to() method
		//driver.close();
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
	

}
