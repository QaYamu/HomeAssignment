package com.testing.Week1HomeAssignment.pagefactory;

import java.util.logging.Logger;

public class APIDataProvider implements TestDataProvider{

  private static final Logger logger = Logger.getLogger(APIDataProvider.class.getName());

  @Override
  public void getData(String key) {

    logger.info(key + " Executed with API Data");

  }
}
