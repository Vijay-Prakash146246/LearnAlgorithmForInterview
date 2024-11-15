package com.DsaAlgo.DSA.LinkedList.SinglyLinkedList;

public class SwapNodesInLinkedListWithoutSwappingData
{
    //Given a singly linked list with two values x and y, the task is to swap
    // two nodes having values x and y without swapping data.
    //Time Complexity: O(n), where n is the number of nodes in linked list.
    //Auxiliary Space: O(1)
    public  static Node SwapNode(Node head,int x,int y)
    {
        if(x==y)
            return  head;

        Node prevX=null;
        Node prevY=null;
        Node currX=null;
        Node currY=null;
        Node curr=head;
       // find x
        while (curr!=null)
        {
            if(curr.data==x)
            {
                currX=curr;
                break;
            }
            prevX=curr;
            curr=curr.next;
        }
       // find y
        curr=head;
        while (curr!=null)
        {
            if(curr.data==y)
            {
                currY=curr;
                break;
            }
            prevY=curr;
            curr=curr.next;
        }

        //if x or y are not present
        if(currX==null || currY==null)
            return  head;

        //if x  is not head of linklist
        if(prevX!=null)
            prevX.next=currY;
        else
            head=currY;

        //if y is not head of linklist
        if(prevY!=null)
            prevY.next=currX;
        else
            head=currX;

        //swap next pointer
        Node temp = currY.next;
        currY.next=currX.next;
        currX.next=temp;

        return  head;
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
        head.next.next.next.next.next=new Node(7);
        System.out.println("LinkList Before Swap are : ");
        printLinkedList(head);
        head=SwapNode(head,3,7);
        System.out.println("\nLinkList After Sawp are : ");
        printLinkedList(head);


    }
}
