package com.DsaAlgo.CompanyDSA.PayPal;

//LCA in Binary Tree
/*
Given a Binary Tree with all unique values and two nodes value, n1 and n2.
The task is to find the lowest common ancestor of the given two nodes.
We may assume that either both n1 and n2 are present in the tree or none of them
are present.

LCA: It is the first common ancestor of both the nodes n1 and n2 from bottom of tree.

Example 1:

Input:
n1 = 2 , n2 = 3
       1
      / \
     2   3
Output: 1
Explanation:
LCA of 2 and 3 is 1.
Example 2:

Input:
n1 = 3 , n2 = 4
           5
          /
         2
        / \
       3   4
Output: 2
Explanation:
LCA of 3 and 4 is 2.
Example 3:

Input:
n1 = 5 , n2 = 4
           5
          /
         2
        / \
       3   4
Output: 5
Explanation:
LCA of 5 and 4 is 5.
* */
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class LCAInBinaryTree
{
    //Function to return the lowest common ancestor in a Binary Tree.
    public  static Node lca(Node root, int n1,int n2)
    {
        // Your code here
        if(root == null)
            return null;

        if(root.data==n1||root.data==n2)
            return root;

        Node left_LCA = lca(root.left,n1,n2);
        Node right_LCA = lca(root.right,n1,n2);

        if(left_LCA != null && right_LCA != null)
            return root;

        return (left_LCA != null) ? left_LCA  : right_LCA;
    }
    public static  void main(String[]args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(lca(root,2,4).data);
    }
}
