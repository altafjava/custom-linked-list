package com.altafjava.main;

import com.altafjava.dll.DoublyLinkedList;

public class DLLOperation {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.printHeadToTail();

		dll.insertAtFirst(10);
		dll.printHeadToTail();

		dll.insertAtFirst(20);
		dll.printHeadToTail();

		dll.insertAtLast(30);
		dll.printHeadToTail();

		dll.insertAtLast(40);
		dll.printHeadToTail();
		dll.printTailToHead();

		dll.insertAtPosition(50, 3);
		dll.printHeadToTail();

		dll.deleteAtFirst();
		dll.printHeadToTail();
		
		dll.deleteAtLast();
		dll.printHeadToTail();

		dll.deleteAtPosition(2);
		dll.printHeadToTail();
	}
}
