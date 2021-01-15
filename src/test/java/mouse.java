import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

/**
 * @ClassName mouse
 * @Description mouse
 * @Author Kevin Ge
 * @Date 2020/6/28 16:20
 * @Version 1.0
 */
public class mouse {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
        //把浏览器最大化
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(options);
        driver.get("http://www.baidu.com/");

        Actions ac = new Actions(driver);
        ac.clickAndHold(driver.findElement(By.xpath("//*[@id=\"s-usersetting-top\"]"))).perform();
         try{
             Thread.sleep(3000);
         }catch (Exception e){

         }

          WebElement source =driver.findElement(By.xpath("//*[@id=\"hotsearch-content-wrapper\"]/li[5]/a"));

        WebElement target= driver.findElement(By.id("kw"));


        ac.dragAndDrop(source,target).perform();

         driver.close();
    }

}
