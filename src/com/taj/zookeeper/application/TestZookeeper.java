package com.taj.zookeeper.application;

import com.taj.zookeeper.mammals.gorilla.Gorilla;

public class TestZookeeper {
  public static void main(String[] args) {
    Gorilla gorilla = new Gorilla("Harambe");

    gorilla.throwSomething().throwSomething().throwSomething()
      .eatBananas(2)
      .climb();
  }
}
