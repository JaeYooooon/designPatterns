package com.example.designpatterns.creational.factory;

// Factory 클래스
class ProductFactory {
  public static Product createProduct(String type) {
    if (type.equals("Car")) {
      return new Car();
    } else if (type.equals("Bike")) {
      return new Bike();
    }
    throw new IllegalArgumentException("Unknown product type: " + type);
  }
}
