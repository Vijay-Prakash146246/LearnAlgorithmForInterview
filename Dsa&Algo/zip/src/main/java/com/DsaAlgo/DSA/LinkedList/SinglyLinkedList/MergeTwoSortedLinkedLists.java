package com.DsaAlgo.DSA.LinkedList.SinglyLinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLinkedLists
{
    /*
    *Given two sorted linked lists consisting of N and M nodes respectively.
    * The task is to merge both of the lists (in place) and return the head
    * of the merged list.

    Examples:

    Input: a: 5->10->15,  b: 2->3->20
    Output: 2->3->5->10->15->20


    Input: a: 1->1, b: 2->4
    Output: 1->1->2->4

    Input: a: 1->2->3, b: null
    Output: 1->2->3
    * */
    //Time Complexity:O((n+m)+(n+m)*log(n+m)),(n+m)for traversing linked lists and
    // (n+m)*log(n+m) for sorting array which can be further solved to O((n+m)*log(n+m)).
    //Auxiliary Space: O(n+m)
    public  static  Node mergeSortedList(Node a,Node b)
    {
        ArrayList<Integer>list=new ArrayList<>();
        while (a!=null)
        {
            list.add(a.data);
            a=a.next;
        }
        while (b!=null)
        {
            list.add(b.data);
            b=b.next;
        }
        Collections.sort(list);
        Node temp = new Node(-1);
        Node head = temp;
        for (int value :list)
        {
            temp.next=new Node(value);
            temp=temp.next;
        }
        head=head.next;
        return  head;
    }

    //Using Recursive Merge:
    //Time Complexity: O(m + n)
    //Auxiliary Space: O(m + n), Function call stack space.
    public  static  Node mergeSortedList1(Node a,Node b)
    {
        Node result = null;
        if(a==null)
            return  b;
        if(b==null)
            return a;

        if(a.data<=b.data)
        {
            result=a;
            result.next=mergeSortedList1(a.next,b);
        }
        else
        {
            result=b;
            result.next=mergeSortedList1(a,b.next);
        }
        return  result;
    }

    //Using Iterative Merge:
    //Time Complexity: O(m + n),
    //Auxiliary Space: O(1)
    public  static  Node mergeSortedList2(Node a,Node b)
    {
        if(a==null)
            return b;
        if(b==null)
            return a;
        Node head=null;
        Node tail=null;

        if(a.data<=b.data)
        {
            head=tail=a;
            a=a.next;
        }
        else
        {
            head=tail=b;
            b=b.next;
        }
        while (a!=null && b!=null)
        {
            if(a.data<=b.data)
            {
                tail.next=a;
                tail=a;
                a=a.next;
            }
            else
            {
                tail.next=b;
                tail=b;
                b=b.next;
            }
        }
        tail.next=(a!=null)?a:b;
        return head;
    }
    public  static  void  printLinkedList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public  static  void  main(String[]args)
    {
        Node a=new Node(2);
        a.next=new Node(4);
        a.next.next=new Node(6);
        a.next.next.next=new Node(8);
        a.next.next.next.next=new Node(110);

        Node b = new Node(1);
        b.next=new Node(3);
        b.next.next=new Node(5);
        b.next.next.next=new Node(7);
        b.next.next.next.next=new Node(119);

        System.out.println("First LinkList : ");
        printLinkedList(a);
        System.out.println("\nSecond Linklist : ");
        printLinkedList(b);
        Node head= mergeSortedList2(a,b);
        System.out.println("\nAfter merging both LinkList : ");
        printLinkedList(head);
    }
}
