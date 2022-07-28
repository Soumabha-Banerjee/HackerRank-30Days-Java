# Topic:
Topics covered in this question are `Throw Custom Exception` and `Exception Handling`
# Link:
 https://www.hackerrank.com/challenges/30-more-exceptions/problem?isFullScreen=true
# Code:
```
import java.util.*;

class Calculator
{
    void pow(int n, int p) {
        try {
            int result = 1;
            if( n<0 || p<0 )
                throw new Exception(); 
            else {
                for(int i=0; i<p; i++)
                    result = result*n;
            }
            System.out.println(result);
        } catch(Exception e) {
            System.out.println("n and p should be non-negative");
        }
    }
}

class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            c.pow(n, p);
        }
        sc.close();
    }
}

```
