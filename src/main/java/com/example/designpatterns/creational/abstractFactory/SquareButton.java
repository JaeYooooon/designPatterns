package com.example.designpatterns.creational.abstractFactory;

public class SquareButton implements Button {
  @Override
  public void paint() {
    System.out.println("square button");
  }
}
