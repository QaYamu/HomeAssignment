package com.testing.Week1HomeAssignment.pagefactory;

public class SeleniumTest {

  public static void main(String[] args) {
   TestDataProvider ts =  DataProviderFactory.getTestDataProvider(DataSource.API);
   ts.getData("SeleniumTest");
  }

}
