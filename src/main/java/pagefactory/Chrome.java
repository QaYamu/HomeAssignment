package pagefactory;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements Browser {
  private static final Logger logger = Logger.getLogger(BrowserFactory.class.getName());
  @Override
  public  WebDriver launchBrowser() {
    logger.info("Launching chrome browser");
    WebDriver driver = new ChromeDriver();
    return driver;
  }
}
