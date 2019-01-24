package myTestNGClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class handledropdwntestNG {
    public static WebDriver driver;
    @BeforeSuite
            public void setupfirst()
    {
        WebDriver driver;
    }
    @BeforeMethod
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void dropdwn()
    {
        driver.navigate().to("https://www.amazon.in/");
        WebElement drpdwn=driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        Select a= new Select(drpdwn);
        // a.selectByVisibleText("Alexa Skills");
        List<WebElement> b =a.getOptions();
        System.out.println(b.size());
        int i=1;
        for (WebElement c:b)
        {
            System.out.println(i+"="+c.getText());
            i++;
        }
    }
    @Test(groups = {"smoke"})
    public void dropdwndynamic()
    {
        driver.findElement(By.xpath("//a[@tabindex='21']")).click();
        driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
        driver.findElement(By.xpath("//ul[@class='a-nostyle a-list-link']/li[position()=2]")).click();
    }

    @AfterMethod
    public void closebrowser()
    {
        driver.close();
    }

}
