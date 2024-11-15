package solidprinciple.ocp;

public class TestBrowser {

  public static void main(String[] args) {
    BrowserFactory.getBrowser(new Chrome());
  }

}
