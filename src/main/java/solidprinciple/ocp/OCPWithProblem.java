package solidprinciple.ocp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
Problem with this code is, if we want to add other browser type, we have to touch the existing working code
thats the good approach and that is contradicting with ocp

ocp - shold be open for extension but closed for modification.
 */
public class OCPWithProblem {

  public WebDriver getBrowser(String BrowserName ){

    WebDriver driver = null;
    switch (BrowserName){
      case "Chrome":
        driver = new ChromeDriver();
        break;
      case "Firefox":
        driver = new FirefoxDriver();
        break;
      default:
        throw new IllegalArgumentException("Browser name is not supported");
    }

    return driver;

  }


}
