package webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.URL;

public class UsingNavigateMethod
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

//          driver.get("https://chat.qspiders.com/");
//
//          Thread.sleep(4000);
//
//          driver.navigate().back();
//
//          Thread.sleep(2000);
//
//          driver.navigate().forward();
//
//          Thread.sleep(2000);
//
//          driver.navigate().refresh();
//
//          Thread.sleep(2000);
//
//          driver.navigate().to("https://www.irctc.co.in/nget/train-search");

          Thread.sleep(2000);

          driver.navigate().to(new URL("https://www.playstation"));
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
