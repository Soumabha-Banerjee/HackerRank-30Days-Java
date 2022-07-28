// QS Link: https://www.hackerrank.com/challenges/30-interfaces/problem?isFullScreen=true

import java.util.*;

interface AdvancedArithmetic 
{
    int divisorSum(int n);
}

class Solution implements AdvancedArithmetic {

    // Here the method must be public
    public int divisorSum(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if( n%i == 0 )
                sum = sum + i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        Solution s = new Solution();
        int sum = s.divisorSum(num);
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(sum);
    }
}