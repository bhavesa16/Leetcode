class Node{
    int data;
    Node next;
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data){
        this.data=data;
        next=null;
    }
}
public class Linked_list {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find the middle node
        Node middleNode = middle_element(head);

        // Display the value of the middle node
        System.out.println("The middle node value is: " + middleNode.data);

        Node head1 = new Node(3);
        Node second = new Node(2);
        Node third = new Node(0);
        Node fourth = new Node(-4);

        // Create a loop from fifth to second
        head1.next = second;
        second.next = third;
        third.next = fourth;
        // This creates a loop
        fourth.next = second;

        System.out.println("is cycle present="+detect_cycle(head));
        System.out.println("is cycle present="+detect_cycle(head1));
    }

//    find the middle element of linked list
    static Node middle_element(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

//    detect the cycle in link list
    static boolean detect_cycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
