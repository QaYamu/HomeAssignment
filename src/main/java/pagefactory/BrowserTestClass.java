package pagefactory;

import java.util.logging.Logger;

public class BrowserTestClass {
  private static final Logger logger = Logger.getLogger(BrowserFactory.class.getName());
  public static void main(String[] args) {
    logger.info("im in browserTest class");
    BrowserFactory.getDriver(BrowserType.CHROME);
    logger.info("execution completed");
  }

}
