package com.taj.zookeeper.mammals.gorilla;

import com.taj.zookeeper.mammals.Mammal;

public class Gorilla extends Mammal {
  public Gorilla() {
    super("Some gorilla");
  }

  public Gorilla(String name) {
    super(name);
  }

  public Gorilla throwSomething() {
    int previousEnergy = this.energy;
    this.energy -= 5;

    System.out.printf("%s just threw something... You don't want to know what.%n", this.name);
    this.displayPreviousEnergy(previousEnergy);
    this.displayCurrentEnergy();
    System.out.println();

    return this;
  }

  public Gorilla eatBananas(int totalBananas) {
    int previousEnergy = this.energy;

    for (int i = 0; i < totalBananas; i++) {
      this.energy += 10;
    }

    System.out.printf("%s just ate %d banana(s)! They gained %d energy.%n", this.name, totalBananas, totalBananas * 10);
    this.displayPreviousEnergy(previousEnergy);
    this.displayCurrentEnergy();
    System.out.println();

    return this;
  }

  public Gorilla climb() {
    int previousEnergy = this.energy;
    this.energy -= 10;

    System.out.printf("%s just climbed a tree!%n", this.name);
    this.displayPreviousEnergy(previousEnergy);
    this.displayCurrentEnergy();
    System.out.println();

    return this;
  }
}
