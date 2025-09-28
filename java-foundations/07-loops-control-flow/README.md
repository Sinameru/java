# Loops & Control Flow

This document covers the essentials of Java loops and control flow for certification study. Understanding these constructs is crucial for writing efficient, readable, and maintainable Java code.

---

## 1. Loops

### For loop

* Repeats a block of code a known number of times.
* Syntax:

```java
for (initialization; condition; update) {
    // code block
}
```

* Example:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

### While loop

* Repeats a block of code while a condition is true.
* Syntax:

```java
while (condition) {
    // code block
}
```

* Example:

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### Do-while loop

* Executes the block **at least once**, then repeats while the condition is true.
* Syntax:

```java
do {
    // code block
} while (condition);
```

* Example:

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

## 2. Break & Continue

### Break

* Exits the nearest enclosing loop immediately.
* Useful for stopping a loop when a condition is met.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) break;
    System.out.println(i); // prints 0 to 4
}
```

### Continue

* Skips the current iteration and moves to the next loop iteration.

```java
for (int i = 0; i < 5; i++) {
    if (i == 2) continue;
    System.out.println(i); // prints 0,1,3,4
}
```

---

## 3. Conditional Statements

### If-else

* Executes code blocks based on conditions.
* Syntax:

```java
if (condition) {
    // code if true
} else if (anotherCondition) {
    // code if another condition is true
} else {
    // code if none of the above
}
```

* Example:

```java
int x = 10;
if (x > 0) {
    System.out.println("Positive");
} else {
    System.out.println("Non-positive");
}
```

### Switch

* Selects a code block based on a value.
* Syntax:

```java
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code if no case matches
}
```

* Example:

```java
int day = 3;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Other day");
}
```

---

## Summary

* **For loops** → use when the number of iterations is known.
* **While loops** → use when the number of iterations depends on a condition.
* **Do-while loops** → guarantee at least one execution.
* **Break** → exit a loop early.
* **Continue** → skip to the next iteration.
* **If-else** → basic conditional logic.
* **Switch** → multi-way branching based on discrete values.

These constructs form the backbone of **control flow in Java**, enabling both repetition and decision-making in programs.
