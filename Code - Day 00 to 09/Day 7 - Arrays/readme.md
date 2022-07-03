# Topic:
Topics covered in this question is `arrays`
# Link:
https://www.hackerrank.com/challenges/30-arrays/problem?isFullScreen=true
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        for(int i=n-1; i>=0; i--)
            System.out.printf("%d ", arr[i]);
    }
}

```
