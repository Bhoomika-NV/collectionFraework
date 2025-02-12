package com.linkedlistdatastructure;

import java.util.Scanner;

public class LinkedListImplementation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 2, 4, 5, 6 };
		Node n = new Node(a[3]);
		System.out.println(n.data);
		Node head = arrayIntoLinkedlist(a);
//		System.out.println(head.data+" "+head.next.data+" "+
//		                   head.next.next.data+" "+head.next.next.next.data);
		System.out.println(head.data + " is the head");
		// Traversing the linkedlist
		System.out.println("linked list traversing");
		Node tmp = head;
		while (tmp != null) {
			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}
		System.out.println();
		System.out.println(findlengthOfList(head) + " is the length of the linkedlist");
		System.out.println("please enter the item to search");
		int item = sc.nextInt();
		if (isElementPresent(head, item) == 0) {
			System.out.println("the elemnt is not present");
		} else {
			System.out.println(item + " is found in the list");
		}
	}

	private static Node arrayIntoLinkedlist(int[] arr) {
		Node head = new Node(arr[0]);
		Node mvr = head;
		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			mvr.next = temp;
			mvr = temp;
		}
		return head;
	}

	private static int findlengthOfList(Node head) {
		int cnt = 0;
		Node tmp = head;
		while (tmp != null) {
			tmp = tmp.next;
			cnt++;
		}
		return cnt;
	}

	private static int isElementPresent(Node head, int item) {
		Node tmp = head;
		while (tmp != null) {
			if (tmp.data == item) {
				return 1;
			}
			tmp = tmp.next;
		}
		return 0;
	}
}

class Node {
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Node(int data1) {
		this.data = data1;
		this.next = null;
	}
}