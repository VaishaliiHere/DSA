class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode middle = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        middle = slow.next;
        ListNode first = head;
        
        ListNode last = slow.next;
        slow.next = null;
        last = reverseList(last);

        while (last != null) {
            ListNode firstnext = first.next;
            ListNode lastnext = last.next;

            first.next = last;
            last.next = firstnext;

            first = firstnext;
            last = lastnext;
        }

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev one step forward
            current = next; // Move current one step forward
        }

        return prev; // New head of the reversed list
    }
}