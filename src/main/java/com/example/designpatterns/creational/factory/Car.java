package com.example.designpatterns.creational.factory;

// Car 클래스
class Car implements Product {
  @Override
  public void use() {
    System.out.println("Driving a car");
  }
}
