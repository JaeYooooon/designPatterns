package com.example.designpatterns.creational.abstractFactory;

public class AbstractFactoryDemo {
  public static void main(String[] args) {
    // 원형 버튼 팩토리 사용
    GUIFactory roundFactory = new RoundButtonFactory();
    Button roundButton = roundFactory.createButton();
    roundButton.paint(); // "round button"

    // 사각형 버튼 팩토리 사용
    GUIFactory squareFactory = new SquareButtonFactory();
    Button squareButton = squareFactory.createButton();
    squareButton.paint(); // "square button"
  }
}