// Class A in package apack
package apack;

public class A {
  // default access modifier
  int var1;
  // protected access modifier
  protected int var2;
  // private access modifier
  private int var3;
  // public access modifier
  public int var4;
}

// Class B in package bpack
package bpack;

import apack.A;

public class B extends A {
  public void display() {
    // can access var2 because it has protected access
    System.out.println(var2);
    // can access var4 because it has public access
    System.out.println(var4);
  }
}

// Class C in package cpack
package cpack;

import apack.A;

public class C {
  public void display() {
    A a = new A();
    // can access var4 because it has public access
    System.out.println(a.var4);
  }
}

// Class ProtectedDemo in package dpack
package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
  public static void main(String[] args) {
    B b = new B();
    // can access display method because it has public access
    b.display();
    C c = new C();
    // can access display method because it has public access
    c.display();
  }
}
