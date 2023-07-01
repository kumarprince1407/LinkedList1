package com.bridgelabz.LinkedList1;

public class LL1 {
    Node head;
    class Node{
        Node head;
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    //Add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //Print list
    public void print(){
        if(head== null){
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;
        while (currNode!= null){
            System.out.print(currNode.data + "-->");
            currNode=currNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Lets create a simple Linked List of 56, 30 and 70.");
        LL1 list = new LL1();
        list.print();
        list.addFirst(70);
        list.addFirst(30);
        list.addFirst(56);
        list.print();

        
    }
}
