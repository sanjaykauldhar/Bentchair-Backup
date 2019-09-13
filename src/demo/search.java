package demo;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class search {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testsearch() throws Exception {
	    driver.get("https://www.bentchair.com/?utm_source=testing");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Login'])[2]/following::img[1]")).click();
	    driver.findElement(By.id("filter_names")).click();
	    driver.findElement(By.id("filter_names")).clear();
	    driver.findElement(By.id("filter_names")).sendKeys("Arkin Sofa");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Login'])[2]/following::img[2]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='View Details'])[1]/following::img[1]")).click();  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    //driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
