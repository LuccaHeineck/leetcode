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
        // dummy is the start of the linked list
        ListNode dummy = new ListNode(0);

        // current guides the last node (the chain is kept alive in memory)
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // if carry > 10, 1 is carried over to the next sum, otherwise carry is 0
            carry = sum / 10;

            // creates new node and makes it the current one, the old one is kept in memory
            // module is used to get the last digit of the sum, which is the value of the new node
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        // dummy.next returns the first node in the list, which is linked to the last current node
        return dummy.next;
    }
}