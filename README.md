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

## 🚀 Approach Two Pointers
* **How it works:** One pointer starts at the **beginning (`left = 0`)** and the other at the **end (`right = len - 1`)**. They move toward each other based on problem conditions until they meet or cross over.
* **Common Applications:** Finding target element pairs in sorted lists, reversing sequences, and checking for mirror symmetries like palindromes.

---

## 📊 Complexity Analysis

* **Time Complexity:** **O(N)** — In the worst-case scenario, the elements in the data structure are traversed at most once or twice.
* **Space Complexity:** **O(1)** — It operates completely in-place, keeping track of indices or node memory addresses without allocating any extra data structures.

---

## 📁 Solved Problems

| # | Problem Name | Problem Link | Data Structure | Solution Link |
| :--- | :---: | :---: | :---: | :---: |
| 0026 | Remove Duplicates from Sorted Array | [Click Here](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Array | [Solution Link](/0026_Remove_Duplicates_from_Sorted_Array.java) |
| 0080 | Remove Duplicates from Sorted Array II | [Click Here](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/) | Array | [Solution Link](/0080_Remove_Duplicates_from_Sorted_Array_II.java) |
| 0167 | Two Sum II - Input Array Is Sorted | [Click Here](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/) | Array | [Solution Link](/0167_Two_Sum_II.java) |
| # | Rearrange 0 and 1 | [Click Here](https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1) | Array | [Solution Link](/Segregate_0s_and_1s.java) |
