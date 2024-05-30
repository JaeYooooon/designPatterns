package com.example.designpatterns.creational.builder;

/*
빌더 패턴이란?
빌더 패턴은 복잡한 객체의 생성 과정을 단계별로 나누어 처리할 수 있도록 하는 생성 패턴 중 하나입니다.
주로 객체의 생성 과정이 복잡하거나, 다양한 구성 옵션이 필요한 경우에 사용됩니다.

빌더 패턴을 사용하는 이유
1. 복잡한 객체의 생성 과정을 단순화하고, 코드의 가독성을 높일 수 있습니다.
2. 객체 생성 시 다양한 옵션을 제공하여 유연성을 높입니다.
3. 객체의 일관성을 유지할 수 있습니다.

코드 예제
*/
public class Builder {
  public static void main(String[] args) {
    // Computer 객체 생성
    Computer comp1 = new Computer.ComputerBuilder("Intel i7", "16GB")
        .setGraphicsCardEnabled(true)
        .setBluetoothEnabled(true)
        .build();

    Computer comp2 = new Computer.ComputerBuilder("AMD Ryzen 5", "8GB")
        .setGraphicsCardEnabled(false)
        .setBluetoothEnabled(true)
        .build();

    System.out.println(comp1); // "Computer [CPU=Intel i7, RAM=16GB, GraphicsCard=true, Bluetooth=true]"
    System.out.println(comp2); // "Computer [CPU=AMD Ryzen 5, RAM=8GB, GraphicsCard=false, Bluetooth=true]"
  }
}
