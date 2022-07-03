# Topic:
Topics covered in this question are `binary`, `integer to binary convert` and `character array`
# Link:
https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=true
# Code:
```
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        char[] binary = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        int max = 0;
        for(int i=0; i<binary.length; i++) {
            if( binary[i] == '0' )
                count = 0;
            else
                count++;
            
            if( max<count )
                max = count;
        }
        System.out.println(max);
    }
}

```
