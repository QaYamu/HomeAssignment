package com.testing.Week1HomeAssignment.pagefactory;

import java.util.logging.Logger;

public class FakerDataProvider implements TestDataProvider{

  private static final Logger logger = Logger.getLogger(FakerDataProvider.class.getName());

  @Override
  public void getData(String key) {
    logger.info(key +" Executed with Faker Data");

  }
}
