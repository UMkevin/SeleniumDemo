import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @ClassName windows
 * @Description windows
 * @Author Kevin Ge
 * @Date 2020/7/6 19:04
 * @Version 1.0
 */
public class windows {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
        //����������
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://www.baidu.com");
        //��õ�ǰ���ھ��
        String sreach_handle = driver.getWindowHandle();
        //�򿪰ٶ�ע�ᴰ��
        System.out.println(sreach_handle);
        driver.findElement(By.linkText("��¼")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("����ע��")).click();
        //������д��ھ��
        Set<String> handles = driver.getWindowHandles();
        //�ж��Ƿ�Ϊע�ᴰ�ڣ�������ע�ᴰ���ϵ�Ԫ��
        for (String handle : handles) {
            if (handle.equals(sreach_handle) == false) {
                //�л���ע��ҳ��
                driver.switchTo().window(handle);
                System.out.println("now register window!");
                Thread.sleep(2000);
                driver.findElement(By.name("userName")).clear();
                driver.findElement(By.name("userName")).sendKeys("kevinge23345");
                driver.findElement(By.name("phone")).sendKeys("13770802866");
                //ʹ��tab �����������봦  ����Ԫ�ز��ɼ�
                driver.findElement(By.name("phone")).sendKeys(Keys.TAB,"Geqku1234");
                Thread.sleep(2000);
                //......
                //�رյ�ǰ����
                driver.close();
            }
        }
        //�ж��Ƿ�Ϊ�ٶ���ҳ����������ҳ�ϵ�Ԫ��
        for (String handle : handles) {
            if (handle.equals(sreach_handle)) {
                //�л���ע��ҳ��
                driver.switchTo().window(handle);
                Thread.sleep(2000);
                driver.findElement(By.className("close-btn")).click();
                System.out.println("now baidu sreach page!");
                driver.findElement(By.id("kw")).sendKeys("webdriver");
                driver.findElement(By.id("su")).click();
                Thread.sleep(2000);
            }
        }
        driver.quit();
    }
}
