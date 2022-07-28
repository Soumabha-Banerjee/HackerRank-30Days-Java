// QS Link: https://www.hackerrank.com/challenges/30-2d-arrays/problem?isFullScreen=true

//Importing necessary package:
import java.util.*;

// Main solution program:
class Solution {
    public static void main(String[] args) {
        // Declaring Scanner:
        Scanner sc = new Scanner(System.in);
        
        // Taking Input:
        int arr[][] = new int[6][6];
        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        // Finding the hourglasses and max sum:
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                // Getting the hourglass sum:
                currSum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                currSum += arr[i+1][j+1];
                currSum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                // Chacking for maximum:
                if( currSum > maxSum )
                    maxSum = currSum;
            }
        }
        
        //Printing the result:
        System.out.println(maxSum);
    }
}
