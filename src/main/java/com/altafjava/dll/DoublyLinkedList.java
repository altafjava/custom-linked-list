package com.altafjava.dll;

public class DoublyLinkedList {
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
		size++;
		Node node = new Node(null, value, null);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			head.setPrev(node);
			node.setNext(head);
			head = node;
		}
	}

	public void insertAtLast(int value) {
		size++;
		Node node = new Node(null, value, null);
		if (tail == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			node.setPrev(tail);
			tail = node;
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
			size++;
			Node node = new Node(null, value, null);
			Node currentNode = head;
			for (int i = 2; i < position; i++) {
				currentNode = currentNode.getNext();
			}
			node.setPrev(currentNode);
			node.setNext(currentNode.getNext());
			currentNode.getNext().setPrev(node);
			currentNode.setNext(node);
		}
	}

	public void printHeadToTail() {
		StringBuilder sb = new StringBuilder();
		if (head == null) {
			sb.append("{}");
		} else {
			sb.append("{");
			Node currentNode = head;
			while (currentNode != null) {
				sb.append(currentNode.getValue());
				currentNode = currentNode.getNext();
				if (currentNode != null)
					sb.append(",");
			}
			sb.append("}");
		}
		System.out.println(sb.toString());
	}

	public void printTailToHead() {
		StringBuilder sb = new StringBuilder();
		if (tail == null) {
			sb.append("{}");
		} else {
			sb.append("{");
			Node currentNode = tail;
			while (currentNode != null) {
				sb.append(currentNode.getValue());
				currentNode = currentNode.getPrev();
				if (currentNode != null)
					sb.append(",");
			}
			sb.append("}");
		}
		System.out.println(sb.toString());
	}

	public void deleteAtFirst() {
		if (size == 0) {
			System.out.println("No data available to delete");
		} else if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {
			head = head.getNext();
			head.setPrev(null);
			size--;
		}
	}

	public void deleteAtLast() {
		if (size == 0) {
			System.out.println("No data available to delete");
		} else if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {
			tail = tail.getPrev();
			tail.setNext(null);
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
			for (int i = 1; i < position; i++) {
				currentNode = currentNode.getNext();
			}
			currentNode.getNext().setPrev(currentNode.getPrev());
			currentNode.getPrev().setNext(currentNode.getNext());
			size--;
		}
	}
}
