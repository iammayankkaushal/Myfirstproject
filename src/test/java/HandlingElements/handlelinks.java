package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class handlelinks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //System.out.println(driver.findElements(By.tagName("a")).size());
        //System.out.println("Links in footer");
        String beforeclik=driver.getTitle();
        WebElement footer=driver.findElement(By.xpath("//div[@class='navLeftFooter nav-sprite-v1']"));
        int fsize=footer.findElements(By.tagName("a")).size();
        System.out.println(fsize);
       // System.out.println("Print values");
        /*for (int i=0;i<fsize;i++)
        {
            System.out.println(footer.findElements(By.tagName("a")).get(i).getText());
        }*/
        //Click on last link of footer
        for (int i=0;i<fsize;i++)
        {
            String lname=footer.findElements(By.tagName("a")).get(i).getText();
            if (lname.contains("Interest-Based Ads"))
            {
                footer.findElements(By.tagName("a")).get(i).click();
                break;
            }
        }
        String afterclick=driver.getTitle();
        if (beforeclik!=afterclick)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }


    }
}
