package com.DsaAlgo.DSA.LinkedList.SinglyLinkedList;

public class FindLengthOfLinkedList
{
    //Time complexity: O(N), Where N is the size of the linked list
    //Auxiliary Space: O(1), As constant extra space is used.
    public  static  int findLength(Node head)
    {
        int count=0;
        Node temp=head;
        while (temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }

    //Recursive Approach to Find the Length of a Linked List:
    //Time Complexity: O(N), where N is the length of Linked List.
    //Auxiliary Space: O(N), Extra space is used in the recursion call stack.
    public  static  int findLength1(Node head)
    {
        if (head==null)
            return 0;
        return 1+findLength1(head.next);
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
        Node head = new Node(122);
        head.next=new Node(123);
        head.next.next=new Node(124);
        head.next.next.next=new Node(125);
        head.next.next.next.next=new Node(126);
        head.next.next.next.next.next=new Node(127);
        System.out.println("LinkList are : ");
        printLinkedList(head);
        System.out.println("\nLinkList Length : "+findLength1(head));


    }
}
