package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USingXpathBySurroundingMMT
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.makemytrip.com/");

            Thread.sleep(6000);

            driver.findElement(By.xpath("//span[@data-cy='closeModal']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//div[contains(@class,'dates inactiveWidget ')]"))
                    .click();

            while(true)
            {
                String monthName = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"))
                        .getText();
                if (monthName.equals("December 2026"))
                {
                    driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/..//p[text()='1']"))
                            .click();

                    break;
                }
                else{

                    Thread.sleep(1000);

                    driver.findElement(By.xpath("//span[@aria-label='Next Month']"))
                            .click();

                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
