package orange1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//class for orangehrm loginpage
		System.out.println("LAUNCH FIREFOX");
		System.setProperty("webdriver.gecko.driver", "D:\\STC\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/Orangehrm/orangehrm-5.4/orangehrm-5.4/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("div.oxd-form-row:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Admin");
		driver.findElement(By.cssSelector("div.oxd-form-row:nth-child(3) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Stcpattom@1234");
		driver.findElement(By.cssSelector(".oxd-button")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		driver.findElement(By.name("firstName")).sendKeys("Shahrukh");
		driver.findElement(By.name("lastName")).sendKeys("Khan");
		driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	}

}
