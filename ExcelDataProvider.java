package com.testing.Week1HomeAssignment.pagefactory;

import java.util.logging.Logger;

public class ExcelDataProvider implements TestDataProvider{

  private static final Logger logger = Logger.getLogger(ExcelDataProvider.class.getName());

  @Override
  public void getData(String key) {
    logger.info(key + " Executed with Excel Data");

  }
}
