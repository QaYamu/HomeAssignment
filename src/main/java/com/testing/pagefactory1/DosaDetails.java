package com.testing.pagefactory1;

public class DosaDetails {

  public static void main(String[] args) {

    Dosa dosa = DosaFactory.CreateDosa(DosaTypes.ONION);
    dosa.spreadFlavours();
  }

}
