// QS Link: https://www.hackerrank.com/challenges/30-nested-logic/problem?isFullScreen=true

import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int dueDate = sc.nextInt();
        int dueMonth = sc.nextInt();
        int dueYear = sc.nextInt();
        sc.close();
        
        int fine = 0;
        int diff = 0;
        if( year < dueYear ) {
            fine = 0;
        } else if( year == dueYear ) {
            if( month < dueMonth ) {
                fine = 0;
            } else if( month == dueMonth ) {
                if( date <= dueDate ) {
                    fine = 0;
                } else {
                    diff = date - dueDate;
                    fine = 15 * diff;
                }
            } else {
                diff = month - dueMonth;
                fine = 500 * diff;
            }
        } else {
            fine = 10000;
        }
        System.out.println(fine);
    }
}
