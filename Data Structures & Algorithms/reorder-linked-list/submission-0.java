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
    public void reorderList(ListNode head) {
           //find middle
           ListNode fast = head;
           ListNode slow = head;

           ListNode startFirst = head;

           while(fast != null && fast.next != null)
           {
            fast = fast.next.next;
            slow = slow.next;
           }

           ListNode startSecond = slow.next;

           //reverse second half of LL

           ListNode second = startSecond;
           ListNode prev = null;


           while(second != null)
           {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
           }
           startSecond = prev;

           slow.next = null;

           //linking

           while(startFirst != null && startSecond != null)
           {
            ListNode oneNext = startFirst.next;
            startFirst.next = startSecond;
            ListNode secNext = startSecond.next;
            startSecond.next = oneNext;
            startSecond = secNext;
            startFirst = oneNext;

           }
       
    }
}
