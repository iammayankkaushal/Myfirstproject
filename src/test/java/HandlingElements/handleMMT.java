package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class handleMMT {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.xpath("//label[@for='switch__input_2']")).click();
        driver.findElement(By.xpath("(//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input'])[1]")).click();
        List<WebElement> start=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']"));
        int count=start.size();
        for (int i=0;i<count;i++)
        {
            String text=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']")).get(i).getText();
            System.out.println(text);
            if (text.contains("Goa, India"))
            {
                driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']")).get(i).click();
                break;
            }
        }
        List<WebElement> end=driver.findElements(By.xpath("//ul[@id='ui-id-2']/li[@class='ui-menu-item']"));
        for (int i=0;i<end.size();i++)
        {
            String text=driver.findElements(By.xpath("//ul[@id='ui-id-2']/li[@class='ui-menu-item']")).get(i).getText();
            if (text.contains("Bangalore"))
            {
                driver.findElements(By.xpath("//ul[@id='ui-id-2']/li[@class='ui-menu-item']")).get(i).click();
                break;
            }

        }
        driver.findElement(By.xpath("(//*[text()='18'])[1]")).click();
        driver.findElement(By.xpath("//div[@class='inputM inputHlp inputDateFilter']/input[@class='checkSpecialCharacters']")).click();
        driver.findElement(By.xpath("(//*[text()='12'])[4]")).click();
        driver.findElement(By.xpath("//div[@class='inputM visited pax_count pot']")).click();
        List<WebElement> passenger_count=driver.findElements(By.xpath("//ul[@class='adult_counter']/li"));
        passenger_count.get(3).click();
        driver.findElement(By.xpath("//span[@id='economy']")).click();
        driver.findElement(By.xpath("//button[@id='searchBtn']")).click();
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\kaush\\OneDrive\\Desktop\\SS\\screenshot.png"));




    }
}
