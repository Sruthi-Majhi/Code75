/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, ans = 0;
     ListNode prev = new ListNode(-1);
        ListNode head = prev;

        while(l1 != null && l2 != null)
        {
            ans = l1.val + l2.val + carry;
            ListNode newOne = new ListNode(ans % 10);
            carry = ans / 10;
            prev.next = newOne;
            prev = newOne;
            l1 = l1.next;
            l2 = l2.next; 
        }

        while(l1 != null)
        {
            ans = l1.val + carry;
            ListNode newOne = new ListNode(ans % 10);
            carry = ans / 10;
            prev.next = newOne;
            prev = newOne;
            l1 = l1.next;

        }

         while(l2 != null)
        {
            ans = l2.val + carry;
            ListNode newOne = new ListNode(ans % 10);
            carry = ans / 10;
            prev.next = newOne;
            prev = newOne;
            l2 = l2.next;

        }

        if(carry == 1)
        {
            ListNode newOne = new ListNode(1);
            prev.next = newOne;

        }
        

        return head.next;
    }
}
