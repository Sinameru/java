# Extras

This document covers some additional Java features often included in the certification: **autoboxing/unboxing, enums, and wrapper classes**.

---

## 1. Autoboxing and Unboxing

* **Definition:** Automatic conversion between **primitive types** and their corresponding **wrapper classes**.

    * **Autoboxing:** Primitive → Wrapper
    * **Unboxing:** Wrapper → Primitive

* **Examples:**

```java
// Autoboxing
Integer boxedInt = 10;  // int automatically converted to Integer
Double boxedDouble = 5.5; // double → Double

// Unboxing
int num = boxedInt;       // Integer → int
double d = boxedDouble;   // Double → double
```

* **Key points:**

    * Simplifies working with collections, which require objects, not primitives.
    * Introduced in Java 5.

---

## 2. Wrapper Classes

* **Definition:** Classes that encapsulate primitive types as objects.

* **Common wrappers:**

    * `Integer` → int
    * `Double` → double
    * `Character` → char
    * `Boolean` → boolean

* **Purpose:**

    * Use in Collections (`ArrayList<Integer>` instead of `int[]`)
    * Methods like `parseInt()`, `valueOf()`, etc.

* **Examples:**

```java
Integer i = Integer.valueOf(42);
int x = i.intValue();
Double d = Double.parseDouble("3.14");
```

---

## 3. Enums

* **Definition:** Special type used to define **a set of constants**.
* **Syntax:**

```java
enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
```

* **Using enums:**

```java
Day today = Day.MONDAY;
System.out.println("Today is: " + today);
```

* **Key points:**

    * Enums are type-safe.
    * Can have fields, methods, and constructors.
    * Useful for representing fixed sets of values.

---

## Summary

* **Autoboxing/unboxing:** Automatic conversion between primitives and their wrappers. Simplifies use in collections.
* **Wrapper classes:** Encapsulate primitive types as objects; provide utility methods.
* **Enums:** Type-safe constants, useful for fixed sets of values.

These extras are optional but useful for certification and practical Java programming.
