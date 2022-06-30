# Topic:
Topics covered in this question are `conditional statements`, `if-else` and `modulo operator`
# Link:
https://www.hackerrank.com/challenges/30-conditional-statements/problem?isFullScreen=true
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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        if( n%2 != 0 )
            System.out.println("Weird");
        else if( n>=2 && n<=5 )
            System.out.println("Not Weird");
        else if( n>=6 && n<=20 )
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
    }
}


```
