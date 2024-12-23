import java.util.Scanner;

public class linkedlist {
    
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist list = new linkedlist(); 
        
        System.out.println("Enter the number of nodes you want to add:");
        int n = sc.nextInt(); 
        
        System.out.println("Enter the values of the nodes:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt(); 
            list.addNode(val);
        }
        
        System.out.println("The linked list is:");
        list.printLinkedList();
        
        list.reverse();
        System.out.println("The reversed linked list is:");
        list.printLinkedList(); 
        
        sc.close(); 
    }
}
