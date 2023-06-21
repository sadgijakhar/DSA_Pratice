package LinkedList;

public class MergeTwoLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(0);
        ListNode curr = merged;
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                curr.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            curr = curr.next;
        }
        
        while (list1 != null) {
            curr.next = new ListNode(list1.val);
            list1 = list1.next;
            curr = curr.next;
        }
        
        while (list2 != null) {
            curr.next = new ListNode(list2.val);
            list2 = list2.next;
            curr = curr.next;
        }
        
        return merged.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        MergeTwoLinkedList solution = new MergeTwoLinkedList();
        ListNode reversedList = solution.mergeTwoLists(list1,list2);

        // Print the reversed list: 5 -> 4 -> 3 -> 2 -> 1
        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
}
