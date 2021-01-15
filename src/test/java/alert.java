import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

/**
 * @ClassName alert
 * @Description alert
 * @Author Kevin Ge
 * @Date 2020/7/7 9:54
 * @Version 1.0
 */
public class alert   {
    public static void main(String [] args)throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://www.baidu.com/");



        //�����ͣ��"����"����
        Actions ac =new Actions(driver);
       // ac.clickAndHold(driver.findElement(By.className("s-user-setting-pfmenu"))).perform();
        ac.clickAndHold(driver.findElement(By.xpath("//*[@id=\"s-usersetting-top\"]"))).perform();
        //WebElement we=driver.findElement(By.id("search-key"));
        //ac.moveToElement(we).perform();
        //ac.clickAndHold(we).perform();


        Thread.sleep(3000);
        //����������
       driver.findElement(By.className("setpref")).click();
       // driver.findElement(By.linkText("��������")).click();




        //��������
        driver.findElement(By.linkText("��������")).click();

        //���յ���
        driver.switchTo().alert().accept();

        driver.quit();
    }
}
