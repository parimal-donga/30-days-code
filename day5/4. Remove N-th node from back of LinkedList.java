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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return null;
        int i=1;
        ListNode temp=head;
        while(temp.next!=null){temp=temp.next;i++;}
        n=i-n;
        i=0;
        temp=head;
        if(n==0)return head.next;
        while(i++<n-1)temp=temp.next;
        temp.next=temp.next.next;
        return head;
    }
}
