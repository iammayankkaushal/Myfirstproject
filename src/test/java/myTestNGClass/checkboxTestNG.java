package myTestNGClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class checkboxTestNG {
    public static WebDriver driver;
    @Test(groups = {"smoke"})
    public void checkbox()
    {
        driver.findElement(By.xpath("//a[@tabindex='21']")).click();
        driver.findElement(By.xpath("//span[@data-gbfilter-checkbox='{\"attribute\":\"whitelist_categories\",\"value\":\"5122348031\",\"rangeEnd\":\"\",\"rangeStart\":\"\",\"filterType\":\"checkboxes\"}']/div[@class='a-checkbox checkbox a-spacing-micro']/label/input[@type='checkbox']")).click();

    }
}
