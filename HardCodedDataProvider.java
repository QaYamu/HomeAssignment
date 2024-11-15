package com.testing.Week1HomeAssignment.pagefactory;

import java.util.logging.Logger;

public class HardCodedDataProvider implements TestDataProvider{

  private static final Logger logger = Logger.getLogger(HardCodedDataProvider.class.getName());

  @Override
  public void getData(String key) {
    logger.info(key + " Executed with Hardcoded Data");

  }
}
