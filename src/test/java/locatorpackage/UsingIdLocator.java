package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIdLocator
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.amazon.in/");

            Thread.sleep(4000);

            driver.findElement(By.id("twotabsearchtextbox"))
                    .sendKeys("hotwheels bmw");

            Thread.sleep(2000);

            driver.findElement(By.id("nav-search-submit-button"))
                    .click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
