# Primitive Data Types

Java has **8 primitive data types**. These are the building blocks of all other data structures and objects.  
They are not objects themselves—just raw values stored directly in memory.

---

## 🧱 The 8 Primitives

| Type    | Size (bits) | Range (approx)                               | Example Literal |
|---------|------------:|-----------------------------------------------|-----------------|
| `byte`  | 8           | -128 to 127                                  | `byte b = 100;` |
| `short` | 16          | -32,768 to 32,767                            | `short s = 2000;` |
| `int`   | 32          | -2,147,483,648 to 2,147,483,647              | `int i = 42;` |
| `long`  | 64          | -9 quintillion to 9 quintillion              | `long l = 9000000000L;` |
| `float` | 32          | ~7 decimal digits precision                  | `float f = 3.14f;` |
| `double`| 64          | ~15 decimal digits precision                 | `double d = 3.14159265359;` |
| `char`  | 16          | Unicode character (0 to 65,535)              | `char c = 'A';` |
| `boolean` | 1 (JVM-specific) | `true` or `false`                     | `boolean flag = true;` |

---

## 🔑 Notes

- **Default values** (for class fields):
    - Numeric types → `0`
    - `boolean` → `false`
    - `char` → `'\u0000'` (null character)

- **Literals**:
    - `int` is the default for whole numbers.
    - `double` is the default for decimals.
    - Add `L` for `long`, `f` for `float`, and quotes for `char` or `String`.

- **Unicode in `char`**:
  ```java
  char letter = 'A';        // normal character
  char symbol = '\u03A9';   // Unicode (Ω)
