package pagefactory;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge implements Browser{
  private static final Logger logger = Logger.getLogger(BrowserFactory.class.getName());

  @Override
  public WebDriver launchBrowser() {
    logger.info("Launching Edge");
    WebDriver driver = new EdgeDriver();
    return driver;
  }

}
