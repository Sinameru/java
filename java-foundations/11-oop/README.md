# OOP

This document covers the essentials of Java Object-Oriented Programming (OOP) for certification study. Java OOP focuses on **classes, objects, inheritance, and the distinction between static and instance members**.

---

## 1. Classes and Objects

* **Class:** Blueprint or template for creating objects.

* **Object:** Instance of a class.

* **Syntax:**

```java
public class Car {
    String model;
    int year;

    void displayInfo() {
        System.out.println(model + " - " + year);
    }
}

// Creating objects
Car car1 = new Car();
car1.model = "Toyota";
car1.year = 2020;
car1.displayInfo();
```

* **Key points:**

    * Class defines **fields (variables)** and **methods (functions)**.
    * Objects are **instances of classes** and hold their own state.

---

## 2. Constructors

* **Definition:** Special methods used to **initialize objects** when they are created.

* **Characteristics:**

    * Same name as the class
    * No return type
    * Can be overloaded

* **Syntax:**

```java
public class Car {
    String model;
    int year;

    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

Car car1 = new Car("Honda", 2021);
```

* **Key points:**

    * `this` keyword refers to the **current object**.
    * Default constructor is provided by Java if none is defined.

---

## 3. Inheritance

* **Definition:** Mechanism for a class to **acquire properties and methods** from another class.
* **Syntax:**

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle starting");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car honking");
    }
}

Car myCar = new Car();
myCar.start(); // inherited from Vehicle
myCar.honk();  // own method
```

* **Key points:**

    * `extends` keyword is used for single inheritance.
    * Inherited members can be **overridden**.

---

## 4. Static vs Instance Members

* **Instance members:** Belong to objects; each object has its own copy.

* **Static members:** Belong to the class; shared by all objects.

* **Example:**

```java
public class Counter {
    int instanceCount = 0;    // instance variable
    static int staticCount = 0; // static variable

    void increment() {
        instanceCount++;
        staticCount++;
    }
}

Counter c1 = new Counter();
c1.increment();
Counter c2 = new Counter();
c2.increment();

System.out.println(c1.instanceCount); // 1
System.out.println(c2.instanceCount); // 1
System.out.println(Counter.staticCount); // 2
```

* **Key points:**

    * Use `static` for class-level members, constants, and utility methods.
    * Instance members store individual object state.

---

## Summary

* **Classes and Objects:** Define structure and behavior; objects are instances.
* **Constructors:** Initialize objects; can be overloaded.
* **Inheritance:** Allows reusing and extending behavior of another class.
* **Static vs Instance:** Determines whether members belong to the class or individual objects.

Understanding these concepts is fundamental for **Java OOP and certification exams**.
