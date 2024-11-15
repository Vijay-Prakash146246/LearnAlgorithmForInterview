package com.DsaAlgo.DSA.LinkedList;

public class AProgrammerApproachOfLookingAtArrayVsLinkedList
{
    /*
    *The array is considered a data structure for which size is fixed at the compile time, and array memory is allocated either from the
     Data section (e.g. global array) or Stack section (e.g. local array).
     *
     * a linked list is considered a data structure for which size is not fixed and memory is allocated from the
     * Heap section (e.g. using malloc(), etc.) as and when needed
     *
     * In this sense, the array is taken as a static data structure (residing in Data or Stack section) while the linked
     * list is taken as a dynamic data structure (residing in the Heap section).
     *
     * An array of 4 elements (integer type) have been initialized with 1, 2, 3, and 4. Suppose, these elements
     * are allocated at memory addresses 0x100, 0x104, 0x108 and 0x10C respectively.
     *
     * A linked list with 4 nodes where each node has an integer as data and these data are initialized with 1, 2, 3, and 4.
     * Suppose, these nodes are allocated via malloc() and memory allocated for them is 0x200, 0x308, 0x404 and 0x20B respectively.
     *
     * it is well known that the array elements are allocated memory in sequence i.e. contiguous memory while nodes of a
     * linked list are non-contiguous in memory. Though it sounds trivial yet this is the most important difference between
     * an array and a linked list.
     *
     * Since elements of an array are contiguous in memory, we can access any element randomly using an index  Also,
     * due to contiguous memory for successive elements in the array, no extra information is needed to be stored in
     * individual elements i.e. no overhead of metadata in arrays. Contrary to this, linked list nodes are non-contiguous
     * in memory. It means that we need some mechanism to traverse or access linked list nodes. To achieve this, each node
     * stores the location of the next node and this forms the basis of the link from one node to the next node. Therefore,
     * it’s called a Linked list
     *
     *
    * */
}
