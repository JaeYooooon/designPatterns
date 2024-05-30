package com.example.designpatterns.creational.prototype;

public class Rectangle implements Prototype {
  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  @Override
  public Rectangle clone() {
    return new Rectangle(this.width, this.height);
  }

  @Override
  public String toString() {
    return "Rectangle [width=" + width + ", height=" + height + "]";
  }
}
