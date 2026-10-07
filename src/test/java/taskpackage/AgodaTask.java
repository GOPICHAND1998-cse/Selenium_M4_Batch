package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgodaTask
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.agoda.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@data-element-name='flight-tab']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@data-element-name='flight-departure']"))
                    .click();

            Thread.sleep(2000);

            while(true)
            {
                String month= driver.findElement(By.xpath("//div[@id='calendar-header']//div[contains(@class,'afcde-flex afcde-gap-8')]"))
                        .getText();

                if (month.contains("January"))
                {
                    Thread.sleep(2000);

                    driver.findElement(By.xpath("//div[@id='calendar-header']/..//p[text()='31']"))
                            .click();
                    break;
                }

                Thread.sleep(2000);

                driver.findElement(By.xpath("//button[@aria-label='Go to the Next Month']"))
                        .click();

            }



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
