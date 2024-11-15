package com.testing.pagefactory1;

import java.util.logging.Logger;

public class MasalaDosa implements Dosa{

  private static final Logger logger= Logger.getLogger(MasalaDosa.class.getName());

  @Override
  public boolean spreadFlavours() {
    logger.info("masala applied around the corners");
    return true;
  }
}
