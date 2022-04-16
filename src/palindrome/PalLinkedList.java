package palindrome;

import java.util.LinkedList;
import java.util.List;

public class PalLinkedList {
    public static void main(String[] args) {



      //  System.out.println(isPalindrome(list));
    }
    public static boolean isPalindrome(LinkedList head) {
        LinkedList slow = head;
        LinkedList fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reversed(slow);
        fast = head;
        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    public static class LinkedList{
        int val;
        LinkedList next;
        LinkedList(int x) {
            val = x;
        }
    }
    public static LinkedList reversed(LinkedList head) {
        LinkedList prev = null;
        while (head != null) {
            LinkedList next = head;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
