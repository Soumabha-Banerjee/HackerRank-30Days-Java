// QS Link: https://www.hackerrank.com/challenges/30-binary-search-trees/problem?isFullScreen=true

import java.util.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

 public static int getHeight(Node root){
      int heightleft=0;
      int heightright=0;
      if(root.left!=null){
          heightleft=getHeight(root.left)+1;
      }
      if(root.right!=null){
          heightright=getHeight(root.right)+1;
      }
      return (heightleft>heightright?heightleft:heightright);
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        sc.close();
        int height=getHeight(root);
        System.out.println(height);
    }
}