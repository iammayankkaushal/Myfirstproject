package HandlingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class handleCricbuzz {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.cricbuzz.com/");
        List<WebElement> lscore=driver.findElements(By.xpath("//div[@class='cb-col cb-col-25 cb-mtch-blk']"));
        lscore.get(2).click();
        driver.findElement(By.xpath("(//a[@class='cb-nav-tab '])[1]")).click();
        WebElement table_content1=driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]"));
        table_content1.getAttribute("innerHTML");
        List<WebElement> score=table_content1.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]"));
        int count=score.size();
        for (int i=0;i<count-8;i++)
        {
            int sum=0;
            String value=score.get(i).getText();
            int value_integer=Integer.parseInt(value);
            sum=sum+value_integer;
            System.out.println(sum);
        }

    }
}
