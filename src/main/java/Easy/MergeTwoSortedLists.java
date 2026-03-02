package Easy;

public class MergeTwoSortedLists {


    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode mergedList = mergeTwoLists(list1, list2);

        // Output: [1, 1, 2, 3, 4, 4]
        printList(mergedList);


    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        // Iterate through both lists while there are elements in both
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;  // Move to the next node in list1
            } else {
                current.next = list2;
                list2 = list2.next;  // Move to the next node in list2
            }
            current = current.next;  // Move to the next node in the result list
        }

        // If any nodes are left in either list1 or list2, append them
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list starting from the next of the dummy node
        return dummy.next;

    }


    public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
