package com.testing.pagefactory1;

import java.util.logging.Logger;

public class PodiDosa implements Dosa{

  private static final Logger logger= Logger.getLogger(PodiDosa.class.getName());

  @Override
  public boolean spreadFlavours() {
    System.out.println("Podi applied around the corners");
    return true;
  }
}
