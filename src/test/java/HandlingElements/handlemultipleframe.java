package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class handlemultipleframe {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        int frame_number=findframenumber(driver,By.xpath("//img[@alt='Amazon Kindle Paperwhite']"));
        driver.switchTo().frame(frame_number);
        System.out.println((driver.getTitle()));


        //Move to default content

        // int frame step again to click on another element present inside a diff frame


    }
    public  static  int  findframenumber(WebDriver driver,By by)
    {
        int i;
        int frame_count=driver.findElements(By.tagName("iframe")).size();
        for ( i=0;i<frame_count;i++)
        {
            driver.switchTo().frame(i);
            int count=driver.findElements(by).size();
            if (count>0)
            {
                driver.findElement(by).click();
                break;
            }
            else
            {
                System.out.println("Continue Looping");
            }
        }
        driver.switchTo().defaultContent();
        return i;

    }
}
