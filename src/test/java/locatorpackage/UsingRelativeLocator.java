package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingRelativeLocator
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://tgsrtc.telangana.gov.in/");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//span[text()='Reservations']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(RelativeLocator.with(By.xpath("//a[contains(.,'Airport Timings')]"))
                                            .below(By.xpath("//a[contains(.,'e-Ticket')]")))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
