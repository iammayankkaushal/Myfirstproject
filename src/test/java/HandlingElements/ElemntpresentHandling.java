package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ElemntpresentHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        int amazomappcontest=driver.findElements(By.xpath("//area[@alt='Amazon App Contest']")).size();
        if (amazomappcontest==0)
        {
            System.out.println("Not present");
        }
        else
        {
            System.out.println("Present");
        }

    }

}
