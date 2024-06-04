package skillset;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetup {
public static WebDriver driver;
 
    public static WebDriver driverSet() {
 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the driver name");
		String input = sc.nextLine();
 
		if(input.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		}
		else 
		{
			driver = new EdgeDriver();
		}
 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
 
		return driver;
 
  }
 
}