/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null)return head;
        return flat(head)[0];
    }
    public static Node[] flat(Node head){
        Node [] pp = new Node[2];
        pp[0]=head;pp[1]=head;
        Node p=head;
        while(p.next!=null&&p.child==null)p=p.next;    
        if(p.child!=null){
            Node temp=p.next;
            Node[] ans= flat(p.child);
            p.child=null;
            p.next=ans[0];ans[0].prev=p;
            if(temp!=null)temp.prev=ans[1];ans[1].next=temp;
        }
        while(p.next!=null)p=p.next;
        pp[1]=p;
        return pp;
    }
}
