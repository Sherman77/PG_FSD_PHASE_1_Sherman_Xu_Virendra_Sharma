//Case study:  create a linked-list in which you have to qdd the elements according the conditions below:
// (1) addBegin(10)
// (2) addLast(45)
// (3) addBegin(88)
// (4) addLast(34)
// (5) addAfter(40,88)
// (6) addAfter(77,34)
// and then traverse the list to print the list

package DataStructure;

public class CaseStudy {

    class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        this.head = newNode;
        this.tail = newNode;
    }

    public void addBegin(int data) {
        if (this.head == null) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = this.head;
            this.head.previous = newNode;
            this.head = newNode;
        }
    }

    public void addLast(int data) {
        if (this.tail == null) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            newNode.previous = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public void addAfter(int data, int target) {
        Node current = this.head;
        while (current != null) {
            if (current.data == target) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                if (current.next != null) {
                    current.next.previous = newNode;
                }
                current.next = newNode;
                newNode.previous = current;
                return;
            }
            current = current.next;
        }
        System.out.println("Did not find the target value");
    }

    public void traverse() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }


    public static void main(String[] args) {
        CaseStudy cs = new CaseStudy();
        cs.addBegin(10);
        cs.addLast(45);
        cs.addBegin(88);
        cs.addLast(34);
        cs.addAfter(40, 88);
        cs.addAfter(77, 34);
        cs.traverse();
    }

}
