package LinkedList;


//Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 

// Example 1:


// Input: head = [1,2,2,1]
// Output: true
// Example 2:


// Input: head = [1,2]
// Output: false
 

// Constraints:

// The number of nodes in the list is in the range [1, 105].
// 0 <= Node.val <= 9



public class PalindromLinkedlist {
    
    public boolean isPalindrome(ListNode head) {
        ListNode one = head;
        ListNode second = head;
        ListNode prev = null;

        
        while (second  != null && second.next != null) {
            one = one.next;
            second  = second.next.next;
        }

        while (one != null) {
            ListNode nextNode = one.next;
            one.next = prev;
            prev = one;
            one = nextNode;
        }

        while (prev != null) {
            if (head.val != prev.val) {
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        PalindromLinkedlist p = new PalindromLinkedlist();
        if(p.isPalindrome(head)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("False");
        }
    }
}
