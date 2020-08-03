package com.company;

public class Circle {

  private double radius = 1.0 ;
  private String color  = "red";

  public Circle() {
    this.radius = radius;
    color = "red";
  }

  public Circle(double r){
    this.radius = r;
    color = "red";
  }

  public Circle(double r, String c){
    this.radius = r;
    color = c;
  }

  public String getColor(){
    return color;
  }

  public double getRadius() {

    return radius;
  }

  public double getArea() {

    return radius * radius * Math.PI;
  }

public void setColor(String newColor){
    color = newColor;
}
public void setRadius(double newRadius){
    this.radius = newRadius;
}
public String toString(){

    return "Circle[radius = " + radius + " color=" + color + "]";
}
}