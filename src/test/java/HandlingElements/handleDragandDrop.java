package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class handleDragandDrop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement frme=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frme);
        Actions drg = new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
        drg.dragAndDrop(source,target).build().perform();
    }
}
