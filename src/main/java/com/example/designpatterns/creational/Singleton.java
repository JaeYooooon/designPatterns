package com.example.designpatterns.creational;

/*
싱글톤(Singleton) 패턴이란?
싱글톤 패턴은 특정 클래스의 인스턴스를 1개만 생성되는 것을 보장하는 디자인 패턴이다.
즉, 생성자를 통해서 여러 번 호출이 되더라도 인스턴스를 새로 생성하지 않고 최초 호출 시에 만들어두었던 인스턴스를 재활용하는 패턴이다.

싱글톤 패턴을 사용하는 이유?
싱글톤 패턴을 사용함으로써 얻을 수 있는 이점 중 하나는 메모리 낭비를 방지할 수 있다.

사용자가 1초에 10번 똑같은 요청을 보내면 요청을 처리하기 위한 똑같은 객체를 1초에 10번 생성하고 소멸되는 메모리 낭비 문제가 발생하게 된다.
하지만 싱글톤 패턴을 사용하면 최초 한번 new로 객체를 생성하고 해당 객체를 이후에도 사용하도록 공유(static)하면 메모리 낭비 문제를 방지할 수 있다.

단점:
1. 테스트 어려움: 싱글톤 패턴은 전역 상태를 가지므로, 단위 테스트 시 Mock 객체를 사용하는 등 테스트가 어려울 수 있다.
2. 멀티스레드 환경에서의 문제: 멀티스레드 환경에서는 동기화 문제로 인해 여러 인스턴스가 생성될 수 있다. 이를 해결하기 위해 추가적인 동기화 코드가 필요하다.
3. 구현의 복잡성 증가: 동기화 및 지연 초기화를 구현하려면 코드가 복잡해질 수 있다. 잘못 구현하면 의도하지 않은 결과를 초래할 수 있다.
4. 유연성 저하: 싱글톤 패턴은 인스턴스 생성 방식을 고정화하므로, 나중에 인스턴스 생성 방식을 변경해야 할 때 유연성이 떨어질 수 있다.
5. 디자인 제한: 객체 지향 디자인 원칙 중 하나인 '개방-폐쇄 원칙'에 어긋날 수 있으며, 클래스 간의 결합도를 높이는 결과를 초래할 수 있다.

코드 예제:
*/

public class Singleton {
  // 단일 인스턴스를 위한 정적 변수
  private static Singleton instance;

  // 생성자를 private으로 정의하여 외부에서 인스턴스 생성을 방지
  private Singleton() {}

  // 단일 인스턴스를 반환하는 정적 메서드
  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public void showMessage() {
    System.out.println("Singleton");
  }

  public static void main(String[] args) {
    // 두 개의 인스턴스 요청
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();

    // 두 인스턴스가 동일한지 확인
    if (instance1 == instance2) {
      System.out.println("instance1 = instance2");
    } else {
      System.out.println("instance1 != instance2");
    }

    instance1.showMessage();
    instance2.showMessage();
  }
}
