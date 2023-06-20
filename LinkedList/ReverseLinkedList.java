package LinkedList;

// Q: Given the head of a singly linked list, reverse the list, and return the reversed list.

// Example 1:
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]

// Example 2:
// Input: head = [1,2]
// Output: [2,1]

// Example 3:
// Input: head = []
// Output: []
 
// Constraints:
// The number of nodes in the list is the range [0, 5000].
// -5000 <= Node.val <= 5000
 
// Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {
    // iteratively Approch to reverse a linkedList
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while(curr !=null){
            ListNode nextNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextNode;
        }
        return pre;
    }

    // Recursive Solution to Reverse a linkedlist
    public ListNode reverseListR(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reversedList = reverseListR(head.next);

        head.next.next = head;
        head.next = null;

        return reversedList;

    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode reversedList = solution.reverseList(head);

        // Print the reversed list: 5 -> 4 -> 3 -> 2 -> 1
        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
}