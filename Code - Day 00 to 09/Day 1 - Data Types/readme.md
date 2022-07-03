# Topic:
Topics covered in this question are `data types` and `taking inputs`
# Link:
https://www.hackerrank.com/challenges/30-data-types/problem?isFullScreen=true
# Code:
```
import java.util.*;

class Solution {

    public static void main(String[] args) {
        // Declare system 3 varianles:
        int i = 4;
        double d = 4.0;
        String str = "HackerRank";
        
        // Declare my 3 variables:
        int myI;
        double myD;
        String myStr;
        
        //Setting Scanner object to take input:
        Scanner sc = new Scanner(System.in);
        //Taking the intiger input:
        myI = sc.nextInt();
        //Taking the double input:
        myD = sc.nextDouble();
        //Taking the string input:
        myStr = sc.nextLine();
        myStr = sc.nextLine();
        
        //Printing the outputs:
        System.out.println(i + myI);
        System.out.println(d + myD);
        System.out.println(str + " " + myStr);
        
    }
}

```
