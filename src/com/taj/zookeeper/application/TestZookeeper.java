package com.taj.zookeeper.application;

import com.taj.zookeeper.mammals.bat.Bat;
import com.taj.zookeeper.mammals.gorilla.Gorilla;

public class TestZookeeper {
  public static void main(String[] args) {
    Gorilla gorilla = new Gorilla("Harambe");

//    gorilla.throwSomething().throwSomething().throwSomething()
//      .eatBananas(2)
//      .climb();

    Bat bat = new Bat("Pazuzu");

    bat.attackTown().attackTown().attackTown()
      .eatHumans(2)
      .fly();
  }
}
