
class PalindromeWithReverse {
    public boolean isPalindrome(ListNode head) {

        public class ListNode {
            int val;
            ListNode next;
            ListNode(int x) { val = x; }
        }
        
        ListNode firstNode = head;
        
        ListNode secondNode = head;
        
        ListNode newList = null;
        
        int listLength = 0;
        
        
        while(head != null) {
            
            listLength++;
            head =  head.next;
        }
        
        if(listLength % 2 == 0) {
            
            for(int i = 0; i < (listLength / 2); i++) {
                
                secondNode = secondNode.next;
            }
                    
        } else {
            
            for(int i = 0; i < ((listLength / 2) + 1); i++) {
                
                secondNode = secondNode.next;
            }         
            
        }
        
        while(secondNode != null) {
            
            ListNode focusedNode = secondNode;
            
            if(newList == null) {
                
                newList = focusedNode;
        } else {
                
                focusedNode.next = newList;
                newList  = focusedNode;
            }
        
            secondNode = secondNode.next;
        }
        
        
        while(newList != null) {
            
            if(firstNode.val != newList.val) {
                
                return false;
            }
            
            newList = newList.next;
        }
        
        return true;
        
    }

    public static void main(String[] args)
}