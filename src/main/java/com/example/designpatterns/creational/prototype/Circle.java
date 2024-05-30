package com.example.designpatterns.creational.prototype;


public class Circle implements Prototype {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  @Override
  public Circle clone() {
    return new Circle(this.radius);
  }

  @Override
  public String toString() {
    return "Circle [radius=" + radius + "]";
  }
}