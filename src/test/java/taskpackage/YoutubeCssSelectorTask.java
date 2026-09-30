package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeCssSelectorTask
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.youtube.com/");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input.ytSearchboxComponentInput.yt-searchbox-input.title"))
                    .sendKeys("Dude orchestral suite");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("button[aria-label='Search'][title='Search']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("a[aria-label='Dude – Orchestral Suite 2 minutes, 6 seconds']"))
                    .click();

            Thread.sleep(2000);

            driver.manage().window().fullscreen();
        }
        catch (Exception e)
        {
            e.printStackTrace();

        }

    }
}
