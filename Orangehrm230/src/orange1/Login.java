package orange1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//https://github.com/STCCENTRE/Orange230
//token of orange230
//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
public class Login {

	public static void main(String[] args) {
		System.out.println("Launch Firefox");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mithr\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://localhost/Orangehrm/orangehrm-5.4/orangehrm-5.4/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Stcmithra@123");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.name("firstName")).sendKeys("Mithra");
		driver.findElement(By.name("middleName")).sendKeys("S");
		driver.findElement(By.name("lastName")).sendKeys("S");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		
	}
}

