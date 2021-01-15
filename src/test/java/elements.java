import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @ClassName elements
 * @Description elements
 * @Author Kevin Ge
 * @Date 2020/6/30 18:50
 * @Version 1.0
 */
public class elements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
        //把浏览器最大化
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        File file = new File("F:\\checkOut.html");
        String filePath = file.getAbsolutePath();
        driver.get(filePath);

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        for(WebElement input: inputs){
            String type = new String(input.getAttribute("type"));
            if (type.equals("checkbox")){
                input.click();
                Thread.sleep(3000);
            }
        }
        driver.quit();
    }
}
