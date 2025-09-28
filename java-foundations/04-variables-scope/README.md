# Variables & Scope

In Java, a **variable** is a container that holds data, and **scope** determines where that variable is accessible within the code. Understanding scope helps avoid errors and unexpected behavior.

---

## 🔄 1. Variable Types

Variables in Java can be categorized into:

* **Local variables** – declared inside a method or block, exist only during method execution.
* **Instance variables** – declared inside a class but outside methods, belong to an object.
* **Class variables (static)** – declared with `static` keyword, shared among all objects of the class.

```java
class Example {
static int classVar = 100; // class variable
int instanceVar;           // instance variable

    void method() {
        int localVar = 10; // local variable
        System.out.printf("Local: %d, Instance: %d, Class: %d\n", localVar, instanceVar, classVar);
    }
}
```

Output:

```
Local: 10, Instance: 0, Class: 100
```

---

## ⚠️ 2. Scope Rules

Scope determines where a variable is accessible:

* **Local variables** – only accessible within the method/block they are declared.
* **Instance variables** – accessible in all non-static methods of the class.
* **Class variables** – accessible in all static and non-static methods of the class.

```java
class ScopeDemo {
static int classVar = 5;
int instanceVar = 10;

    void show() {
        int localVar = 20;
        System.out.printf("Local: %d, Instance: %d, Class: %d\n", localVar, instanceVar, classVar);
    }
}
```

Output:

```
Local: 20, Instance: 10, Class: 5
```

---

## 📏 3. Shadowing & Lifetime

* **Shadowing** – a local variable can have the same name as an instance or class variable. The local variable **hides** the outer variable inside its scope.
* **Lifetime** – local variables exist only during method execution, instance variables exist as long as the object exists, class variables exist for the program lifetime.

```java
class ShadowDemo {
static int x = 100; // class variable

    void method() {
        int x = 50; // shadows class variable
        System.out.println("Local x: " + x);
        System.out.println("Class x: " + ShadowDemo.x);
    }
}
```

Output:

```
Local x: 50
Class x: 100
```

---

## 🎯 4. Best Practices (Bonus)

* Always initialize **local variables** before use.
* Keep variable scope **as narrow as possible** for readability and maintainability.
* Use **descriptive names** to avoid confusion with shadowing.
* Use **static** for constants and shared variables among objects.

---

## 🔑 Notes

* **Local variables** – temporary, inside method/block.
* **Instance variables** – belong to objects.
* **Class variables** – shared across objects.
* **Shadowing** can hide outer variables.
* **Proper scoping** reduces bugs and improves clarity.
