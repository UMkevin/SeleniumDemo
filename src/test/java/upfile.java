import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @ClassName upfile
 * @Description upfile
 * @Author Kevin Ge
 * @Date 2020/7/8 17:00
 * @Version 1.0
 */
public class upfile {
    public static void main(String[] args)throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver  driver = new ChromeDriver(options);
        File file = new File("F:\\upfile.html");
        String filepath =file.getAbsolutePath();
        driver.get(filepath);

        //上传文件
        driver.findElement(By.name("file")).sendKeys("F:\\data-collection-unit\\pom.xml");

        Thread.sleep(3000);
        driver.quit();
    }
}
