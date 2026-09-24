package webdriverpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingManageMethod
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();
//
//         Thread.sleep(2000);
//
//         driver.get("https://www.youtube.com/");
//
//         Thread.sleep(2000);
//
//         driver.manage().window().maximize();
//
//         Thread.sleep(2000);
//
//         driver.manage().window().fullscreen();
//
//         Thread.sleep(2000);
//
//         driver.manage().window().minimize();

         Thread.sleep(2000);

         driver.get("https://www.crunchyroll.com/");

         Thread.sleep(2000);

         driver.manage().window().setSize(new Dimension(500,500));

         System.out.println("The New Dimensions are ~~~~~~ "+driver.manage().window().getSize());

         Thread.sleep(2000);

         driver.manage().window().setPosition(new Point(500,0));

         Thread.sleep(1000);

         driver.manage().window().setPosition(new Point(100,600));

         Thread.sleep(1000);

         driver.manage().window().setPosition(new Point(800,50));

         Thread.sleep(1000);

         driver.manage().window().setPosition(new Point(50,500));

//         System.out.println("The New Position is ~~~~~~~ "+driver.manage().window().getPosition());


     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
