package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Handlingwriteincaptialletters {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchbar.click();
        Actions write=new Actions(driver);
       write.moveToElement(searchbar).click().keyDown(Keys.SHIFT).sendKeys("firestick").build().perform();
        /*write.moveToElement(searchbar).click().keyDown(Keys.SHIFT).sendKeys("doubleclick").doubleClick().build().perform();
        write.moveToElement(searchbar).click().keyDown(Keys.SHIFT).sendKeys("rightclick").contextClick().build().perform();*/
    }
}
