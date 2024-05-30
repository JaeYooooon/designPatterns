package com.example.designpatterns.creational.factory;

// Bike 클래스
class Bike implements Product {
  @Override
  public void use() {
    System.out.println("Riding a bike");
  }
}
