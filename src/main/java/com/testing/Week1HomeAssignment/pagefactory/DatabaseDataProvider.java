package com.testing.Week1HomeAssignment.pagefactory;

import java.util.logging.Logger;

public class DatabaseDataProvider implements TestDataProvider{

  private static final Logger logger = Logger.getLogger(DatabaseDataProvider.class.getName());

  @Override
  public void getData(String key) {
    logger.info(key + " Executed with database Data");

  }
}
