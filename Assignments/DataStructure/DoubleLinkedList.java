package DataStructure;

public class DoubleLinkedList {

    class Node {
        int data;
        Node previous = null;
        Node next = null;

        public Node(int data) {
            this.data = data;

        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = tail;
            tail.previous = head;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = tail.next;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.addNode(1);
        dl.addNode(2);
        dl.addNode(3);
        dl.addNode(4);
        dl.display();

    }
}
