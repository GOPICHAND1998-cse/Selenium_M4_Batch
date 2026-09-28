package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkText
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://demowebshop.tricentis.com/");

            Thread.sleep(2000);

            driver.findElement(By.linkText("Log in")).click();
        }
        catch (Exception e)
        {

            e.printStackTrace();
        }
    }
}
