# Topic:
Topics covered in this question are `String to Integer` and `Exception Handling`
# Link:
 https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem?isFullScreen=true
# Code:
```
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String S = bufferedReader.readLine();
            int a = Integer.parseInt(S);
            System.out.println(a);
        bufferedReader.close(); 
        } catch(Exception e) {
            System.out.println("Bad String");
        }
    }
}


```
