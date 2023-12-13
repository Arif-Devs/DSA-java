



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
                return Integer.MIN_VALUE;
            } else if (size == 1) {
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
        
        //remove last
        public int removeLast() {
            if (size == 0) {
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;

            return val;
        }
        //search

        public int inrSearch(int key) {
            Node temp = head;
            int i = 0;

            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }
       

        //Recursive search -> O(n)
        public int helper(Node head, int key) {
            if (head == null) {
                return -1;
            }
            if (head.data == key) {
                return 0;
            }
            int idx = helper(head.next, key);
            if (idx == -1) {
                return -1;
            }

            return idx + 1;
        }
        
        public int recSearch(int key) {
            return helper(head, key);
       }
            
       //reverse -> O(n)
       public void printReverse() {
           Node prev = null;
           Node carr = tail = head;
           Node next;
           while (carr != null) {
               next = carr.next;
               carr.next = prev;
               prev = carr;
               carr = next;
           }
           head = prev;
       }
        
       //remove nth
       public void removeNth(int n) {
           int sz = 0;
           Node temp = head;
           while (temp != null) {
               temp = temp.next;
               sz++;
           }
           if (n == sz) {
               head = head.next;
               return;
           }
           int i = 1;
           int iToFind = sz - n;
           Node prev = head;
           while (i < iToFind) {
               prev = prev.next;
               i++;
           }
           prev.next = prev.next.next;
           return;
       }
       
       // ------------------------------Merge Shot in Linked List---------------------------------
       private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        if (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2 != null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            return mergedll.next;
    }
   
    public Node mergeShot(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        //find mid
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeShot(head);
        Node newRight = mergeShot(rightHead);
        return merge(newLeft, newRight);
    }
      
        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            
            // ll.addFirst(2);
            // ll.addFirst(1);
            // ll.addLast(3);
            // ll.addLast(4);
           // ll.add(2, 9);
            //ll.removeFirst();
            //ll.printAll();
            //ll.removeNth(3);
            //ll.printReverse();
           // ll.printAll();
           // System.out.println(ll.size);
           // System.out.println(ll.inrSearch(20));
           //System.out.println(ll.recSearch(4));
           //---------------marge shot in linkedList---------------
           ll.addFirst(1);
           ll.addFirst(2);
           ll.addFirst(3);
           ll.addFirst(4);
           ll.addFirst(5);
           ll.printAll();
           ll.head = ll.mergeShot(ll.head);
           ll.printAll();
        } 
        
    }
    

