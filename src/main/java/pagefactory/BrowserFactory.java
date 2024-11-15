package pagefactory;

import java.util.logging.Logger;
import org.openqa.selenium.UnsupportedCommandException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
  private static final Logger logger = Logger.getLogger(BrowserFactory.class.getName());
  public static WebDriver getDriver(BrowserType type) {

    WebDriver driver = null;

    switch (type) {

      case CHROME:
        logger.info("Chrome driver found");
        driver = new Chrome().launchBrowser();
        break;
      case EDGE:
        logger.info("Edge driver found");
          driver = new Edge().launchBrowser();
          break;
      default:
        logger.info("No Supported browser mentioned");
        throw new UnsupportedCommandException("Unsupported browser type: " + type);
    }

    BrowserHelper.maximizeWindow(driver);
    BrowserHelper.wait(driver);
    BrowserHelper.url(driver);
    return driver;
  }

}
