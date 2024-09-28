// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        
        if (l1 == null) return copyList(l2);
        if (l2 == null) return l1; 

       
        ListNode current = l1;
        while (current.next != null) {
            current = current.next;
        }
        
        ListNode temp = l2;
        while (temp != null) {
            current.next = new ListNode(temp.val);
            current = current.next;
            temp = temp.next;
        }

        return l1;
         //return null;
    }
    private static ListNode copyList(ListNode head) {
        if (head == null) return null;
        ListNode newHead = new ListNode(head.val);
        ListNode current = newHead;
        ListNode temp = head.next;

        while (temp != null) {
            current.next = new ListNode(temp.val);
            current = current.next;
            temp = temp.next;
        }

        return newHead;
    }

   
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(1);
        
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(5);

        ListNode result = concatenate(l1, l2);

        printList(result);
    }
    
}
