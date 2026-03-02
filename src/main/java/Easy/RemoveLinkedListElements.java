package Easy;

public class RemoveLinkedListElements {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.print("Original list: ");
        printList(head);

        // Remove elements with value 6
        ListNode result = removeElements(head, 6);

        // Print modified list
        System.out.print("After removing 6: ");
        printList(result);


    }


    public static ListNode removeElements(ListNode head, int val) {
        // Remove all leading nodes with target value
        while (head != null && head.val == val) {
            head = head.next;
        }

        // If list becomes empty
        if (head == null) return null;

        ListNode curr = head;

        while (curr.next != null) {
            if (curr.next.val == val) {
                // Skip the next node
                curr.next = curr.next.next;
            } else {
                // Move to next node
                curr = curr.next;
            }
        }

        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" -> null");
    }


}



