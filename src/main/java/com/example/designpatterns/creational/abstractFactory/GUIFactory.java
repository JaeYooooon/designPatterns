package com.example.designpatterns.creational.abstractFactory;
/*
    GUIFactory 인터페이스는 관련 객체(Button)를 생성하는 메서드를 정의합니다.
    RoundButtonFactory와 SquareButtonFactory 클래스는 GUIFactory 인터페이스를 구현하여 각각 원형 버튼과 사각형 버튼을 생성합니다.
 */
public interface GUIFactory {
  Button createButton();
}

class RoundButtonFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new RoundButton();
  }
}

class SquareButtonFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new SquareButton();
  }
}