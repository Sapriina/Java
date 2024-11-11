 class Node {
        String name;
        int value;
        Node next;

        public Node(String name, int value) {
            this.name = name;
            this.value = value;
            this.next = null;
        }
    }

    public class LinkedListExample {
        Node head;

        public void addNode(String name, int value) {
            Node newNode = new Node(name, value);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void keepFirstAndLast() {
            if (head == null || head.next == null) return;

            Node current = head;
            while (current.next.next != null) {
                current.next = current.next.next;
            }
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.println("Name: " + current.name + ", Value: " + current.value);
                current = current.next;
            }
        }

        public static void main(String[] args) {
            LinkedListExample list = new LinkedListExample();

            // Adding nodes as per your diagram (example names and values)
            list.addNode("Sapariin", 400);
            list.addNode("Aadan", 300);
            list.addNode("cabdullahi", 200);
            list.addNode("C.qani", 200);
            list.addNode("Caasho", 200);
            list.addNode("Cabeey", 200);
            list.addNode("shukri", 200);
            list.addNode("Maryamo", 200);

            System.out.println("Original List:");
            list.printList();

            // Keeping only the first and last nodes
            list.keepFirstAndLast();

            System.out.println("\nAfter Removing Intermediate Nodes:");
            list.printList();
        }
    }

