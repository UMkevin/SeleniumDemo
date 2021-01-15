import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * @ClassName download
 * @Description download
 * @Author Kevin Ge
 * @Date 2020/7/15 11:02
 * @Version 1.0
 */
public class download {
    public static  void mian(String[]args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver dirver =new ChromeDriver(options);

//        FilefoxProfile filefoxProfile = new FilefoxProfile();

//        firefoxProfile.setPreference("browser.download.folderList",2);
//        firefoxProfile.setPreference("browser.download.manager.showWhenStarting",
//                false);
//        firefoxProfile.setPreference("browser.download.dir","d:\\java");
//        firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","appli
//                cation/octet-stream");
//
//                WebDriver driver = new FirefoxDriver(firefoxProfile);
//        driver.get("https://pypi.Python.org/pypi/selenium");
//        driver.findElement(By.partialLinkText("selenium-2")).click();



    }
}
