# Arrays in Java

An **array** is a container that holds multiple values of the same type.
Arrays have a **fixed size** and are indexed starting from 0.

---

## 🔹 1. One-Dimensional Arrays (1D)

A simple list of elements of the same type.

```java
// Declare and initialize
int[] numbers = {10, 20, 30, 40, 50};

// Access elements
System.out.println("First element: " + numbers[0]);
System.out.println("Third element: " + numbers[2]);

// Modify elements
numbers[1] = 25;
System.out.println("Updated second element: " + numbers[1]);
```

Output:

```
First element: 10
Third element: 30
Updated second element: 25
```

---

## 🔹 2. Two-Dimensional Arrays (2D)

Think of a 2D array as a **table or matrix**.

```java
// Declare and initialize
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Access elements
System.out.println("Element at row 1, col 2: " + matrix[0][1]); // 2

// Modify elements
matrix[2][0] = 10;
System.out.println("Updated element at row 3, col 1: " + matrix[2][0]);
```

Output:

```
Element at row 1, col 2: 2
Updated element at row 3, col 1: 10
```

---

## 🔹 3. Iterating Arrays

You can loop through arrays using **for**, **enhanced for (for-each)**, or **while** loops.

### Using standard `for` loop

```java
int[] numbers = {10, 20, 30};
for (int i = 0; i < numbers.length; i++) {
    System.out.println("Index " + i + ": " + numbers[i]);
}
```

### Using enhanced `for-each` loop

```java
for (int num : numbers) {
    System.out.println("Value: " + num);
}
```

### Iterating 2D arrays

```java
int[][] matrix = {
    {1, 2},
    {3, 4}
};

for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

Output:

```
1 2
3 4
```

---

## 🔑 Notes

* Arrays are **fixed size** — cannot grow dynamically.
* **Indices start at 0**. Accessing an invalid index causes `ArrayIndexOutOfBoundsException`.
* Use **enhanced for-loop** when you don’t need the index.
* 2D arrays can be **rectangular** or **jagged** (rows of different lengths).
* Use `.length` to get the number of elements in 1D or number of rows in 2D arrays.
