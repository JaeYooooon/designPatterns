package com.example.designpatterns.creational;

/*
팩토리(Factory) 패턴이란?
팩토리 패턴은 객체 생성의 책임을 가진 클래스를 통해 객체를 생성하는 패턴이다.

팩토리 패턴을 사용하는 이유?
팩토리 패턴을 사용함으로써 얻을 수 있는 이점 중 하나는 객체 생성 로직을 캡슐화하여 코드의 유지 보수성을 높일 수 있다는 것이다.
또한, 새로운 클래스가 추가되더라도 기존 코드를 거의 수정하지 않아도 되기 때문에 확장성이 뛰어나다.

장점:
1. 객체 생성 로직을 한곳에서 관리할 수 있다.
2. 새로운 클래스 추가 시 기존 코드를 거의 수정하지 않아도 된다.
3. 코드의 재사용성을 높이고, 유지 보수성을 향상시킨다.

단점:
1. 클래스가 많아지면 코드가 복잡해질 수 있다.
2. 간단한 객체 생성에는 오히려 불필요한 코드가 추가될 수 있다.

코드 예제:
*/

// Product 인터페이스
interface Product {
  void use();
}

// Car 클래스
class Car implements Product {
  @Override
  public void use() {
    System.out.println("Driving a car");
  }
}

// Bike 클래스
class Bike implements Product {
  @Override
  public void use() {
    System.out.println("Riding a bike");
  }
}

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

public class Factory {
  public static void main(String[] args) {
    Product car = ProductFactory.createProduct("Car");
    car.use();
    Product bike = ProductFactory.createProduct("Bike");
    bike.use();

    try {
      Product unknown = ProductFactory.createProduct("Plane");
      unknown.use();
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage()); // "Unknown product type
    }
  }
}

