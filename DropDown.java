package thinkwiseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown {

	@Test
	public static void selectDropDown() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.paltalk.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		WebElement clkMembers = driver.findElement(By.xpath("//a[text()='Members']"));
		clkMembers.click();

		Thread.sleep(2000);
		WebElement selectGender = driver.findElement(By.xpath("//input[@value='All Genders']")); 																							

		//DropDown
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='Male';", selectGender);

		WebElement selectCountry = driver.findElement(By.xpath("//input[@value='India']"));
		jse.executeScript("arguments[0].value='Iran';", selectCountry);

	}

}
