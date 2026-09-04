# 01. Two Pointers Pattern

The **Two Pointers** pattern is a highly efficient algorithmic technique where two reference pointers iterate through a linear data structure simultaneously. By tracking two positions at once, this pattern avoids unnecessary nested loops, optimizing solutions from an expensive **O(N²)** time complexity down to a linear **O(N)** time complexity.

---

## 🎯 When to Use This Pattern

Consider using Two Pointers if the problem meets these conditions:
* **Linear Structure:** The input data is an Array, String, or Linked List.
* **Sorted Data:** The items are sorted, or sorting them beforehand simplifies the logic.
* **Target Search:** You need to find pairs, triplets, or subarrays that satisfy a specific constraint or target sum.
* **In-Place Modification:** You need to swap, reverse, or filter elements without using extra memory allocations.

---

## 🚀 Pointer Directions & Mechanics

### 1. Converging Pointers (Opposite Ends)
* **How it works:** One pointer starts at the **beginning (`left = 0`)** and the other at the **end (`right = len - 1`)**. They move toward each other based on problem conditions until they meet or cross over.
* **Common Applications:** Finding target element pairs in sorted lists, reversing sequences, and checking for mirror symmetries like palindromes.

### 2. Parallel / Fast & Slow Pointers (Same Direction)
* **How it works:** Both pointers start at the same side but move at **different speeds** (e.g., a slow pointer moving 1 step while a fast pointer moves 2 steps) or maintain a fixed, predictable window gap.
* **Common Applications:** Detecting cyclic loops in linked structures, finding structural middle elements, and removing duplicate items in-place.

---

## 📊 Complexity Analysis

* **Time Complexity:** **O(N)** — In the worst-case scenario, the elements in the data structure are traversed at most once or twice.
* **Space Complexity:** **O(1)** — It operates completely in-place, keeping track of indices or node memory addresses without allocating any extra data structures.

---

## 📁 Solved Problems

