package com.altafjava.main;

import com.altafjava.sll.CircularSinglyLinkedList;

public class CSLLOperation {

	public static void main(String[] args) {
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		csll.printCircularSinglyLinkedList();

		csll.insertAtFirst(10);
		csll.insertAtFirst(20);
		csll.printCircularSinglyLinkedList();

		csll.insertAtLast(30);
		csll.insertAtLast(40);
		csll.printCircularSinglyLinkedList();
		
		csll.insertAtPosition(50, 3);
		csll.insertAtPosition(60, 2);
		csll.printCircularSinglyLinkedList();
		
		csll.deleteAtFirst();
		csll.printCircularSinglyLinkedList();

		csll.deleteAtLast();
		csll.printCircularSinglyLinkedList();
		
		csll.deleteAtPosition(2);
		csll.printCircularSinglyLinkedList();
	}

}
