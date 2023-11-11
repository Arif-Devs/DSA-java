package twentyEight;



public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }    
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
            //step 1 >> create new node
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            //step 2 newNode next >> to head and >> linked to head
            newNode.next = head;
            // step 3 head >> new node
            head = newNode;
    }

        public void addLast(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //print all
         
        public void printAll() {
            if (head == null) {
                System.out.print("ll is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        //add index
        public void add(int idx, int data) {
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;
            while (i < idx - 1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
         
        //remove first
        public int removeFirst() {
            if (size == 0) {
                System.out.println("ll is empty");
            } else if (size ==1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(3);
            ll.addLast(4);
            ll.add(2, 9);
            ll.removeFirst();
            ll.printAll();
            System.out.println(ll.size );
        }
        
    }
    

