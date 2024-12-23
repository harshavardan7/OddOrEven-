import java.util.LinkedList;
import java.util.Scanner;

public class LLoperation {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;  
    private Node tail = null;  

    public void addNodeAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) { 
            head = newNode;
            tail = newNode;
        } else { 
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public void addNodeAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void addNodeAtPosition(int data, int position) {
        if (position == 0) {
            addNodeAtBegin(data);
            return;
        }
        
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Position out of range.");
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    
    public void deleteNodeAtBegin() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }
    
    public void deleteNodeAtEnd() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }
    
    public void deleteNodeAtPosition(int position) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        if (position == 0) {
            deleteNodeAtBegin();
            return;
        }
        Node current = head;
        Node previous = null;
        for (int i = 0; i < position && current != null; i++) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of range.");
            return;
        }
        previous.next = current.next;
        if (current.next == null) {
            tail = previous;
        }
    }
    
    public boolean searchNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }
    
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLoperation list = new LLoperation(); 
        
        System.out.println("Enter the number of nodes you want to add:");
        int n = sc.nextInt(); 
        
        System.out.println("Enter the values of the nodes to add at the end:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt(); 
            list.addNodeAtEnd(val);
        }
        
        System.out.println("The linked list is:");
        list.printLinkedList();
        
        System.out.println("Enter a value to search in the linked list:");
        int searchVal = sc.nextInt();
        boolean found = list.searchNode(searchVal);
        System.out.println("Value " + searchVal + (found ? " is found in the list." : " is not found in the list."));
        
        sc.close(); 
    }
}