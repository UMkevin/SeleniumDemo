import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @ClassName screenShot
 * @Description screenShot
 * @Author Kevin Ge
 * @Date 2020/7/16 11:12
 * @Version 1.0
 */
public class screenShot {

    public static void main(String[] args){

        System.setProperty("webdriver.ie.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\IEDriverServer_32.exe");

        WebDriver driver= new InternetExplorerDriver();


        driver.get("http://www.baidu.com/");
        try {
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile,new File("d:\\screenshot.png"));
        } catch (Exception e) { e.printStackTrace();
        }

        driver.quit();
    }
}
