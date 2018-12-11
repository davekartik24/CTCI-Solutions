/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class PalindromeWithNewList {
    public boolean isPalindrome(ListNode head) {
        
        ListNode focusedNode = head;
        
        ListNode headNodeNewList = null;
        
        int listLength = 0;
        
        int toSkip = 0;
        
        
        while(focusedNode != null) {
            
            listLength++;
            focusedNode = focusedNode.next;
        }
        
        if(listLength % 2 == 0) {
            
            toSkip = listLength / 2;
            
        } else {
            
            toSkip = (listLength / 2) + 1; 
            
        }
        
        
        focusedNode = head;
        
        for(int i = 0; i < toSkip; i++) {
            
            focusedNode = focusedNode.next;
        }
        
        while(focusedNode != null) {
            
            ListNode tempNode = focusedNode;
            focusedNode = focusedNode.next;
            
            if(headNodeNewList == null) {
                
                headNodeNewList = tempNode;
                tempNode.next = null;
                
            } else {

                tempNode.next = headNodeNewList;
                headNodeNewList = tempNode;  
            }            
        }
        
        focusedNode = head;
        
        while(headNodeNewList != null) {
            
            // System.out.println(headNodeNewList.val);
            if(focusedNode.val != headNodeNewList.val) return false;
            
            headNodeNewList = headNodeNewList.next;
            focusedNode = focusedNode.next;
        }
        
        return true;
    }
}