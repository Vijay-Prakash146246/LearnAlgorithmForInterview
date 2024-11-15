package com.DsaAlgo.DSA.LinkedList.SinglyLinkedList;

public class ReverseLinkedList
{
    //Given a linked list, the task is to reverse the linked list by changing the links between nodes.

    //Input: Linked List = 1 -> 2 -> 3 -> 4 -> NULL
    //Output: Reversed Linked List = 4 -> 3 -> 2 -> 1 -> NULL
    //
    //Input: Linked List = 1 -> 2 -> 3 -> 4 -> 5 -> NULL
    //Output: Reversed Linked List = 5 -> 4 -> 3 -> 2 -> 1 -> NULL
    //
    //Input: Linked List = NULL
    //Output: Reversed Linked List = NULL
    //
    //Input: Linked List = 1->NULL
    //Output: Reversed Linked List = 1->NULL

    //Using Iterative Method – O(n) Time and O(1) Space:
    public  static  Node reverseLinkList(Node head)
    {
        Node curr=head,prev=null,next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return  prev;
    }

    //Using Recursion – O(n) Time and O(n) Space:
    public  static  Node reverseLinkList1(Node head)
    {
        if(head==null||head.next==null)
            return head;

        Node rest = reverseLinkList1(head.next);
        head.next.next=head;
        head.next=null;
        return  rest;
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
    public  static  void main(String[]args)
    {
        Node head = new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);
        head.next.next.next.next=new Node(6);
        head.next.next.next.next.next=new Node(97);
        System.out.println("LinkList Before reverse are : ");
        printLinkedList(head);
        head=reverseLinkList1(head);
        System.out.println("\nLinkList After reverse are : ");
        printLinkedList(head);


    }

}
