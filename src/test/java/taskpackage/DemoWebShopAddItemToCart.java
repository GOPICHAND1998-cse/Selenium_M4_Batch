package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopAddItemToCart
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://demowebshop.tricentis.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[@href='/login']"))
                    .click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='Email']"))
                    .sendKeys("dummymail11@gmail.com");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='Password']"))
                    .sendKeys("Password");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@value='Log in']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("(//a[normalize-space()='Books'])[1]"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[text()='Computing and Internet']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']"))
                    .click();

            Thread.sleep(4000);

            driver.findElement(By.xpath("//li[@id='topcartlink']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='removefromcart']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[contains(@value,'Update')]"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
