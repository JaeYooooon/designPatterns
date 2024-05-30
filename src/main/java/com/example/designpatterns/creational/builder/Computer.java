package com.example.designpatterns.creational.builder;

public class Computer {
  // 필수 매개변수
  private String CPU;
  private String RAM;

  // 선택 매개변수
  private boolean isGraphicsCardEnabled;
  private boolean isBluetoothEnabled;

  private Computer(ComputerBuilder builder) {
    this.CPU = builder.CPU;
    this.RAM = builder.RAM;
    this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    this.isBluetoothEnabled = builder.isBluetoothEnabled;
  }

  @Override
  public String toString() {
    return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", GraphicsCard=" + isGraphicsCardEnabled + ", Bluetooth=" + isBluetoothEnabled + "]";
  }

  public static class ComputerBuilder {
    // 필수 매개변수
    private String CPU;
    private String RAM;

    // 선택 매개변수
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public ComputerBuilder(String CPU, String RAM) {
      this.CPU = CPU;
      this.RAM = RAM;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
      this.isGraphicsCardEnabled = isGraphicsCardEnabled;
      return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
      this.isBluetoothEnabled = isBluetoothEnabled;
      return this;
    }

    public Computer build() {
      return new Computer(this);
    }
  }
}

