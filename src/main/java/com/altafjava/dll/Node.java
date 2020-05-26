package com.altafjava.dll;

public class Node {
	private Node prev;
	private int value;
	private Node next;

	public Node() {
	}

	public Node(Node prev, int value, Node next) {
		this.prev = prev;
		this.value = value;
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
