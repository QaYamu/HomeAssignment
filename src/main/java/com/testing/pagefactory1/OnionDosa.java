package com.testing.pagefactory1;

import java.util.logging.Logger;

public class OnionDosa implements Dosa{

  private static final Logger logger= Logger.getLogger(OnionDosa.class.getName());

  @Override
  public boolean spreadFlavours() {
    System.out.println("Onion applied around the corners");
    return true;
  }
}
