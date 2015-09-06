package TesterInYou.SampleMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestCase2 {
	WebDriver driver;
  @Test
  public void testCase2() {
	  
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
