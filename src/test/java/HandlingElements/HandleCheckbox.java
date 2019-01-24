package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandleCheckbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@tabindex='21']")).click();
        driver.findElement(By.xpath("//span[@data-gbfilter-checkbox='{\"attribute\":\"whitelist_categories\",\"value\":\"5122348031\",\"rangeEnd\":\"\",\"rangeStart\":\"\",\"filterType\":\"checkboxes\"}']/div[@class='a-checkbox checkbox a-spacing-micro']/label/input[@type='checkbox']")).click();

    }
}
