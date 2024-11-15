package com.testing.Week1HomeAssignment.pagefactory;


public class DataProviderFactory {

  public static TestDataProvider getTestDataProvider(DataSource dataSourceType) {

    switch(dataSourceType) {

      case API:
        return new APIDataProvider();
      case FAKER:
        return new FakerDataProvider();
      case DATABASE:
        return new DatabaseDataProvider();
      case HARDCODED:
        return new HardCodedDataProvider();
      case EXCEL:
        return new ExcelDataProvider();
      default:
        throw new IllegalArgumentException("Unsupported data source type: " + dataSourceType);
    }
  }

}
