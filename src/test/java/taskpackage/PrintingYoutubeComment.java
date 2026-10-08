package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingYoutubeComment
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.youtube.com/");

          Thread.sleep(4000);

          driver.findElement(By.xpath("//input[@name='search_query']"))
                  .sendKeys("Dude Orchestral Suite");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//button[@title='Search']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//yt-formatted-string[text()='Dude – Orchestral Suite']"))
                  .click();

          Thread.sleep(6000);

          String comment = driver.findElement(By.xpath("(//div[@id='comment-container']/descendant::yt-attributed-string[@id='content-text'])[2]"))
                  .getText();

          System.out.println(comment);
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
