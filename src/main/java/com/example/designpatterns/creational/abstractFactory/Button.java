package com.example.designpatterns.creational.abstractFactory;

/*
추상 팩토리(Abstract Factory) 패턴이란?
추상 팩토리 패턴은 관련 객체들의 집합을 생성하는 인터페이스를 제공하는 패턴입니다.
구체적인 클래스는 서브클래스에서 정의합니다.

추상 팩토리 패턴을 사용하는 이유?
1. 관련 객체들을 그룹화하여 생성할 수 있습니다.
2. 구체적인 클래스를 클라이언트 코드에서 분리할 수 있습니다.
3. 제품군을 쉽게 확장할 수 있습니다.

코드 예제:
*/

public interface Button {
  void paint();
}
