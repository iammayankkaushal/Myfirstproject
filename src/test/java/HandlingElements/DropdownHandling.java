package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHandling {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
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



    }


