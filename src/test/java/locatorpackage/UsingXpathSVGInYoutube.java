package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathSVGInYoutube
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.youtube.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='search_query']"))
                    .sendKeys("transformers one optimus prime vs megatron");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@title='Search']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Orion Pax becomes OPTIMUS PRIME ')]"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
