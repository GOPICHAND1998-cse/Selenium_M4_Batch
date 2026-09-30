package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariationInCssSelector
{
    public static void main(String[] args)
    {
       try
       {
           WebDriver driver = new ChromeDriver();

           driver.manage().window().maximize();

           driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

           Thread.sleep(2000);

           driver.findElement(By.cssSelector("table>tbody>tr:nth-child(4)>td:last-child>a[title='delete']"))
                   .click();
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
