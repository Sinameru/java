# Exceptions

This document covers the essentials of Java exceptions for certification study. Exceptions are used to **handle errors or unusual conditions** during program execution.

---

## 1. Checked vs Unchecked Exceptions

* **Checked Exceptions:**

    * Must be **declared** or **handled** in the code.
    * Detected at **compile time**.
    * Example: `IOException`, `FileNotFoundException`
    * Syntax:

      ```java
      public void readFile() throws IOException {
          // code that may throw IOException
      }
      ```

* **Unchecked Exceptions:**

    * **Runtime exceptions** that **do not need to be declared or caught**.
    * Detected at **runtime**.
    * Example: `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException`

---

## 2. Common Exceptions

| Exception                        | Description                               |
|----------------------------------|-------------------------------------------|
| `NullPointerException`           | Accessing a null object reference         |
| `ArrayIndexOutOfBoundsException` | Accessing an invalid array index          |
| `ArithmeticException`            | Arithmetic errors, e.g., division by zero |
| `NumberFormatException`          | Invalid number parsing                    |
| `ClassCastException`             | Invalid type casting                      |
| `IOException`                    | Input/output errors (checked)             |

---

## 3. try-catch-finally

* **Purpose:** Handle exceptions gracefully without crashing the program.
* **Syntax:**

```java
try {
    // code that may throw exception
} catch (ExceptionType e) {
    // code to handle exception
} finally {
    // optional, code that always executes
}
```

* **Example:**

```java
try {
    int[] numbers = {1, 2, 3};
    System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Invalid index accessed!");
} finally {
    System.out.println("Execution finished.");
}
```

* **Key points:**

    * Multiple `catch` blocks can handle different exceptions.
    * `finally` executes regardless of exception occurrence.
    * Checked exceptions must be handled or declared; unchecked exceptions may be handled optionally.

---

## Summary

* **Checked exceptions:** Compile-time, must be handled.
* **Unchecked exceptions:** Runtime, optional handling.
* **try-catch-finally:** Provides structured exception handling.
* Understanding exceptions is essential for **robust and reliable Java programs**.
