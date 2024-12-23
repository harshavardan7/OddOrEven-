import java.util.Scanner;

public class deleteNodeLL {
    
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

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) { 
            head = newNode;
            tail = newNode;
        } else { 
            tail.next = newNode;
            tail = newNode;
        }
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
    
    public void deleteNode(int value) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        if (head.data == value) {
            head = head.next;
            return;
        }
        
        Node current = head;
        Node previous = null;
        
        while (current != null && current.data != value) {
            previous = current;
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Node with value " + value + " not found.");
            return;
        }
        
        previous.next = current.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        deleteNodeLL list = new deleteNodeLL(); 
        
        System.out.println("Enter the number of nodes you want to add:");
        int n = sc.nextInt(); 
        
        System.out.println("Enter the values of the nodes:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt(); 
            list.addNode(val);
        }
        
        System.out.println("The linked list is:");
        list.printLinkedList();
        
        System.out.println("Enter the value of the node to delete:");
        int deleteValue = sc.nextInt();
        list.deleteNode(deleteValue);
        
        System.out.println("The linked list after deletion is:");
        list.printLinkedList(); 
        
        list.reverse();
        System.out.println("The reversed linked list is:");
        list.printLinkedList(); 
        
        sc.close(); 
    }
}
