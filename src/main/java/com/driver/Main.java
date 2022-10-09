package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj = new RWOnly();
//  obj.name = "Name";
     obj.setName("AccioJob");
     System.out.println(obj.getName());
  }
}