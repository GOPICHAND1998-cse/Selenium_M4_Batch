package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelectorInAmazon
{
    public static void main(String[] args)
    {
       try
       {
           WebDriver driver = new ChromeDriver();

           driver.manage().window().maximize();

           driver.get("https://www.amazon.in/");

           Thread.sleep(6000);

           driver.findElement(By.cssSelector("input[id*='searchtext']"))
                   .sendKeys("Vivo x300");

           Thread.sleep(2000);

           driver.findElement(By.cssSelector("input[id*='submit-button']"))
                   .click();

           Thread.sleep(2000);

           driver.findElement(By.cssSelector("h2[aria-label*='Urban Olive']"))
                   .click();
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
