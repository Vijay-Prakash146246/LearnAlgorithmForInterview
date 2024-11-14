package com.DsaAlgo.DSA.LinkedList;

public class Introduction {}
/*
Linked List is a linear data structure, in which elements are not stored at a contiguous
location, rather they are linked using pointers. Linked List forms a series of connected
nodes, where each node stores the data and the address of the next node.

Why linked list data structure needed?
The main cases where we prefer linked list over arrays is due to ease of insertion
and deletion in linked list

Array: Arrays store elements in contiguous memory locations, resulting in easily
calculable addresses for the elements stored and this allows faster access to an
element at a specific index.

Linked List: Linked lists are less rigid in their storage structure and elements
are usually not stored in contiguous locations, hence they need to be stored with
additional tags giving a reference to the next element.


Advantages of Linked List over arrays :
Efficient insertion and deletion. : We only need to change few pointers (or references)
to insert (or delete) an item in the middle. Insertion and deletion at any point in a
linked list take O(1) time. Whereas in an array data structure, insertion / deletion
in the middle takes O(n) time.

Implementation of Queue and Deque : Simple array implementation is not efficient at all.
We must use circular array to efficiently implement which is complex. But with linked
list, it is easy and straightforward. That is why most of the language libraries use
Linked List internally to implement these data structures.

Advantages of Arrays over Linked List :
Random Access. : We can access ith item in O(1) time (only some basic arithmetic
required using base address). In case of linked lists, it is O(n) operation due to
sequential access.

Easy to use : Arrays are relatively very easy to use and are available as core of
programming languages
Less Overhead : Unlike linked list, we do not have any extra references / pointers
to be stored with every item.
* */
