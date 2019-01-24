package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicDropdownHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@tabindex='21']")).click();
        driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
        driver.findElement(By.xpath("//ul[@class='a-nostyle a-list-link']/li[position()=2]")).click();
       /* List<WebElement> drpdwn =driver.findElements(By.xpath("//ul[@class='a-nostyle a-list-link']"));
        for (int i=0;i<drpdwn.size();i++)
        {
            String text=driver.findElements(By.xpath("//ul[@class='a-nostyle a-list-link']")).get(i).getText();
            if (text.equalsIgnoreCase("Best Selling"))
            {
                driver.findElements(By.xpath("//ul[@class='a-nostyle a-list-link']")).get(i).click();
            }
        }*/
    }
}
