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
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        ListNode ans = new ListNode ();
        ans.next=null;
        ans.val=head.val;
        head=head.next;
        while(head!=null){
            ListNode ans2 = new ListNode (head.val,ans);
            head=head.next;
            ans=ans2;
        }
        
        return ans;
    }
}
