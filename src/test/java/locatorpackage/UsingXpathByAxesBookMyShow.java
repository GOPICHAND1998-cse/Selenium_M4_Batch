package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingXpathByAxesBookMyShow
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new FirefoxDriver();

            driver.manage().window().maximize();

            driver.get("https://www.district.in/");

            Thread.sleep(6000);

            driver.findElement(By.xpath("//button[@data-emphasis='high']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//img[@src='https://b.zmtcdn.com/data/edition_assets/174358689776817.png']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//h5[contains(text(),'Doraemon the Movie: New Nobita and the Castle')]"))
                    .click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
