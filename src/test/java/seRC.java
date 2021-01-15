/**
 * @ClassName seRC
 * @Description seRC
 * @Author Kevin Ge
 * @Date 2020/7/17 15:28
 * @Version 1.0
 */
import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class seRC {

    private Selenium selenium;

    @Before
    public void setUp() throws Exception {
        selenium = new DefaultSelenium("localhost", 4444, "*chrome",
                "https://www.baidu.com/");
        selenium.start();
    }

    @Test
    public void testSeRC() throws Exception {
        selenium.open("/");
        selenium.type("id=kw", "selenium");
        selenium.click("id=su");

    }

    @After
    public void tearDown() throws Exception {
        selenium.stop();
    }
}



