package com.example.designpatterns.creational.abstractFactory;

public class RoundButton implements Button {
  @Override
  public void paint() {
    System.out.println("round button");
  }
}