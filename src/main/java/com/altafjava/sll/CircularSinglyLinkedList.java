package com.altafjava.sll;

import com.altafjava.sll.Node;

public class CircularSinglyLinkedList {
	private Node head;
	private Node tail;
	private int size;

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insertAtFirst(int value) {
		Node node = new Node(value, null);
		size++;
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.setNext(head);
			head = node;
			tail.setNext(head);
		}
	}

	public void insertAtLast(int value) {
		Node node = new Node(value, null);
		size++;
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
			tail.setNext(head);
		}
	}

	public void insertAtPosition(int value, int position) {
		if (position < 1) {
			System.out.println("Not valid position: Position should be a Natural number");
		} else if (position == 1) {
			insertAtFirst(value);
		} else if (position == size + 1) {
			insertAtLast(value);
		} else if (position > size + 1) {
			System.out.println("Not valid position: Total size is " + size);
		} else {
			Node node = new Node(value, null);
			Node currentNode = head;
			for (int i = 2; i < position; i++) {
				currentNode = currentNode.getNext();
			}
			node.setNext(currentNode.getNext());
			currentNode.setNext(node);
			size++;
		}
	}

	public void deleteAtFirst() {
		if (size == 0) {
			System.out.println("No data available to delete");
		} else if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.getNext();
			tail.setNext(head);
			size--;
		}
	}

	public void deleteAtLast() {
		if (size == 0) {
			System.out.println("No data available to delete");
		} else if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			Node currentNode = head;
			for (int i = 2; i < size; i++) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(head);
			tail = currentNode;
			size--;
		}
	}

	public void deleteAtPosition(int position) {
		if (position < 1) {
			System.out.println("Not valid position: Position should be a Natural number");
		} else if (position == 1) {
			deleteAtFirst();
		} else if (position == size) {
			deleteAtLast();
		} else if (position > size) {
			System.out.println("Not valid position: Total size is " + size);
		} else {
			Node currentNode = head;
			Node previousNode = null;
			for (int i = 1; i < position; i++) {
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
			previousNode.setNext(currentNode.getNext());
			size--;
		}
	}

	public void printCircularSinglyLinkedList() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		if (size == 0) {
			sb.append("}");
		} else if (head.getNext() == null) {
			sb.append(head.getValue());
			sb.append("}");
		} else {
			Node currentNode = head;
			do {
				sb.append(currentNode.getValue());
				currentNode = currentNode.getNext();
				sb.append(currentNode == head ? "" : ",");
			} while (currentNode != head);
			sb.append("}");
		}
		System.out.println(sb.toString());
	}
}
