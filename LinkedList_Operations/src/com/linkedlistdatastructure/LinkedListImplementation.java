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
		/*System.out.println(findlengthOfList(head) + " is the length of the linkedlist");
		System.out.println("please enter the item to search");
		int item = sc.nextInt();
		if (isElementPresent(head, item) == 0) {
			System.out.println("the elemnt is not present");
		} else {
			System.out.println(item + " is found in the list");
		}
		
		  Node delete=deletion(head); print(delete);
		  System.out.println("head is removed"); Node tail=tailDeletion(head);
		  print(tail);
		 
		System.out.println("tail is removed");*/
		//Node kthHead=removekthElement(head ,2);
	    //print(kthHead);
		Node value=removekthValueElement(head ,2);
		print(value);
  	}


	private static void print(Node delete) {
      while(delete!=null) {
    	  System.out.print(delete.data+" ");
    	  delete= delete.next;
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
	private static Node deletion(Node head) {
		if(head==null) return head;
		head=head.next;
		return head;
	}
	private static Node tailDeletion(Node node) {
		if(node==null || node.next==null) return null;
		Node tmp = node;
		while(tmp.next.next!=null) {
			tmp = tmp.next;
		}
		tmp.next =null;
		return node;
	}
	private static Node removekthElement(Node head ,int k) {
		if(head==null) return head;
         if(k==1) {
         	 Node temp = head;
         	 return head;
          }
         Node tmp = head;
         Node prev= null;
         int cnt =0;
         while(tmp!=null) {
        	 cnt++;
        	 if(cnt==k) {
        		 prev.next = prev.next.next;
        		 break;
        	 }
        	 prev= tmp;
        	 tmp=tmp.next;
         }
         return head;
	}
	private static Node removekthValueElement(Node head ,int value) {
		if(head==null) return head;
        if(head.data==1) {
        	 Node temp = head;
        	 return head;
         }
        Node tmp = head;
        Node prev= null;
        while(tmp!=null) {
       	 if(tmp.data==value) {
       		 prev.next = prev.next.next;
       		 break;
       	 }
       	 prev= tmp;
       	 tmp=tmp.next;
        }
        return head;
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