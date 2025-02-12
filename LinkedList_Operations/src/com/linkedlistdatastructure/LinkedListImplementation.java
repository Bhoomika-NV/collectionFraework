package com.linkedlistdatastructure;
public class LinkedListImplementation {
public static void main(String[] args) {
	int[]a = {2,4,5,6};
	Node n = new Node(a[3]);
	System.out.println(n.data);
}
}
class Node{
	int data;
	Node next;
	Node(int data,Node next){
		this.data=data;
		this.next=next;
	}
	public Node(int data1){
		this.data= data1;
	}
}