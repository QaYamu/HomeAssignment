package com.testing.pagefactory1;

import java.util.logging.Logger;

public class DosaHelper {

  private static final Logger logger = Logger.getLogger(DosaHelper.class.getName());

  public static void makeBatter(){
    logger.info("Making Batter");
  }

  public static void ferment(){
  logger.info("Ferment");
  }

  public static void heatTava(){
    logger.info("Heat Tava");
  }

  public static void pourbatter(){
    logger.info("Pourbatter");
  }

}
