import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @ClassName baidu
 * @Description baidu
 * @Author Kevin Ge
 * @Date 2020/6/24 15:56
 * @Version 1.0
 */
public class baidu {
    public static void main(String[] args){
        System.out.println("start selenium");
        System.setProperty("webdriver.ie.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\IEDriverServer_32.exe");
        WebDriver driver = new InternetExplorerDriver();
       // WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com/");
        WebElement txtbox= driver.findElement(By.id("kw"));
        txtbox.sendKeys("selenium java");

        WebElement btn =driver.findElement(By.id("su"));
        btn.click();

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }

        driver.close();
        System.out.println("End Selenium");
    }
}
