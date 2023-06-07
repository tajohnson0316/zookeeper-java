package com.taj.zookeeper.mammals;

public class Mammal {
  protected String name;
  protected int energy;

  public Mammal () {
    this.name = "Some mammal";
    this.energy = 100;
  }

  public Mammal(String name) {
    this.name = name;
    this.energy = 100;
  }

  public void displayCurrentEnergy() {
    System.out.printf("%s's current energy level: %d%n", this.name, this.energy);
  }

  public void displayPreviousEnergy(int previousEnergy) {
    System.out.printf("%s's previous energy level: %d%n", this.name, previousEnergy);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getEnergy() {
    return energy;
  }

  public void setEnergy(int energy) {
    this.energy = energy;
  }
}
