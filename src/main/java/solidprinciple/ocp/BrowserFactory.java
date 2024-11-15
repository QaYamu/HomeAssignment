package solidprinciple.ocp;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {

  public static WebDriver getBrowser(Browser browserType) {

    return browserType.launchBrowser();



  }

}
