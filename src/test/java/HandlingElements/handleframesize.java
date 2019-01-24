package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class handleframesize {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //System.out.println(driver.findElements(By.tagName("iframe")).size());
        WebElement frm=driver.findElement(By.xpath("//iframe[contains(@name,'op-ad-cen')]"));
        driver.switchTo().frame(frm);
        driver.findElement(By.xpath("//img[@alt='Amazon Pantry']")).click();
    }
}
