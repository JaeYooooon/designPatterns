package com.example.designpatterns.structural.composite;
/*
컴포지트 패턴(Composite Pattern)이란?
컴포지트 패턴은 객체를 트리 구조로 구성하여 부분-전체 계층을 나타내는 패턴입니다. 클라이언트가 단일 객체와 복합 객체를 동일하게 처리할 수 있게 해준다.

컴포지트 패턴을 사용하는 이유?
컴포지트 패턴을 사용하면 클라이언트가 개별 객체와 복합 객체를 동일하게 다룰 수 있으며, 객체 간의 관계를 트리 구조로 쉽게 표현할 수 있다.

장점:
부분-전체 계층 구조 구현: 트리 구조를 통해 부분과 전체를 나타낼 수 있어 구조적인 표현이 가능하다.
단순화: 클라이언트가 단일 객체와 복합 객체를 동일하게 처리할 수 있어 코드가 단순해진다.
유연성: 새로운 타입의 구성 요소를 추가해도 클라이언트 코드에 영향을 주지 않는다.
단점:
복잡성 증가: 구조가 복잡해지면서 관리해야 할 객체가 많아질 수 있다.
모든 구성 요소의 일관된 인터페이스 요구: 모든 구성 요소가 동일한 인터페이스를 가져야 한다는 제약이 있다.
코드 예제:
 */
import java.util.ArrayList;
import java.util.List;

// 구성 요소 인터페이스
interface CarComponent {
  void showDetails();
}

// 단일 부품 클래스 (Leaf)
class CarPart implements CarComponent {
  private String name;

  public CarPart(String name) {
    this.name = name;
  }

  @Override
  public void showDetails() {
    System.out.println("Car Part: " + name);
  }
}

// 복합 부품 클래스 (Composite)
class CarComposite implements CarComponent {
  private List<CarComponent> components = new ArrayList<>();
  private String name;

  public CarComposite(String name) {
    this.name = name;
  }

  public void add(CarComponent component) {
    components.add(component);
  }

  public void remove(CarComponent component) {
    components.remove(component);
  }

  @Override
  public void showDetails() {
    System.out.println("Car Composite: " + name);
    for (CarComponent component : components) {
      component.showDetails();
    }
  }
}

public class Composite {
  public static void main(String[] args) {
    // 단일 부품 생성
    CarPart wheel = new CarPart("Wheel");
    CarPart engine = new CarPart("Engine");
    CarPart door = new CarPart("Door");

    // 복합 부품 생성 및 단일 부품 추가
    CarComposite carBody = new CarComposite("Car Body");
    carBody.add(door);

    CarComposite car = new CarComposite("Car");
    car.add(wheel);
    car.add(engine);
    car.add(carBody);

    car.showDetails();
    // 출력:
    // Car Composite: Car
    // Car Part: Wheel
    // Car Part: Engine
    // Car Composite: Car Body
    // Car Part: Door
  }
}
