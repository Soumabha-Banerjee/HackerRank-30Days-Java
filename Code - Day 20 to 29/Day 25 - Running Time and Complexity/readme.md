# Topic:
Topics covered in this question are `Time Complexity`, `O(√n)` and `Check Prime or Not-Prime`
# Link:
 https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem?isFullScreen=true
# Code
```
import java.util.*;

class Solution {

    static void prime(int n)
    {
        boolean flag=false;
        // Time Complexity: O(n)
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                flag=true;
                break;
            }
        }
        if(n==1){
            System.out.println("Not prime");
        }
        else if(!flag){
            System.out.println("Prime");
        }
        
        else{
            System.out.println("Not prime");
        }
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t--!=0)
    {
        int n=sc.nextInt();
        prime(n);
    }
    sc.close();
    }
    }
```