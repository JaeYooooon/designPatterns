package com.example.designpatterns.structural.bridge;
/*
브릿지 패턴(Bridge Pattern)이란?
브릿지 패턴은 구현과 추상을 분리하여 독립적으로 변경할 수 있도록 하는 디자인 패턴입니다. 이를 통해 두 계층 구조를 연결하며, 변경이 필요할 때 구조를 쉽게 확장할 수 있다.

브릿지 패턴을 사용하는 이유?
브릿지 패턴을 사용하면 코드의 유연성과 재사용성을 높일 수 있습니다. 구현 부분을 분리하여 각 부분을 독립적으로 수정할 수 있으며, 다양한 구현을 조합하여 사용할 수 있다.

장점:
인터페이스와 구현의 분리: 인터페이스와 구현을 분리하여 각각 독립적으로 확장 및 수정이 가능하다.
유연성: 새로운 구현체를 추가하거나 변경할 때 추상 계층을 변경하지 않아도 된다.
유지보수 용이: 코드의 결합도를 낮추어 유지보수를 쉽게 할 수 있다.
단점:
구조의 복잡성 증가: 패턴을 적용하면서 계층이 늘어나 코드의 구조가 복잡해질 수 있다.
설계 비용: 초기 설계 시 인터페이스와 구현을 분리해야 하므로 설계에 많은 시간을 투자해야 한다.
코드 예제:
*/

// 엔진 인터페이스
interface Engine {
  void start();
}

// 가솔린
class GasolineEngine implements Engine {
  @Override
  public void start() {
    System.out.println("Gasoline engine");
  }
}

// 전기
class ElectricEngine implements Engine {
  @Override
  public void start() {
    System.out.println("Electric engine");
  }
}

// 자동차 추상 클래스
abstract class Car {
  protected Engine engine;

  protected Car(Engine engine) {
    this.engine = engine;
  }

  public abstract void drive();
}

// 현대 자동차
class Hyundai extends Car {

  protected Hyundai(Engine engine) {
    super(engine);
  }

  @Override
  public void drive() {
    System.out.print("Hyundai car with ");
    engine.start();
  }
}

// 테슬라 자동차
class Tesla extends Car {

  protected Tesla(Engine engine) {
    super(engine);
  }

  @Override
  public void drive() {
    System.out.print("Tesla car with ");
    engine.start();
  }
}

// 메인 클래스 - 예제 실행
public class Bridge {
  public static void main(String[] args) {
    // 가솔린 엔진을 장착한 현대 자동차
    Car hyundaiGasoline = new Hyundai(new GasolineEngine());
    hyundaiGasoline.drive();

    // 전기 엔진을 장착한 테슬라 자동차
    Car teslaElectric = new Tesla(new ElectricEngine());
    teslaElectric.drive();

  }
}
