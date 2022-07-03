# Topic:
Topics covered in this question are `loop`, `if-else` and `string`
# Link:
https://www.hackerrank.com/challenges/30-review-loop/problem?isFullScreen=true
# Code:
```
import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Setting the scanner object:
        Scanner sc = new Scanner(System.in);
        
        // Taking the number of test cases input:
        int T = sc.nextInt();
        sc.nextLine();
        
        // Taking the for loop for test cases:
        for(int i1=0; i1<T; i1++) {
            // Taking the string input:
            String str = sc.nextLine();
            String evenStr = new String("");
            String oddStr = new String("");
            // For loop to calculate and print the result:
            for(int i2=0; i2<str.length(); i2++) {
                if( i2%2 == 0 )
                    evenStr = evenStr + str.charAt(i2);
                else
                    oddStr = oddStr + str.charAt(i2);
            }
            System.out.println(evenStr + " " + oddStr);
        }
        
    }
}

```
