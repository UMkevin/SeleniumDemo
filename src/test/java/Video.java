import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @ClassName Video
 * @Description Video
 * @Author Kevin Ge
 * @Date 2020/7/16 10:35
 * @Version 1.0
 */
public class Video {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver= new ChromeDriver(options);

        driver.get("http://www.videojs.com/");
        WebElement video =driver.findElement(By.id("vjs_video_3113"));

        JavascriptExecutor jse =(JavascriptExecutor)driver;


        //获得视频的URL
        jse.executeScript("return arguments[0].currentSrc;",video);

        //播放视频15秒
        jse.executeScript("return arguments[0].play()",video);
        Thread.sleep(15000);

        //暂停视频播放
        jse.executeScript("return arguments[0].pause()",video);


        driver.quit();

    }
}
