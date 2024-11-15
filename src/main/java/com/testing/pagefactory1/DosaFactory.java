package com.testing.pagefactory1;

public class DosaFactory {

  public static void prepareDosa() {
    DosaHelper.makeBatter();
    DosaHelper.ferment();
    DosaHelper.heatTava();
    DosaHelper.pourbatter();

  }

  public static Dosa CreateDosa(DosaTypes types) {

    prepareDosa();

    switch (types) {

      case PODI :
        return new PodiDosa();

      case ONION:
        return new OnionDosa();

      default:
        throw new IllegalArgumentException("Dosa type not supported");
    }


  }

}
