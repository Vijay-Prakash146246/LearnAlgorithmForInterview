package com.DsaAlgo.DSA.LinkedList.SinglyLinkedList;

class Node
{
    int data;
    Node next;
    Node(int newdata)
    {
        data=newdata;
        next=null;
    }
}
public class InsertionInLinkedList
{
    /*
    Given a Linked List, the task is to insert a new node in this given Linked List at the following positions:
    At the front of the linked list
    Before a given node.
    After a given node.
    At a specific position.
    At the end of the linked list.
    * */

    //Insert a Node at the Front/Beginning of Linked List
    /*
    *Algorithm:
    Make the first node of Linked List linked to the new node
    Remove the head from the original first node of Linked List
    Make the new node as the Head of the Linked List.

    *Time complexity of inserting a node at the head position is O(1).
    Auxiliary Space: O(1)
    *  */

    public  static  Node insertionAtFront(int newData,Node head)
    {
        Node newNode = new Node(newData);
        newNode.next=head;
        return newNode;
    }

    //Insert a Node after a Given Node in Linked List
    //Time complexity: O(n), where n is the number of nodes in the linked list.
    //Auxiliary Space: O(1)
    public  static  Node insertAfterKey(int newdata,int key,Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
                break;
            temp=temp.next;
        }
        //if key not found in linkedlist
        if(temp==null)
            return head;

        Node newNode=new Node(newdata);
        newNode.next=temp.next;
        temp.next=newNode;
        return  head;
    }

    //Insert a Node before a Given Node in Linked List
    //Time Complexity: O(n), where n is the number of nodes in the linked list.
    //Auxiliary Space: O(1)
    public  static  Node insertBeforeKey(Node head,int key,int newData)
    {
        if (head==null)
            return null;
        if(head.data==key)
        {
            Node newNode=new Node(newData);
            newNode.next=head;
            return newNode;
        }
        Node curr=head;
        Node prev=null;
        while (curr!=null&& curr.data!= key)
        {
            prev=curr;
            curr=curr.next;
        }
        if(curr!=null)
        {
            Node newNode=new Node(newData);
            prev.next=newNode;
            newNode.next=curr;
        }
        return  head;
    }

    //Insert a Node At a Specific Position in Linked List
    //Algorithm:
    //Traverse the Linked list upto position-1 nodes.
    //Once all the position-1 nodes are traversed, allocate memory and the given data to the new node.
    //Point the next pointer of the new node to the next of current node.
    //Point the next pointer of current node to the new node.

    public  static  Node insertAtPosition(int position,int value,Node head)
    {
        return  null;
    }

    //Insert a Node at the End of Linked List
    //Algorithm:
    //
    //Go to the last node of the Linked List
    //Change the next pointer of last node from NULL to the new node
    //Make the next pointer of new node as NULL to show the end of Linked List
    //Time complexity: O(n), where n is the number of nodes in the linked list.
    //Auxiliary Space: O(1)

    public  static  Node insertAtEnd(Node head,int newdata)
    {
        Node newNode = new Node(newdata);
        if(head==null)
            return  newNode;
        Node temp=head;
        while(temp.next!=null)
        temp=temp.next;
        temp.next=newNode;
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

    public  static  void main(String[]args)
    {
        Node head = new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);
        System.out.println("LinkList before insertion ");
        printLinkedList(head);

        //head=insertionAtFront(13,head);
        //head=insertAfterKey(112,5,head);
        //head=insertBeforeKey(head,4,656);
        head=insertAtEnd(head,595);
        System.out.println("\nLinkList after insertion ");
        printLinkedList(head);


    }

}
