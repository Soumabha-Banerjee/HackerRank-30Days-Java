// QS Link: https://www.hackerrank.com/challenges/30-linked-list-deletion/problem?isFullScreen=true

/*
Remove Duplicates From an Unsorted List:
Write a removeDuplicates() function that takes a unsorted list and deletes any duplicate nodes from the list.
For example if the linked list is 12->11->12->21->41->43->21 then 
removeDuplicates() should convert the list to 12->11->21->41->43.

Link:
https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/
*/

import java.util.*;

// Linkedlist class: 
class Linkedlist
{
    // Head Node: 
    Node head;
    
    // Nodes for Linkedlist:
    class Node  
    {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    // Method to add elements infront of linkedlist:
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    // Method to display the linkedlist:
    void disply() {
        if( head == null )
           System.out.println("Linkedlist is empty");
        else {
            Node temp = head;
            while( temp != null ) {
                System.out.printf("%d ", temp.data);
                temp = temp.next;
            }
        }
    }
    
    // Method to remove duplicate from unsorted linkedlist:
    void removeDuplicate() {
        // If linkedlist is empty:
        if( head == null )
           System.out.println("Linkedlist is empty");
           
        // Creating HashSet to store visited elements:
        HashSet<Integer> set = new HashSet();
        
        // Taking the current and previous pointers:
        Node current = head;
        Node previous = null;
        
        // Traversing the linkedlist and deleting the duplicates:
        while( current != null ) {
            if( set.contains(current.data) )
                previous.next = current.next;
            else {
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }
}

// Main driver programme:  
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        // Creating the linkedlist:
        Linkedlist list = new Linkedlist();
        for(int i=n-1; i>=0; i--)  
            list.push(arr[i]);
        
        list.removeDuplicate();
        list.disply();
    }
}   

