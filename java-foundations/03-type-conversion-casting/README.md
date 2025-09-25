# Type Conversion & Casting in Java

In Java, **type conversion** means changing a value from one data type to another.  
This happens in two main ways: **widening (implicit)** and **narrowing (explicit)** conversions.

---

## 🔄 1. Widening Conversion (Implicit Casting)

A **smaller type is automatically converted** to a larger type.  
This is safe because no data is lost.

Order of widening (small → big):  
`byte → short → int → long → float → double`

```java
int x = 10;
double y = x;  // int automatically converts to double
System.out.printf("int: %d -> double: %.2f\n", x, y);
```

Output:
```
int: 10 -> double: 10.00
```

---

## ⚠️ 2. Narrowing Conversion (Explicit Casting)

A **larger type is forced into a smaller type** using parentheses.  
This may cause **data loss or precision loss**.

```java
double d = 9.78;
int i = (int) d;  // explicit cast
System.out.printf("double: %.2f -> int: %d\n", d, i);
```

Output:
```
double: 9.78 -> int: 9
```

---

## 📏 3. Primitive Conversion Rules

Some important rules:

* `boolean` cannot be converted to or from any other type.
* `char` can be converted to an `int` (stores Unicode value).
* Floating-point to integer **truncates** the decimal part.
* Narrowing may cause **overflow**.

```java
char c = 'A';
int code = c;   // Unicode of 'A' is 65
System.out.printf("char: %c -> int: %d\n", c, code);

int big = 130;
byte small = (byte) big; // overflow happens
System.out.printf("int: %d -> byte: %d\n", big, small);
```

Output:
```
char: A -> int: 65
int: 130 -> byte: -126
```

---

## 🎯 4. Wrapper Classes & Parsing (Bonus)

Java provides **wrapper classes** (e.g., `Integer`, `Double`) that help convert between primitives and Strings.

```java
String s = "123";
int num = Integer.parseInt(s); // String -> int
double val = Double.valueOf("3.14"); // String -> double
System.out.printf("num: %d, val: %.2f\n", num, val);
```

---

## 🔑 Notes

* **Widening = automatic** (safe).
* **Narrowing = manual** (may lose data).
* Always use parentheses when **explicit casting**.
* Wrapper classes are useful for **converting Strings** into numbers.
* Beware of **overflow** and **loss of precision** in narrowing.  