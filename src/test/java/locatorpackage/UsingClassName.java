package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClassName
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.get("https://demowebshop.tricentis.com/");

         Thread.sleep(2000);

         driver.findElement(By.className("ico-register")).click();

         Thread.sleep(2000);

//         driver.findElement(By.className("text-box single-line")) ----> classname will not work for compound values(means the value which consists spaces)

         driver.findElement(By.name("FirstName"))
                 .sendKeys("John");
     }
     catch(Exception e)
     {
         e.printStackTrace();
     }
    }
}
