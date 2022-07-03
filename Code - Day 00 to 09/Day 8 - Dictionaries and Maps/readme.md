# Topic:
Topics covered in this question is `hashmaps`, `unknown no of inputs` and `hasNextLine`
# Link:
https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem?isFullScreen=true
# Code:
```
import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
        Your class should be named Solution. */
        HashMap<String, String> map = new HashMap();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i < n; i++) {
            String phoneBookEntry = sc.nextLine();
            String[] str = phoneBookEntry.split(" ");
            map.put(str[0], str[1]);
        }
        
        String name;
        while( sc.hasNextLine() ) {
            name = sc.nextLine();
            if( !(map.containsKey(name)) )
                System.out.println("Not found");
            else
                System.out.println(name + "=" + map.get(name));
        }
    }
}

```
