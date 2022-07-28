# Topic:
Topics covered in this question are `Queues` and `Stacks`
# Link:
 https://www.hackerrank.com/challenges/30-queues-stacks/problem?isFullScreen=true
# Code
```
import java.util.*;

class Solution {
Queue<Character> qe=new LinkedList<>();
Stack<Character> st=new Stack<>();
void pushCharacter(char c){
    st.push(c);
}
void enqueueCharacter(char c){
    // Adds element at last of the linkedlist
    qe.add(c);
}
char popCharacter(){
    return st.pop();
}
char dequeueCharacter(){
    // Remove elements at first of the linkedlist
    return qe.remove();
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        // Convert input String to an array of characters:
        char[] s = input.toCharArray();
        // Create a Solution object:
        Solution p = new Solution();
        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }
        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
```
