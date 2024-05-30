package com.example.designpatterns.creational.prototype;

public class PrototypeDemo {
  public static void main(String[] args) {
    // 원본 객체 생성
    Circle circle1 = new Circle(10);
    Rectangle rectangle1 = new Rectangle(20, 30);

    // 원본 객체 출력
    System.out.println("Original objects:");
    System.out.println(circle1); // "Circle [radius=10]" 출력
    System.out.println(rectangle1); // "Rectangle [width=20, height=30]" 출력

    // 복제 객체 생성
    Circle circle2 = circle1.clone();
    Rectangle rectangle2 = rectangle1.clone();

    // 복제 객체 출력
    System.out.println("\nCloned objects:");
    System.out.println(circle2); // "Circle [radius=10]" 출력
    System.out.println(rectangle2); // "Rectangle [width=20, height=30]" 출력

    // 원본 객체와 복제 객체 비교
    System.out.println(circle1 == circle2); // false 출력
    System.out.println(rectangle1 == rectangle2); // false 출력
  }
}