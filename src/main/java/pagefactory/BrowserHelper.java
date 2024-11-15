package pagefactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class BrowserHelper {

  public static void maximizeWindow(WebDriver driver) {

    driver.manage().window().maximize();
  }

  public static void wait(WebDriver driver) {

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }

  public static void url(WebDriver driver) {

    driver.get("https://www.google.com");
  }

}
