# Operators in Java

Operators in Java are **symbols that perform operations on variables and values**.

They can be categorized into **arithmetic, relational, logical, assignment, unary, and ternary** operators.

This example uses **System.out.printf** to print results in a C-style formatted output.

---

## 🧮 1. Arithmetic Operators (+ - \* / %)

Perform **mathematical operations** on numbers.
The modulus operator `%` returns the remainder of a division.

| Operator | Meaning        | Example | Output               |
|----------|----------------|---------|----------------------|
| +        | Addition       | 10 + 3  | 13                   |
| -        | Subtraction    | 10 - 3  | 7                    |
| \*       | Multiplication | 10 \* 3 | 30                   |
| /        | Division       | 10 / 3  | 3 (integer division) |
| %        | Modulus        | 10 % 3  | 1                    |

```java
int a = 10, b = 3;
System.out.printf("Addition: %d + %d = %d\n", a, b, a + b);
System.out.printf("Remainder: %d %% %d = %d\n", a, b, a % b);
```

---

## 🔍 2. Relational Operators (== != > < >= <=)

Compare values and return **boolean** (`true` or `false`).

| Operator | Meaning       | Example | Result |
|----------|---------------|---------|--------|
| ==       | Equal to      | 5 == 8  | false  |
| !=       | Not equal to  | 5 != 8  | true   |
| \>       | Greater than  | 5 > 8   | false  |
| <        | Less than     | 5 < 8   | true   |
| \>=      | Greater/equal | 5 >= 8  | false  |
| <=       | Less/equal    | 5 <= 8  | true   |

```java
int x = 5, y = 8;
System.out.printf("x > y? %b\n", x > y);
System.out.printf("x == y? %b\n", x == y);
```

---

## ⚡ 3. Logical Operators (&& || !)

Operate on **boolean values**.

| Operator | Meaning | Example         | Result |
|----------|---------|-----------------|--------|
| &&       | AND     | true && false   | false  |
| \|\|     | OR      | true \|\| false | true   |
| !        | NOT     | !true           | false  |

```java
boolean p = true, q = false;
System.out.printf("p && q = %b\n", p && q);
System.out.printf("!p = %b\n", !p);
```

---

## 📝 4. Assignment Operators (= += -= \*= /= %=)

Assign or **update variable values**.

| Operator | Meaning             | Example | Result |
|----------|---------------------|---------|--------|
| =        | Assign              | n = 10  | 10     |
| +=       | Add and assign      | n += 5  | 15     |
| -=       | Subtract and assign | n -= 3  | 12     |
| \*=      | Multiply and assign | n \*= 2 | 24     |
| /=       | Divide and assign   | n /= 3  | 8      |
| %=       | Modulus and assign  | n %= 4  | 0      |

```java
int n = 10;
n += 5;
System.out.printf("n += 5 -> %d\n", n);
n %= 4;
System.out.printf("n %%= 4 -> %d\n", n);
```

---

## 🔺 5. Unary Operators (++ -- + -)

Increment, decrement, or change the sign of a number.

| Operator | Meaning       | Example   | Result    |
|----------|---------------|-----------|-----------|
| ++       | Increment     | i++ / ++i | depends   |
| --       | Decrement     | i-- / --i | depends   |
| +        | Positive sign | +i        | same as i |
| -        | Negative sign | -i        | -i        |

```java
int i = 7;
System.out.printf("i++ = %d\n", i++);
System.out.printf("--i = %d\n", --i);
System.out.printf("-i = %d\n", -i);
```

---

## ❓ 6. Ternary Operator (condition ? value1 : value2)

Returns a value based on a **condition**.

```java
int age = 20;
String status = (age >= 18) ? "Adult" : "Minor";
System.out.printf("Age: %d, Status: %s\n", age, status);
```

---

## 🔑 Notes

* Use **%d** for integers, **%f** for decimals, **%b** for boolean, **%c** for char, **%s** for Strings.
* Use `%%` to print the percent symbol.
* Parentheses are important in **ternary and arithmetic expressions** to ensure correct evaluation.
* This example demonstrates **all operator types in a single executable program**, ideal for studying and revising.
