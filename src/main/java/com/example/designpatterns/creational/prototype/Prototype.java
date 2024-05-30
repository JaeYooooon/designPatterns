package com.example.designpatterns.creational.prototype;

/*
프로토타입(Prototype) 패턴이란?
프로토타입 패턴은 기존 객체를 복사하여 새로운 객체를 생성하는 패턴입니다.
이 패턴은 새로운 객체를 생성하는 비용이 많이 들거나 복잡한 경우에 유용합니다.

프로토타입 패턴을 사용하는 이유?
1. 객체 생성 비용을 줄일 수 있습니다.
2. 객체 생성의 복잡성을 줄일 수 있습니다.
3. 런타임 시 동적으로 객체를 생성할 수 있습니다.

코드 예제:
- Prototype 인터페이스는 클론 메서드를 정의합니다.
- Circle과 Rectangle 클래스는 Prototype 인터페이스를 구현하고, 클론 메서드를 통해 자신을 복사합니다.
*/

public interface Prototype {
  Prototype clone();
}
