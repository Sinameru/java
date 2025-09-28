# Collections

This document covers the essentials of Java Collections for certification study. Collections are more flexible than arrays, providing dynamic sizing and useful methods for managing groups of objects.

---

## 1. Arrays vs. Collections

### Arrays

* Fixed size (cannot grow/shrink after creation)
* Can store both primitives and objects
* Access is very fast using indices
* Limited functionality (no built-in methods for dynamic adding/removing of elements)

### Collections

* Dynamic size (grow and shrink automatically)
* Can only store objects (primitives must be wrapped using wrapper classes like Integer, Double)
* Rich set of utility methods (add, remove, search, sort, etc.)
* Part of the `java.util` package

**Rule of thumb:** Use arrays when size is fixed and performance is critical; use collections when flexibility is needed.

---

## 2. Lists

* **List interface:** Ordered collection, allows duplicates
* **Common implementations:**

    * `ArrayList` – resizable array, fast random access, slower inserts/removals in the middle
    * `LinkedList` – elements linked via nodes, faster inserts/removals, slower random access

**Example:**

```java
import java.util.ArrayList;
import java.util.LinkedList;

ArrayList<String> arrayList = new ArrayList<>();
arrayList.add("Java");
arrayList.add("Python");
System.out.println(arrayList.get(0)); // "Java"

LinkedList<Integer> linkedList = new LinkedList<>();
linkedList.add(10);
linkedList.add(20);
linkedList.remove(0); // removes 10
```

---

## 3. Sets

* **Set interface:** Unordered collection, no duplicates
* **Common implementations:**

    * `HashSet` – based on hash tables, no guaranteed order
    * `LinkedHashSet` – maintains insertion order
    * `TreeSet` – sorted set, elements in natural order (or by Comparator)

**Example:**

```java
import java.util.HashSet;

HashSet<String> set = new HashSet<>();
set.add("A");
set.add("B");
set.add("A"); // duplicate ignored
System.out.println(set.size()); // 2
```

---

## 4. Maps

* **Map interface:** Key-value pairs, keys unique, values can repeat
* **Common implementations:**

    * `HashMap` – stores key-value pairs, no order guaranteed
    * `LinkedHashMap` – maintains insertion order
    * `TreeMap` – sorted by keys

**Example:**

```java
import java.util.HashMap;

HashMap<Integer, String> map = new HashMap<>();
map.put(1, "One");
map.put(2, "Two");
System.out.println(map.get(1)); // "One"
map.remove(2);
```

---

## Summary

* Arrays are simple, fixed-size, and allow primitives
* Lists are ordered, allow duplicates, and are ideal for sequential data
* Sets enforce uniqueness and often optimize membership tests
* Maps store data as key-value pairs for fast lookups
