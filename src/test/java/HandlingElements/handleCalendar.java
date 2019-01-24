package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class handleCalendar {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='travel_date']")).click();
        List<WebElement> date =driver.findElements(By.xpath("//td[@class='day']"));
        int count=date.size();
        System.out.println(count);
        for (int i=0;i<count;i++)
        {
            String text=driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();
            if (text.equalsIgnoreCase("22"))
            {
                driver.findElements(By.xpath("//td[@class='day']")).get(i).click();
                break;
             }
            }

        /*double random = Math.random() * 29 + 1;
        date.get((int) random).click();
        System.out.println("Hello");*/
    }
}
