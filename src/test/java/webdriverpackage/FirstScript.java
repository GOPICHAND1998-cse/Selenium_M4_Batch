package webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            Thread.sleep(2000);

            driver.get("https://www.flipkart.com/");

            Thread.sleep(2000);

            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getPageSource());


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
