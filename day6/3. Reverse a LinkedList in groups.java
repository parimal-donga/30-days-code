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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)return null;
        ListNode ans = head;
        int i=k-1;
        while(ans.next!=null&&i-->0){
            ans=ans.next;
        }
        if(ans.next==null&&i>0){
            return head;
        }
        ListNode ans2=new ListNode();
        ans2=ans.next;
        ans.next=null;
        head=reverseList(head);
        i=k-1;
        ans=head;
        while(i-->0){
            ans=ans.next;
        }
        ans.next=reverseKGroup(ans2,k);
        return head;
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null)return null;
        ListNode ans = new ListNode ();
        ans.next=null;
        ans.val=head.val;
        head=head.next;
        ListNode ans2 = new ListNode ();
        while(head!=null){
            ans2=head.next;
            head.next=ans;
            ans=head;
            head=ans2;
        }        
        return ans;
    }
}
