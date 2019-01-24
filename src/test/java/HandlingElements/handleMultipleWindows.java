package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class handleMultipleWindows {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__create-account']")).click();
        System.out.println(driver.getTitle());
        Set<String> ids =driver.getWindowHandles();
        System.out.println(ids.size());
        Iterator<String> id= ids.iterator();
        String parent_id=id.next();
        String child_id=id.next();
        driver.switchTo().window(child_id);
        driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=en-GB']")).click();
        System.out.println(driver.getTitle());
        driver.switchTo().window(parent_id);
        driver.findElement(By.xpath("//a[@data-g-label='For work']")).click();

    }
}
