# Methods

This document covers the essentials of Java methods for certification study. Methods allow you to **encapsulate code into reusable blocks**, improving readability, maintainability, and reducing duplication.

---

## 1. Method Basics

* **Definition:** A method is a block of code that performs a specific task and can be called from other parts of the program.
* **Syntax:**

```java
returnType methodName(parameters) {
    // code block
}
```

* **Key points:**

    * Methods can return a value (`returnType`) or `void` if they don’t return anything.
    * Parameters are inputs to the method.
    * Method name should be descriptive and follow camelCase.

* **Example:**

```java
public class Main {
    public static void main(String[] args) {
        int sum = add(5, 10);
        System.out.println("Sum = " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
```

---

## 2. Method Overloading

* **Definition:** Having multiple methods in the same class with **the same name** but **different parameter lists** (number, type, or order of parameters).

* **Key points:**

    * Return type alone is **not enough** to overload a method.
    * Overloading improves readability and flexibility.

* **Example:**

```java
public class Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
```

---

## 3. Variable Scope and Lifetime

* **Scope:** The region of the program where a variable is accessible.

    * **Local variables:** Declared inside a method; accessible only within that method.
    * **Instance variables (fields):** Declared in a class but outside methods; accessible by all instance methods.
    * **Static variables:** Declared with `static`; shared across all instances of the class.

* **Lifetime:** How long a variable exists in memory.

    * **Local variables:** Exist only while the method executes.
    * **Instance variables:** Exist as long as the object exists.
    * **Static variables:** Exist as long as the program runs.

* **Example:**

```java
public class Example {
    static int staticVar = 10; // shared among all instances
    int instanceVar = 5;       // unique to each object

    public void method() {
        int localVar = 20;     // only exists during this method call
        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
    }
}
```

---

## Summary

* Methods **encapsulate code** for reuse and readability.
* **Overloading** allows multiple methods with the same name but different parameters.
* **Scope and lifetime** define where variables are accessible and how long they exist in memory.
* Understanding these concepts is essential for **writing clean, maintainable Java code**.
