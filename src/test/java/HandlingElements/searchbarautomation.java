package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class searchbarautomation {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchbar=driver.findElement(By.xpath("//div[@class='nav-search-field ']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(searchbar);
        actions.click();
        actions.sendKeys("Firestick");
        actions.build().perform();
    }
}
