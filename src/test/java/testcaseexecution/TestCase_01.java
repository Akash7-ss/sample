package testcaseexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_01 {
@Test
public void create() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
}
}
d