package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandleRadiobuttons {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        int rb=driver.findElements(By.xpath("//input[@type='radio' and @name='group1']")).size();
        for (int i=0;i<rb;i++)
        {
            //driver.findElements(By.xpath("//input[@type='radio' and @name='group1']")).get(1).click();
            String text=driver.findElements(By.xpath("//input[@type='radio' and @name='group1']")).get(i).getAttribute("value");
            if (text.equalsIgnoreCase("butter"))
            {
                driver.findElements(By.xpath("//input[@type='radio' and @name='group1']")).get(i).click();
            }
        }
    }

}
