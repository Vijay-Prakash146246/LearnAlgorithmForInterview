package com.DsaAlgo.DSA.LinkedList.SinglyLinkedList;

class  Node1
{
    int data;
    Node1 next;
    Node1(int newData)
    {
       data=newData;
       next=null;
    }
}
public class DeletionInLinkedList
{
    //Deletion at the Beginning
    public static  Node1 deletHead(Node1 head)
    {
      if(head == null)
          return  null;
      Node1 temp=head;
      head=head.next;
      temp=null;
      return head;
    }

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

    //Deletion at the end operation
    //Time Complexity: O(n), traversal of the linked list till its end,
    // so the time complexity required is O(n).
    //Auxiliary Space: O(1)
    public  static  Node1 deleteFromEnd(Node1 head)
    {
        if(head==null)
            return  null;

        Node1 secondLastNode=head;

        while (secondLastNode.next.next!=null)
            secondLastNode=secondLastNode.next;

        secondLastNode.next=null;
        return  head;
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
        Node1 head = new Node1(22);
        head.next=new Node1(23);
        head.next.next=new Node1(24);
        head.next.next.next=new Node1(265);
        head.next.next.next.next=new Node1(266);
        System.out.println("LinkList before insertion ");
        printLinkedList(head);

       // head=deletHead(head);
        //head=deleteAtPosition(4 , head);
        head=deleteFromEnd(head);
        System.out.println("\nLinkList after insertion ");
        printLinkedList(head);


    }
}
