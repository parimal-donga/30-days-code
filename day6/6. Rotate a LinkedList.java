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
    public ListNode rotateRight(ListNode head, int k) {
        //removes extra calculations & nulls
        int n=len(head);
        if(n<2)return head;
        k=(n-k%n)%n;
        if(k==0)return head;
        
        ListNode ptr=head;
        while(k-->1)ptr=ptr.next;
        
        ListNode temp= ptr.next;
        ListNode ans= ptr.next;
        while(temp.next!=null)temp=temp.next;
        
        temp.next=head;
        ptr.next=null;
        return ans;
    }
    public static int len(ListNode head){
        int i=0;
        while(head!=null){
            head=head.next;i++;
        }
        return i;
    }
}
