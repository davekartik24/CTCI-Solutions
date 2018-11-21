
import java.util.*;



class RemoveDupsUsingHashSet {

    public class ListNode {
        
        int val;
        ListNode next;
     
        public ListNode(int x) { 
            val = x; 
        }

        public boolean equals(Object input) {

            if(input instanceof ListNode) {

                ListNode inputNode = (ListNode)input;

                return this.val == inputNode.val;
            }

            return false;
        }


        public int hashCode() {

            return new Integer(val).hashCode();
        }

    }


    public ListNode deleteDuplicates(ListNode head) {
        
        HashSet<ListNode> buffer = new HashSet<>();

        ListNode focusedNode = head;

        ListNode previousNode = null;

        while(focusedNode != null) {

            if(!buffer.add(focusedNode)) {

                if(previousNode == null) {

                    head = focusedNode.next;
                } else {

                    previousNode.next = focusedNode.next;
                }

                focusedNode = focusedNode.next;
          
            } else {

                previousNode = focusedNode;

            }

            focusedNode = focusedNode.next;
        }

        return head;
        
    }
}