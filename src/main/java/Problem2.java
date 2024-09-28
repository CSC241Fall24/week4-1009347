
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list

        ListNode newNode = new ListNode(val);


        if (position == 1 || head == null) {
            newNode.next = head;
            return newNode;
        }

        ListNode current = head;
        int currentPosition = 1;


        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
 
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        } else {
  
            newNode.next = current.next;
            current.next = newNode;
        }

        return head;  // Return the updated head of the list
    }


    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method for testing the insert function
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        System.out.print("Original list: ");
        printList(head);


        head = insert(head, 4, 2);  

        System.out.print("Updated list: ");
        printList(head);
        //return null;
    }
}
