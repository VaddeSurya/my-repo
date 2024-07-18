

public class Linked {

    // Creation of LinkedList 
    public static class Node {
        int data;
        Node next;

        // Constructor for Node
        public Node(int data) {
            this.data = data;
            this.next = null; // Initialize the next pointer to null
        }
    }

    // Head and Tail pointers for LinkedList
    public static Node Head;
    public static Node Tail;
    public static int Size = 0; // Initialize the size to 0

    // Operations on LinkedList

    // 1. Add First: Adds a new node at the beginning of the LinkedList
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        
        if (Head == null) { // If the list is empty
            Head = Tail = newNode;
        } else {
            // Insert at the beginning
            newNode.next = Head;
            Head = newNode;
        }
        Size++; // Increment size
    }

    // 2. Add Last: Adds a new node at the end of the LinkedList
    public static void addLast(int data) {
        Node newNode = new Node(data);

        if (Head == null) {
            Head = Tail = newNode;
        } else {
            Tail.next = newNode;
            Tail = newNode;
        }
        Size++; // Increment size
    }

    // 3. Print: Prints the LinkedList
    public static void Print() {
        Node temp = Head;
        System.out.print("The Linked List is: ");
        while (temp != null) { 
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("\nSize of Linked List: " + Size); // Print size
    }

    // 4. Add in the middle
    public static void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = Head;
        int i = 0;

        while (i < idx - 1) { 
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        Size++; // Increment size
    }

    // 5 Remove in the first

    public static int removeFirst(){
        if (Size==0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if (Size ==1 ) {
            int val = Head.data;
            Head=Tail=null;
            return val;
        }

        int val = Head.data;
        Head=Head.next;
        Size--;
        return val;
    }

    // 6 Remove in the Last

    public static int removeLast(){
        if(Size==0){
            System.out.println("Linekd list is empty");
            return Integer.MIN_VALUE;
        }else if (Size == 1) {
            int val = Head.data;
            Head=Tail=null;
            Size--;
            return val;
        }

        //fidinf previous prev = Size-2
        Node Prev= Head;
        for (int i = 0; i < Size-2; i++) {
            Prev = Prev.next;
        }
        int val = Prev.next.data;
        Prev.next=null;
        Tail=Prev;
        Size--;
        return val;
        
    }

    public static void main(String[] args) {
        // Add elements to the LinkedList
        Linked.addFirst(10);
        Linked.addFirst(20);
        Linked.addLast(30);
        Linked.addLast(40);

        // Print the LinkedList
        System.out.println("Before adding in the middle:");
        Linked.Print();

        // Add in the middle
        Linked.add(2, 25);

        // Print the LinkedList again
        System.out.println("After adding in the middle:");
        Linked.Print();

        //remove first element
        Linked.removeFirst();
        Linked.Print();

        // remove last element
        Linked.removeLast();
        Linked.Print();

    }
}
