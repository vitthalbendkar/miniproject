package skillset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skill_set_3 {

	public void qualifications(WebDriver driver) {
		driver.findElement(By.xpath("//span[normalize-space()='Qualifications']")).click();   // For Qualification Tab
		driver.findElement(By.cssSelector("li[class='--active oxd-topbar-body-nav-tab --parent'] li:nth-child(1)")).click();     // For select Skills Tab
	}
	
	public void addSkills(WebDriver driver) {
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();      // Add the Skills
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(Skill_set_4.skills);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	
	public void deleteSkills(WebDriver driver) {
		//For Deleting Skills Set
				driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div/div/div[4]/div/button[1]")).click();
				driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
	}
	
	public void logout(WebDriver driver) {
		// For Log Out
				driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
				driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
				System.out.println("Screenshorts Saved");
				driver.quit();
	}
}
