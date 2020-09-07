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
        return ok(l1,l2,0);
    }
    public static ListNode ok(ListNode l1, ListNode l2, int n){
        if(l1.next==null || l2.next==null){
            n=n+l1.val+l2.val;
            l1.val= n%10;n=n/10;
            if(l1.next==null&&l2.next==null){
                if(n==0)return l1;
                ListNode temp= new ListNode(n);
                l1.next=temp;return l1;
            }
            if(l1.next==null){
                l2.val=l1.val;l1.val=0;
                if(n==0)return l2;
                l2.next=ok(l1,l2.next,n);
                return l2;
            }
            if(l2.next==null){
                l2.val=0;
                if(n==0)return l1;
                l1.next=ok(l1.next,l2,n);
                return l1;
            }
        }
        n=n+l1.val+l2.val;
        l1.val= n%10;
        l1.next=ok(l1.next,l2.next,n/10);
        return l1;
    }
}
