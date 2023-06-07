package com.taj.zookeeper.mammals.bat;

import com.taj.zookeeper.mammals.Mammal;

public class Bat extends Mammal {
  public Bat() {
    super("A bat");
    this.energy = 300;
  }

  public Bat(String name) {
    super(name);
    this.energy = 300;
  }

  public Bat fly() {
    int previousEnergy = this.energy;
    this.energy -= 50;

    System.out.printf("%s flew into the air!%n", this.name);
    this.displayPreviousEnergy(previousEnergy);
    this.displayCurrentEnergy();
    System.out.println();

    return this;
  }

  public Bat eatHumans(int totalHumans) {
    int previousEnergy = this.energy;

    for (int i = 0; i < totalHumans; i++) {
      this.energy += 25;
    }

    System.out.printf("%s just ate %d human(s)! Oh, the horror!%n", this.name, totalHumans);
    this.displayPreviousEnergy(previousEnergy);
    this.displayCurrentEnergy();
    System.out.println();

    return this;
  }

  public Bat attackTown() {
    int previousEnergy = this.energy;
    this.energy -= 100;

    System.out.printf("%s just attacked the town! Oh god, there's fire everywhere D:%n", this.name);
    this.displayPreviousEnergy(previousEnergy);
    this.displayCurrentEnergy();
    System.out.println();

    return this;
  }
}
