package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBySingleAttribute
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@id='firstname']"))
                    .sendKeys("FirstName");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='lastname']"))
                    .sendKeys("LastName");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@placeholder='UserName']"))
                    .sendKeys("user@gmail.com");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@id='password']"))
                    .sendKeys("Password@12345");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@value='Register']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[text()='Back to Login']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
