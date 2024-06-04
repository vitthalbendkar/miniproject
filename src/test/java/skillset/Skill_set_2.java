package skillset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Skill_set_2 {

	public void organization(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")).click();  //For Organisation Button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[2]")).click();   //Button for Location tab 
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
	}
	
	public void addLocations(WebDriver driver) {
		// add location
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")).sendKeys(Skill_set_4.location);		
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
				driver.findElement(By.xpath("//*[text()='Spain']")).click();
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	}
	
	public void deleteLoc(WebDriver driver) {
		// For Deleting the location data
				driver.findElement(By.xpath("//div[@class='orangehrm-container']//button[1]")).click();
				driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
	}
}
