package TesterInYou.SampleMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestCase1 {
	WebDriver driver;
  @Test
  public void testCase1() {
	  Actions a=new Actions(driver);
	  a.moveToElement(driver.findElement(By.xpath("//li[@class='level0 nav-3 level-top parent']/a"))).perform();
	  a.moveToElement(driver.findElement(By.linkText("Furniture "))).perform();
	  a.moveToElement(driver.findElement(By.linkText(" Vanities & Desks "))).perform();
	  driver.findElement(By.linkText(" Vanities & Desks ")).click();
	  System.out.println("Thi is for testing");
  }
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get("https://www.rightstart.com");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
