# Java I/O

This document covers the essentials of Java Input/Output for certification study. Java I/O allows programs to **interact with users or external data sources**, commonly via the console.

---

## 1. Console Output

* **Printing to the console:**

    * `System.out.print()` → prints text without a newline
    * `System.out.println()` → prints text and adds a newline
    * `System.out.printf()` → formatted output, similar to C-style printf

* **Examples:**

```java
System.out.print("Hello ");
System.out.println("World");
int age = 25;
System.out.printf("Age = %d\n", age);
```

* Key points:

    * `print` keeps the cursor on the same line
    * `println` moves to the next line automatically
    * `printf` allows formatted strings with placeholders like `%d` (integer), `%s` (string), `%f` (float/double)

---

## 2. Scanner Input

* **Purpose:** Read user input from the console.

* **Class:** `java.util.Scanner`

* **Steps:**

    1. Import `java.util.Scanner`
    2. Create a `Scanner` object (usually `System.in` for console)
    3. Call methods to read different types of input

* **Common methods:**

    * `nextLine()` → reads a full line as a String
    * `next()` → reads a word as a String
    * `nextInt()` → reads an integer
    * `nextDouble()` → reads a double
    * `nextBoolean()` → reads a boolean

* **Example:**

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

System.out.print("Enter your name: ");
String name = scanner.nextLine();

System.out.print("Enter your age: ");
int age = scanner.nextInt();

System.out.println("Hello, " + name + ". You are " + age + " years old.");
```

* **Important:**

    * Always close the scanner after use: `scanner.close();`
    * Mixing `nextLine()` with other `nextXXX()` methods can require handling the leftover newline.

---

## Summary

* **Console output:** Use `System.out.print`, `System.out.println`, `System.out.printf` for printing text.
* **Console input:** Use `Scanner` to read user input of various types.
* Proper use of I/O is essential for interactive programs and certification examples.
