// QS Link: https://www.hackerrank.com/challenges/30-scope/problem?isFullScreen=true

import java.util.*;

class Difference
{
    int[] elements;
    int maximumDifference;
    
    public Difference(int[] nums) {
        this.elements = nums;
    }

    public void computeDifference() {
        Arrays.sort(elements);
        // The given array is always sorted so last-fast gives tha max diff
        maximumDifference = Math.abs(elements[0] - elements[elements.length - 1]);
    }
}

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        Difference d = new Difference(arr);
        d.computeDifference();
        System.out.println(d.maximumDifference);
    }
}