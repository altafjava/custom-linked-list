package com.altafjava.main;

import com.altafjava.dll.CircularDoublyLinkedList;

public class CDLLOperation {

	public static void main(String[] args) {
		CircularDoublyLinkedList cdll=new CircularDoublyLinkedList();
		cdll.printHeadToTail();
		
		cdll.insertAtFirst(10);
		cdll.insertAtFirst(20);
		cdll.printHeadToTail();
		
		cdll.insertAtLast(30);
		cdll.insertAtLast(40);
		cdll.printHeadToTail();
		
		cdll.insertAtPosition(50, 3);
		cdll.insertAtPosition(60, 2);
		cdll.printHeadToTail();
		
		cdll.deleteAtFirst();
		cdll.printHeadToTail();
		
		cdll.deleteAtLast();
		cdll.printHeadToTail();
		
		cdll.deleteAtPosition(3);
		cdll.printHeadToTail();
		cdll.printTailToHead();
	}
}
