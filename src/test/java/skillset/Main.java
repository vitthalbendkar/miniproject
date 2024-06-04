package skillset;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = DriverSetup.driverSet();
		
		Skill_set_1 obj1 = new Skill_set_1();
		Skill_set_2 obj2 = new Skill_set_2();
		Skill_set_3 obj3 = new Skill_set_3();
		Skill_set_4 obj4 = new Skill_set_4();
		
		// Calling Object for class Skill_set_1
		
		obj4.excel();
		obj1.login(driver);
		ScreenShots("s1.png", driver);
		
		obj1.jobCat(driver);
		ScreenShots("s2.png", driver);
		
		obj1.deleteJob(driver);
		ScreenShots("s3.png", driver);
		
		// Calling Object for class Skill_set_2
		
		obj2.organization(driver);
		ScreenShots("s4.png", driver);
		//obj4.excel();
		obj2.addLocations(driver);
		ScreenShots("s5.png", driver);
		obj2.deleteLoc(driver);
		ScreenShots("s6.png", driver);
		
		
		// Calling Object for class Skill_set_3
		
		obj3.qualifications(driver);
		ScreenShots("s7.png", driver);
		obj3.addSkills(driver);
		ScreenShots("s8.png", driver);
		obj3.deleteSkills(driver);
		ScreenShots("s9.png", driver);
		obj3.logout(driver);
		
		
		
		
		}
	
	public static void ScreenShots(String fileName, WebDriver driver) throws IOException 
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("C:\\Users\\2304086\\eclipse-workspace\\miniproject\\src\\test\\resources\\ScreenShots\\"+ fileName);
		FileUtils.copyFile(src, trg);
	}

}
