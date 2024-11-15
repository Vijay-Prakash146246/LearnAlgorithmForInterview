package com.DsaAlgo.DSA.LinkedList.SinglyLinkedList;

public class DeleteLinkedListNodeAtGivenPosition
{
    //Deletion at a specified position in a linked list
    //Time Complexity: O(n), traversal of the linked list till its end,
    // so the time complexity required is O(n).
    //Auxiliary Space: O(1)
    public  static  Node1 deleteAtPosition(int position , Node1 head)
    {
        Node1 temp=head;
        Node1 prev=null;
        if (temp==null)
            return  head;

        if(position==1)
        {
            head=temp.next;
            return  head;
        }

        for(int i=1;temp!=null&&i<position;i++)
        {
            prev=temp;
            temp=temp.next;
        }

        if(temp!=null)
            prev.next=temp.next;
        else
            System.out.println("Data not present");
        return head;
    }

    public  static  void  printLinkedList(Node1 head)
    {
        Node1 temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public  static  void main(String[]args)
    {
        Node1 head = new Node1(122);
        head.next=new Node1(123);
        head.next.next=new Node1(124);
        head.next.next.next=new Node1(125);
        head.next.next.next.next=new Node1(126);
        System.out.println("LinkList before insertion ");
        printLinkedList(head);

        // head=deletHead(head);
        head=deleteAtPosition(3 , head);
        System.out.println("\nLinkList after insertion ");
        printLinkedList(head);


    }
}
