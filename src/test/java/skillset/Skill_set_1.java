package skillset;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skill_set_1 {
	
	
	public void login(WebDriver driver) throws InterruptedException, IOException {
		
		
		driver.findElement(By.name("username")).sendKeys(Skill_set_4.user_id);
		driver.findElement(By.name("password")).sendKeys(Skill_set_4.password);
		//Thread.sleep(5000);
		driver.findElement(By.className("oxd-button")).click();
	}

	public void jobCat(WebDriver driver) {
		driver.findElement(By.className("oxd-text")).click();      //For Admin Button
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();     //For Job Button
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[4]/a")).click();     //For Job Category Button
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();   //For Add Button
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(Skill_set_4.TestEng);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click(); 
	}
	public void deleteJob(WebDriver driver) {
		driver.findElement(By.xpath("//div[@class='orangehrm-container']//button[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
	}

}


