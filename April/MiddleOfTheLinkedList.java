/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
//         odd fast pointer +2, slow +1
//         even fast pointer +1, slow +1
        ListNode fast = head, slow = head;
        while(fast.next != null) {
            fast = fast.next;
            if(fast.next==null) return slow.next;
            else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        
        return slow;
    }
}