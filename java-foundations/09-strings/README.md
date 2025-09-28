# Strings

This document covers the essentials of Java Strings for certification study. Strings are **immutable sequences of characters** and are used extensively for text manipulation in Java.

---

## 1. String Basics

* **Definition:** A sequence of characters enclosed in double quotes (`"text"`).
* **Declaration:**

```java
String str1 = "Hello";
String str2 = new String("World");
```

* Strings can be assigned, compared, and concatenated.

---

## 2. String Immutability

* **Immutability:** Once created, a String cannot be changed. Any operation that appears to modify a String actually creates a **new String object**.
* **Implications:**

    * Repeated modifications may create multiple objects, affecting memory.
    * Use `StringBuilder` or `StringBuffer` for frequent modifications.
* **Example:**

```java
String str = "Hello";
str = str + " World"; // creates a new String object
System.out.println(str); // Hello World
```

---

## 3. String Operations

* **Common Methods:**

  | Method                            | Description                     | Example                |
  |-----------------------------------|---------------------------------|------------------------|
  | `length()`                        | Returns number of characters    | `str.length()`         |
  | `charAt(index)`                   | Returns character at index      | `str.charAt(0)`        |
  | `substring(start, end)`           | Extracts substring              | `str.substring(0, 3)`  |
  | `equals(obj)`                     | Compares content                | `str1.equals(str2)`    |
  | `compareTo(str)`                  | Lexicographical comparison      | `str1.compareTo(str2)` |
  | `toUpperCase()` / `toLowerCase()` | Change case                     | `str.toUpperCase()`    |
  | `trim()`                          | Removes leading/trailing spaces | `str.trim()`           |
  | `replace(oldChar,newChar)`        | Replaces characters             | `str.replace('a','b')` |

* **Concatenation:**

```java
String first = "Hello";
String second = "Java";
String combined = first + " " + second;
System.out.println(combined); // Hello Java
```

* **With numbers:**

```java
int a = 5, b = 10;
System.out.println("Sum = " + (a + b)); // Sum = 15
```

---

## Summary

* Strings are **immutable** and cannot be changed after creation.
* Use **methods** for common operations like substring, comparison, case change, and replacement.
* **Concatenation** can be done with `+` or `concat()`.
* For frequent modifications, prefer **StringBuilder/StringBuffer** for performance.
