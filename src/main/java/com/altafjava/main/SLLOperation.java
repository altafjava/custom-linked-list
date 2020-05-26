package com.altafjava.main;

import com.altafjava.sll.SinglyLinkedList;

public class SLLOperation {

	public static void main(String[] args) {
		SinglyLinkedList singleLinkedList = new SinglyLinkedList();
		singleLinkedList.printSingleLinkedList();

		singleLinkedList.insertAtFirst(10);
		singleLinkedList.printSingleLinkedList();

		singleLinkedList.insertAtFirst(20);
		singleLinkedList.insertAtFirst(30);
		singleLinkedList.insertAtFirst(40);
		singleLinkedList.printSingleLinkedList();

		singleLinkedList.insertAtLast(50);
		singleLinkedList.insertAtLast(60);
		singleLinkedList.printSingleLinkedList();

		singleLinkedList.insertAtPosition(70, 3);
		singleLinkedList.printSingleLinkedList();

		singleLinkedList.deleteAtFirst();
		singleLinkedList.printSingleLinkedList();

		singleLinkedList.deleteAtLast();
		singleLinkedList.printSingleLinkedList();

		singleLinkedList.deleteAtPosition(4);
		singleLinkedList.printSingleLinkedList();

	}

}
